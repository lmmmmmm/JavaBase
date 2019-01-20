package com.lm.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流
 * I input 输入,从硬盘中读取内容
 * O output 输出,输入内容到硬盘中
 * 按照种类分:
 * &nbsp;&nbsp; 1 字节流: 操作所有文件包括视频,音乐
 * &nbsp;&nbsp; 2 字符流: 主要操作文本文件,本质上还是字节流
 * <p>
 * 字节输入流:InputStream是所有字节输入流的父类
 * 字节输出流:
 *
 * @author lming.41032@gmail.com
 * @date 19-1-20 下午10:43
 */
public class Demo1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("/home/lm/IdeaProjects/JavaBase/io/src/test1.txt");
            fos = new FileOutputStream("/home/lm/IdeaProjects/JavaBase/io/src/test2.txt");
            byte[] buffer = new byte[32];
            while (fis.read(buffer) != -1) {
                fos.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
                fos.close();
            }
        }
    }
}
