package chart;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lming.41032@gmail.com
 * @date 19-3-4 下午12:01
 */
public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(5209);
        while (true) {
            Socket socket = ss.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Map<String,Object> data = (HashMap) ois.readObject();
            System.out.println(data);
        }
    }

}
