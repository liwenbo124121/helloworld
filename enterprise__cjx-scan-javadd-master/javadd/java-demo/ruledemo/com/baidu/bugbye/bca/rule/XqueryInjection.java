package rule;

import java.io.PrintWriter;
import java.sql.Connection;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQExpression;
import javax.xml.xquery.XQResultSequence;

public class XqueryInjection {
    public void bad1(HttpServletRequest request){
        XQDataSource ds= new MyXQDataSource();
        try {
            XQConnection conn = ds.getConnection();
            String query = "for $book in doc(books.xml)/bookstore/book[category='" + request.getParameter("category") + "'and adult='" +   request.getParameter("adult") + "'] return  $book";
            XQExpression expression =conn.createExpression();
            XQResultSequence res = expression.executeQuery(query);
        } catch (XQException e) {
            e.printStackTrace();
        }
    }

    public void bad2(HttpServletRequest request){
        XQDataSource ds= new MyXQDataSource();
        try {
            XQConnection conn = ds.getConnection();
            StringBuffer query = new StringBuffer("for $book in doc(books.xml)/bookstore/book[category='");
            query.append(request.getParameter("category"));
            query.append("'and adult='");
            query.append(request.getParameter("adult")) ;
            query.append("'] return  $book");
            XQExpression expression =conn.createExpression();
            expression.executeCommand(query.toString());
        } catch (XQException e) {
            e.printStackTrace();
        }
    }

    public void good1(HttpServletRequest request){
        String cate = request.getParameter("category");
        String sex = request.getParameter("adult");
        if (!verify(cate) || !verify(sex)) {
            return;
        }
        XQDataSource ds= new MyXQDataSource();
        try {
            XQConnection conn = ds.getConnection();
            String query =
                    "for $book in doc(books.xml)/bookstore/book[category='" + cate + "'and adult='" + sex + "'] "
                            + "return  $book";
            XQExpression expression =conn.createExpression();
            XQResultSequence res = expression.executeQuery(query);
        } catch (XQException e) {
            e.printStackTrace();
        }
    }

    class MyXQDataSource implements XQDataSource{

        @Override
        public XQConnection getConnection() throws XQException {
            return null;
        }

        @Override
        public XQConnection getConnection(Connection con) throws XQException {
            return null;
        }

        @Override
        public XQConnection getConnection(String username, String passwd) throws XQException {
            return null;
        }

        @Override
        public int getLoginTimeout() throws XQException {
            return 0;
        }

        @Override
        public PrintWriter getLogWriter() throws XQException {
            return null;
        }

        @Override
        public String[] getSupportedPropertyNames() {
            return new String[0];
        }

        @Override
        public void setProperty(String name, String value) throws XQException {

        }

        @Override
        public String getProperty(String name) throws XQException {
            return null;
        }

        @Override
        public void setProperties(Properties props) throws XQException {

        }

        @Override
        public void setLoginTimeout(int seconds) throws XQException {

        }

        @Override
        public void setLogWriter(PrintWriter out) throws XQException {

        }
    }

    private boolean verify(String aim){
        return true;
    }
}
