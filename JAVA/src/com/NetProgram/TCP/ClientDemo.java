package com.NetProgram.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 17:27
 */
/*
客户端：发送数据 接收服务器反馈
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s= new Socket("192.168.1.150",1234);
        OutputStream os = s.getOutputStream();
        os.write("hahaha".getBytes());
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println("客户端："+data);
        s.close();
    }
}
