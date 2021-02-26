package com.NetProgram.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:00
 */

public class ServerDemo04 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(1234);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\NetProgram\\TCP\\TCPTest.txt"));
        String line;
        while ((line=br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("上传成功");
        bwServer.newLine();
        bwServer.flush();
        bwServer.close();

        bw.close();
        ss.close();

    }
}
