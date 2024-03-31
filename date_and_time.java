import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class date_and_time {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        // System.out.println(System.currentTimeMillis());
        // System.out.println(Long.MAX_VALUE);
        // Date d=new Date();
        // System.out.println(d);
        // System.out.println(d.getTime());
        // System.out.println(d.getDate());
        // System.out.println(d.getSeconds());
        // System.out.println(d.getYear());


        Calendar c=Calendar.getInstance();

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());

    }
}
