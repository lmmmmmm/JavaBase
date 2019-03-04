package chart;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author lming.41032@gmail.com
 * @date 19-3-4 下午12:00
 */
public class Client {

    public void go() throws IOException {
        // 创建socket
        Socket socketClient = new Socket("127.0.0.1", 5000);
        // 向服务器发送消息
        PrintWriter ps = new PrintWriter(socketClient.getOutputStream());
        ps.write("message to send!");
        ps.close();
    }


    public static void main(String[] args) throws IOException {
        Client sc = new Client();
        sc.go();
    }
}
