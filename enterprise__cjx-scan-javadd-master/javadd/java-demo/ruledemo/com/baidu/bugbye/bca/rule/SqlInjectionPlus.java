package rule;

import java.sql.SQLException;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;

public class SqlInjectionPlus {
    public void bad1(String username, char[] password) throws SQLException {
        PersistenceManagerFactory pmf = JDOHelper.getPersistenceManagerFactory("jpox.properties");
        PersistenceManager p = pmf.getPersistenceManager();
        String pwd = hashPassword(password);
        String sqlString = "SELECT * FROM db_user WHERE username = '" + username + "' AND password = '" + pwd + "'";
        Query newQuery = p.newQuery(User.class,sqlString);
        Object object = newQuery.execute();
    }

    public void bad2(HttpServletRequest request, char[] password) throws SQLException {
        String username = request.getParameter("name");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPA");
        EntityManager em = emf.createEntityManager();
        String pwd = hashPassword(password);
        String sqlString = "SELECT * FROM db_user WHERE username = '" + username + "' AND password = '" + pwd + "'";
        javax.persistence.Query createQuery = em.createQuery(sqlString);
        Object singleResult = createQuery.getSingleResult();
    }

    public void bad3(String userName, Session session){
        String queryString = "from db_user where name like '%" + userName + "%' ";
        List result = session.createQuery(queryString).list();
    }

    public void good1(String userName, Session session){
        if (!verify(userName)) {
            return;
        }
        String queryString = "from db_user where name like '%" + userName + "%' ";
        List result = session.createQuery(queryString).list();
    }

    class User{
        private String name;
    }

    private String hashPassword(char[] password) {
        return String.valueOf(password);
    }

    private boolean verify(String s) {
        return true;
    }
}
