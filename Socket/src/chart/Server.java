package chart;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lming.41032@gmail.com
 * @date 19-3-4 下午12:01
 */
public class Server {

    public void go() throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        while (true) {
            Socket socket = ss.accept();
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = bufferedReader.readLine();
            System.out.println(s);
            inputStreamReader.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Server ss = new Server();
        ss.go();
    }

}
