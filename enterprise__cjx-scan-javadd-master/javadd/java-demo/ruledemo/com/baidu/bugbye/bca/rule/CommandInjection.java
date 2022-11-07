package rule;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

public class CommandInjection {
    public void bad1(HttpServletRequest request) throws IOException {
        String dirName = request.getParameter("dirName");
        String cmd = new String("java -jar "+dirName);
        Runtime.getRuntime().exec(cmd);
    }

    public void bad2(HttpServletRequest request) throws InterruptedException {
        String jarPath = request.getParameter("jarPath");
        Process process = null;
        String dir = jarPath + "123";
        try {
            process = Runtime.getRuntime().exec("java -jar" + dir);
            int result = process.waitFor();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void bad3(HttpServletRequest request) throws IOException {
        String dir1 = request.getParameter("jarPath");
        String dir = dir1 + "123";
        ProcessBuilder processBuilder = new ProcessBuilder("java -jar" + dir);
        processBuilder.start();
    }

    public void good1 (HttpServletRequest request) throws IOException {
        String jarName = null;
        int jarId = Integer.parseInt(request.getParameter("jarPath"));
        if (1 == jarId) {
            jarName = "user.jar";
        } else if (2 == jarId) {
            jarName = "fruit.jar";
        }
        if (null != jarName){
            Process exec = Runtime.getRuntime().exec("java -jar" + jarName);
        }
    }


}
