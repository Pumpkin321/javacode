package com.xupt.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/9 16:12
 */

public class DateConverter implements Converter<String, Date> {


    @Override
    public Date convert(String dateStr) {
        //将日期字符串转换成日期对象进行返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
