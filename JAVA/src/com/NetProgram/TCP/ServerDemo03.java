package com.NetProgram.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 17:51
 */

public class ServerDemo03 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(1234);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\NetProgram\\TCP\\TCPDemo.txt"));
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();

    }
}
