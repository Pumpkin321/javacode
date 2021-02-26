package JavaSE_Code;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author cyb
 * @Date 2020/9/9 17:06
 */

public class DateUtils {
    private DateUtils(){}

    //日期转为指定格式字符串
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return  s;
    }
    //字符串转为指定格式日期
    public static Date stringTodate(String s,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }
}
