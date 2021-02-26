package com.NetProgram.TCP;

import javafx.beans.binding.When;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 17:36
 */

public class ServerDemo02 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(1234);
        Socket s = ss.accept();
//        InputStream is = s.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        ss.close();
    }
}
