package rule;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.redis.hash.BeanUtilsHashMapper;
import org.springframework.data.redis.hash.HashMapper;

public class BeanDeSerializeCheck {
    public void good1(HttpServletRequest request){
        String name = request.getParameter("name");
        if (!verify(name)) {
            return;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("name",name);
        HashMapper hashMapper = new BeanUtilsHashMapper<User>(User.class);
        User user = (User) hashMapper.fromHash(map);
    }

    public void bad1(HttpServletRequest request){
        String name = request.getParameter("name");
        HashMap<String, String> map = new HashMap<>();
        map.put("name",name);
        HashMapper hashMapper = new BeanUtilsHashMapper<User>(User.class);
        User user = (User) hashMapper.fromHash(map);
    }

    class User{
        String name;
    }

    private boolean verify(String s){
        return true;
    }
}
