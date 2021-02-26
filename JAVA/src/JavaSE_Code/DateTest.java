package JavaSE_Code;

import java.util.Date;

/**
 * @Description
 * @Author cyb
 * @Date 2020/9/9 17:11
 */

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        String s=DateUtils.dateToString(date,"yyyy年MM月dd日");
        System.out.println(s);
    }
}
