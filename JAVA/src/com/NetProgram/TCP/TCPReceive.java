package com.NetProgram.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 17:15
 */
/*
TCP接收数据
1创建服务器端Socket对象（ServerSocket）
2监听客户端连接 返回一个Socket对象
3获取输入流 读数据 并把数据显示到控制台
4释放资源

ServerSocket(int port)
创建绑定到指定端口的服务器套接字。
 */
public class TCPReceive {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        //ServerSocket(int port)
        //创建绑定到指定端口的服务器套接字。
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println(data);
        s.close();
        ss.close();
    }
}
