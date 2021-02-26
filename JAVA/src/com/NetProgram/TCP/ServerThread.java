package com.NetProgram.TCP;

import java.io.*;
import java.net.Socket;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:16
 */

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        //接收数据写道文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\找工作\\JAVA\\src\\com\\NetProgram\\TCP\\copy.txt"));
            int count = 0;
            File file = new File("D:\\找工作\\JAVA\\src\\com\\NetProgram\\TCP\\copy["+count+"].txt");
            while (file.exists()){
                count++;
                file = new File("D:\\找工作\\JAVA\\src\\com\\NetProgram\\TCP\\copy["+count+"].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("成功");
            bwServer.newLine();
            bwServer.flush();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
