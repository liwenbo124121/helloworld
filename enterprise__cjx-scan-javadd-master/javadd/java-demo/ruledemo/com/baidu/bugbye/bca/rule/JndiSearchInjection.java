package rule;

import java.util.Hashtable;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;

public class JndiSearchInjection {
    public void bad1(HttpServletRequest request){
        try {
            String address = request.getParameter("address");
            Hashtable<String, String> props = new Hashtable<>();
            InitialContext initialContext = new InitialContext(props);
            initialContext.lookup(address);
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public void bad2(HttpServletRequest request){
        try {
            String address = request.getParameter("address");
            Hashtable<String, String> props = new Hashtable<>();
            InitialContext initialContext = new InitialContext(props);
            StringBuffer sb = new StringBuffer(address);
            sb.append("123");
            initialContext.lookup(sb.toString());
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public void good1(HttpServletRequest request){
        try {
            String address = request.getParameter("address");
            Hashtable<String, String> props = new Hashtable<>();
            InitialContext initialContext = new InitialContext(props);
            if (!verify(address)) {
                return;
            }
            StringBuffer sb = new StringBuffer(address);
            sb.append("123");
            initialContext.lookup(sb.toString());
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    private boolean verify(String aim){
        return true;
    }
}
