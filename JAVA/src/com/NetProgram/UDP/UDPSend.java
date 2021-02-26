package com.NetProgram.UDP;

import java.io.IOException;
import java.net.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 16:40
 */
/*
UDP发送数据步骤：
1创建发送端Socket对象(DatagramSocket)
2创建数据 把数据打包
3调用方法发送数据
4关闭发送端

DatagramSocket()
构造数据报套接字并将其绑定到本地主机上的任何可用端口。

 */

public class UDPSend {
    public static void main(String[] args) throws IOException {
        //DatagramSocket()
        //构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds = new DatagramSocket();

        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造用于发送长度的分组的数据报包 length指定主机上到指定的端口号。
        byte[] bys = "hello,udp".getBytes();
//        int len = bys.length;
//        InetAddress address = InetAddress.getByName("XUPT-CYB");
//        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,bys.length,InetAddress.getByName("192.168.1.150"),10086);
        //send(DatagramPacket p)
        //从此套接字发送数据报包。
        ds.send(dp);
        ds.close();
    }
}
