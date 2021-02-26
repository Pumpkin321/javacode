package com.IO.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 16:10
 */
/*
猜数字 只能玩3次 还想玩 提示 试玩结束

思路
1写一个游戏类 里面有一个猜数字的小游戏
2写一个测试类 里面有main()方法 main()方法中按照下面步骤实现
    A 从文件中读取数据到Properties集合 用Load()方法实现
      文件已经存在 game.txt
      里面已经有一个数据值 count=0
    B 通过Properties集合获取到玩游戏的次数
    C 判断次数是否达到3次
        如果到了 给出提示
        不到3次
            玩游戏
            次数+1 重新写回文件 用Properties的store()方法实现

 */
public class GamePlayTimes {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\Properties\\game.txt");
        prop.load(fr);
        fr.close();

        String count = prop.getProperty("count");
        int num = Integer.parseInt(count);
        if (num>=3){
            System.out.println("试玩已结束");
        }else {
            GuessNumber.start();
            num++;
            prop.setProperty("count",String.valueOf(num));
            FileWriter fw = new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\Properties\\game.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
