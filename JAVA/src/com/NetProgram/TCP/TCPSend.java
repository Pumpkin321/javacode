package com.NetProgram.TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 17:15
 */
/*
客户端发送数据
1创建客户端Socket对象（Socket）
2获取输出流 写数据
3释放资源

Socket(InetAddress address, int port)
创建流套接字并将其连接到指定IP地址的指定端口号。
/Socket(String host, int port)
创建流套接字并将其连接到指定主机上的指定端口号。
 */
public class TCPSend {
    public static void main(String[] args) throws IOException {
        //Socket(InetAddress address, int port)
        //创建流套接字并将其连接到指定IP地址的指定端口号。
//        Socket s = new Socket(InetAddress.getByName("192.168.1.150"),10086);
        //Socket(String host, int port)
        //创建流套接字并将其连接到指定主机上的指定端口号。
        Socket s= new Socket("192.168.1.150",10086);
        //OutputStream getOutputStream()
        //返回此套接字的输出流。
        OutputStream os = s.getOutputStream();
        os.write("hello,i like you".getBytes());
        s.close();
    }
}
