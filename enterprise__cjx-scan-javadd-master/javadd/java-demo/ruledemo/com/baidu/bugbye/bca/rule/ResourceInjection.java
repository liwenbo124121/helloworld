package rule;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.servlet.http.HttpServletRequest;

public class ResourceInjection {
    public void bad1(HttpServletRequest request){
        String port = request.getParameter("port");
        String s = "Ljava/net/ServerSocket;";
        try {
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port));
            Socket socket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void bad2(HttpServletRequest request){
        String portStr = request.getParameter("port");
        int port = Integer.parseInt(portStr);
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void good1(HttpServletRequest request){
        String portStr = request.getParameter("port");
        int port = Integer.parseInt(portStr);
        if (!verify(port)) {
            return;
        }
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean verify(int port) {
        return true;
    }
}
