package com.NetProgram.TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:14
 */
/*
服务器：接收到的数据写入文本文件 给出反馈 代码用线程进行封装 为每一个客户端开一个线程

客户端程序使用ClientDemo04
 */
public class ServerDemo05 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(1234);
        while (true){
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();

        }
    }
}
