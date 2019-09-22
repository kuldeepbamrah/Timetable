package com.lambton;

import java.time.LocalDate;
import java.time.LocalTime;

public class RemainingTime {

    public LocalTime rTime(LocalTime lt){


        LocalTime tmp = LocalTime.of(17,00,00);
        tmp= tmp.minusNanos(lt.toNanoOfDay());
        LocalDate dt= LocalDate.now();
        String s = String.valueOf(dt.getDayOfWeek());


       /** if(s.equalsIgnoreCase("SUNDAY") || s.equalsIgnoreCase("SATURDAY")){
            int h = tmp.getHour();
            int m = tmp.getMinute();
            int sec= tmp.getSecond();

            h=h+24;

            LocalTime tmp1 = LocalTime.of(h,m,sec);
            return tmp1;

        }
        else*/
            return tmp;
    }

}
