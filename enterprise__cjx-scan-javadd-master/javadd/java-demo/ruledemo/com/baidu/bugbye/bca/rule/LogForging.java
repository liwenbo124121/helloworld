package rule;

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class LogForging {
    private Logger logger = Logger.getLogger(LogForging.class.getName());

    public void bad1(boolean loginSuccessful, String username){
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }

    public void bad2(String username){
        logger.severe("严重"+ username);
        logger.warning("警告"+ username);
        logger.info("信息"+ username);
        logger.config("配置"+ username);
        logger.fine("良好"+ username);
        logger.finer("较好"+ username);
        logger.finest("最好"+ username);
    }

    public void good1(boolean loginSuccessful, String username){
        if (!Pattern.matches("[A-Za-z0-9_]+", username)) {
            // Unsanitized username
            logger.severe("User login failed for unauthorized user");
        } else if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
