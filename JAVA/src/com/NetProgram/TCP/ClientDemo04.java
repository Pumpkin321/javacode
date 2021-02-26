package com.NetProgram.TCP;

import java.io.*;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:00
 */

public class ClientDemo04 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.150",1234);

        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\NetProgram\\TCP\\TCPDemo.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        bw.write("886");
//        bw.newLine();
//        bw.flush();
        //结束标记 void shutdownOutput();
        s.shutdownOutput();

        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器反馈："+ data);

        br.close();
        s.close();
    }
}
