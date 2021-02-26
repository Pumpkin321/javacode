package JavaSE_Code;

import java.util.Calendar;

/**
 * @Description
 * @Author cyb
 * @Date 2020/9/10 10:41
 */

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }
}
