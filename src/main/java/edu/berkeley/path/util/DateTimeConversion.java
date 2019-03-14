package edu.berkeley.path.util;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeConversion {

    public static Date TMDDDateTimeToRegularDateTime(String tmddDate, String tmddTime) throws ParseException {

        int tmddDateInteger=Integer.parseInt(tmddDate);
        int year=tmddDateInteger/10000;
        int month=(tmddDateInteger%10000)/100;
        int day=(tmddDateInteger%100);

        long tmddTimeInteger=Long.parseLong(tmddTime);
        int hour=(int)(tmddTimeInteger/100000000);
        int minute=(int)(tmddTimeInteger%100000000)/1000000;
        int second=(int)(tmddTimeInteger%1000000)/10000;
        int decimal=(int)(tmddTimeInteger%10000)/10;

        SimpleDateFormat formatter = new SimpleDateFormat( "MM-dd-yyyy HH:mm:ss.SSS");

        String decimalStr;
        if(decimal<10){
            decimalStr="00"+decimal;
        }else if(decimal>=10 && decimal<100){
            decimalStr="0"+decimal;
        }else{
            decimalStr=Integer.toString(decimal);
        }

        String dateTimeStr=month+"-"+day+"-"+year+" "+hour+":"+minute+":"+second+"."+decimalStr;
        //LocalDateTime localDateTime= LocalDateTime.parse(dateTimeStr,DateTimeFormatter.ofPattern("M-d-yyyy HH:mm:ss.SSS"));
        Date regularDateTime=formatter.parse(dateTimeStr);

        return regularDateTime;
    }

}
