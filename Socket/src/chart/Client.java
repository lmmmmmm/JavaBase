package chart;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lming.41032@gmail.com
 * @date 19-3-4 下午12:00
 */
public class Client {

    public static void main(String[] args) throws IOException {
        // 创建socket
        Socket socketClient = new Socket("127.0.0.1", 5000);
        // 向服务器发送消息
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socketClient.getOutputStream());
        Map<String,Object> data = new HashMap<>();
        data.put("msg","你好!");
        objectOutputStream.writeObject(data);
        objectOutputStream.flush();
    }
}
