package com.NetProgram;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 16:17
 */
/*
static InetAddress getByName(String host)
确定主机名称的IP地址。
String getHostAddress()
返回文本显示中的IP地址字符串。
String getHostName()
获取此IP地址的主机名。

 */
public class NetDemo01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.1.150");
        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println("主机名"+ hostName);
        System.out.println("ip"+ hostAddress);

    }
}
