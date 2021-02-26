package com.IO.CharacterStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/18 16:15
 */

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\ArrayListtoTxt.txt"));
        ArrayList<String > array = new ArrayList<String>();

        String line;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        for (String s : array){
            System.out.println(s);
        }
        br.close();

    }
}
