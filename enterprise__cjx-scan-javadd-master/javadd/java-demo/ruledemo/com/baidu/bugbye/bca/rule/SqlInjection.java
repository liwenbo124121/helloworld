package rule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

public class SqlInjection {
    public void good1(HttpServletRequest request, char[] password) throws SQLException {
        Connection connection = getConnection();
        if (connection == null) {
            // handle error
        }
        try {
            String username = request.getParameter("username");
            String pwd = hashPassword(password);
            String sqlString = "select * from db_user where username=? and password=?";
            PreparedStatement stmt = connection.prepareStatement(sqlString);
            stmt.setString(1, username);
            stmt.setString(2, pwd);
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                throw new SecurityException("User name or password incorrect");
            }
            // Authenticated, proceed
        } finally {
            try {
                connection.close();
            } catch (SQLException x) {
                // forward to handler
            }
        }
    }

    public void good2(String param) {
        String param2 = "123";
        if (verify(param)) {
            param = "456";
        }
        param2 += param;
        String h = "DELETE FROM table WHERE a=" + param2;
    }

    public void good3(String param) {
        String param2 = null;
        if (verify(param)) {
            param2 = param + "123";
        }
        String f = new StringBuilder("INSERT INTO mytable SELECT * FROM ").append(param2).toString();
    }

    public void bad1(String param) {
        String a = "SELECT * FROM table WHERE a=" + param + " ORDER BY name LIMIT 1";
    }

    public void bad2(String param) {
        String param2 = param + "123";
        String b = "SELECT DISTINCT a,b,v FROM " + param2 + " INTO OUTFILE 'aaaa.txt";
    }

    public void bad3(String param) {
        String param2 = method(param);
        String c = "UPDATE table SET a=1,b=2 WHERE a=" + param2;
    }

    public void bad4(String param) {
        String param2 = method(param);
        String e = "INSERT INTO mytable(a, b, c) VALUES(" + method(param2) + ", 2, 3)";
    }

    public void bad5(String param) {
        String param2 = "123";
        param2 += param;
        String h = "DELETE FROM table WHERE a=" + param2;
    }

    public void bad6(String param) {
        String a = new StringBuilder("SELECT * FROM table WHERE a=")
                .append(param).append(" ORDER BY name LIMIT 1")
                .toString();
    }

    public void bad7(String param) {
        String b = new StringBuilder("SELECT DISTINCT a,b,v FROM ")
                .append(param).append(" INTO OUTFILE 'aaaa.txt")
                .toString();
    }

    public void bad8(String param) {
        String c = new StringBuilder("UPDATE table SET a=1,b=2 WHERE a=").append(param).toString();
    }

    public void bad9(String param) {
        String d = new StringBuilder("UPDATE table SET a=1,b=2 ORDER BY a LIMIT ").append(param).toString();
    }

    public void bad10(String param) {
        String e = new StringBuilder("INSERT INTO mytable(a, b, c) VALUES(").append(param).append(", 2, 3)").toString();
    }

    public void bad11(String param) {
        String f = new StringBuilder("INSERT INTO mytable SELECT * FROM ").append(param).toString();
    }

    public void bad12(String param) {
        String g = new StringBuilder("INSERT HIGH_PRIORITY INTO table SET a = ")
                .append(param)
                .append(", b = 2")
                .toString();
    }

    public void bad13(String param) {
        String h = new StringBuilder("DELETE FROM table WHERE a=").append(param).toString();
    }

    public void bad14(String param) {
        String i = new StringBuilder("DELETE FROM table ORDER BY a LIMIT ").append(param).toString();
    }

    public void bad15(String param) {
        String a = new StringBuffer("SELECT * FROM table WHERE a=")
                .append(param)
                .append(" ORDER BY name LIMIT 1")
                .toString();
    }

    public void bad16(String param) {
        String b = new StringBuffer("SELECT DISTINCT a,b,v FROM ")
                .append(param)
                .append(" INTO OUTFILE 'aaaa.txt")
                .toString();
    }


    public void bad17(String param) {
        String c = new StringBuffer("UPDATE table SET a=1,b=2 WHERE a=").append(param).toString();
    }

    public void bad18(String param) {
        String d = new StringBuffer("UPDATE table SET a=1,b=2 ORDER BY a LIMIT ").append(param).toString();
    }

    public void bad19(String param) {
        String e = new StringBuffer("INSERT INTO mytable(a, b, c) VALUES(").append(param).append(", 2, 3)").toString();
    }

    public void bad20(String param) {
        String f = new StringBuffer("INSERT INTO mytable SELECT * FROM ").append(param).toString();
    }

    public void bad21(String param) {
        String g = new StringBuffer("INSERT HIGH_PRIORITY INTO table SET a = ")
                .append(param)
                .append(", b = 2")
                .toString();
    }

    public void bad22(String param) {
        String h = new StringBuffer("DELETE FROM table WHERE a=").append(param).toString();
    }

    public void bad23(String param) {
        String i = new StringBuffer("DELETE FROM table ORDER BY a LIMIT ").append(param).toString();
    }

    private String method(String param) {
        return param + "123";
    }

    private String hashPassword(char[] password) {
        return String.valueOf(password);
    }

    private Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");  //注册数据库驱动
            String url = "jdbc:mysql://localhost:3306/test?user=root＆password=root";  //定义连接数据库的url
            con = DriverManager.getConnection(url);  //获取数据库连接
            // System.out.println("数据库连接成功！");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;  //返回一个连接
    }

    private boolean verify(String s) {
        return true;
    }
}
