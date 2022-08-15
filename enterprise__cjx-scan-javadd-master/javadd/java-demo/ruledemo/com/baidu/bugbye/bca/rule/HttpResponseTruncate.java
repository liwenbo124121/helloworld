package rule;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpResponseTruncate {
    public void bad1(HttpServletRequest request, HttpServletResponse response){
        String author = request.getParameter("AUTHOR_PARAM");
        Cookie cookie = new Cookie("author", author);
        cookie.setMaxAge(10);
        response.addCookie(cookie);
    }

    public void bad2(HttpServletRequest request, HttpServletResponse response){
        String author = request.getParameter("AUTHOR_PARAM");
        Cookie cookie = null;
        cookie = new Cookie("author", author);
        cookie.setMaxAge(10);
        response.addCookie(cookie);
    }
    public void good1(HttpServletRequest request, HttpServletResponse response){
        String author = request.getParameter("AUTHOR_PARAM");
        if (!verify(author)) {
            return;
        }
        Cookie cookie = null;
        cookie = new Cookie("author", author);
        cookie.setMaxAge(10);
        response.addCookie(cookie);
    }

    private boolean verify(String s) {
        return true;
    }
}
