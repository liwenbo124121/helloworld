package rule;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class BeanInjectionCheck {
    public void bad1(HttpServletRequest request) throws InvocationTargetException, IllegalAccessException {
        String prop = request.getParameter("prop");
        String value = request.getParameter("value");
        HashMap properties = new HashMap();
        properties.put(prop, value);
        User user = new User();
        BeanUtils.populate(user, properties);
    }

    public void bad2(HttpServletRequest request) {
        try {
            String prop = request.getParameter("prop");
            String value = request.getParameter("value");
            User user = new User();
            BeanUtils.setProperty(user, prop, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void good1(HttpServletRequest request) throws InvocationTargetException, IllegalAccessException {
        String prop = request.getParameter("prop");
        String value = request.getParameter("value");
        if (verify(prop) && verify(value)) {
            value = value + "123";
        }
        HashMap properties = new HashMap();
        properties.put(prop, value);
        User user = new User();
        BeanUtils.populate(user, properties);
    }

    public void good2(HttpServletRequest request) {
        try {
            String prop = request.getParameter("prop");
            String value = request.getParameter("value");
            if (verify(value) && verify(prop)) {
                value = value + "123";
            }
            User user = new User();
            BeanUtils.setProperty(user, prop, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    class User{
        public String name;
        public String sex;
    }

    private boolean verify(String aim) {
        return true;
    }
}
