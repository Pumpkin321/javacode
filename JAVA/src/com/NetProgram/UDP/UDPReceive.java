package com.NetProgram.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 16:52
 */
/*
UDP接收数据
1创建接收端的Socket对象
2创建一个数据包用于接收数据
3调用接收方法
4解析数据包 把数据显示在控制台
5关闭接收端
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        ds.receive(dp);
//        int len = dp.getLength();
//        byte[] datas = dp.getData();
//        String dataString = new String(datas,0,len);
        System.out.println(new String(dp.getData(),0,dp.getLength()));
        ds.close();


    }
}
