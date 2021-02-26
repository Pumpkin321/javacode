package com.NetProgram.TCP;

import java.io.*;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 17:51
 */

public class ClientDemo03 {
    public static void main(String[] args) throws IOException {
        Socket s= new Socket("192.168.1.150",1234);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line= br.readLine())!=null){
            if("886".equals(line)){
                break;
            }
//            OutputStream os = s.getOutputStream();
//            os.write(line.getBytes());
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
