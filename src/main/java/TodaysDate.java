import  java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {

    private String time;
    public int day;
    private int  month;
    protected String year;

    public void printDateAndTime(){
        GregorianCalendar calendar = new GregorianCalendar();
        time = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY)) + ":" +
                String.valueOf(calendar.get(Calendar.MINUTE)) + ":" +
                String.valueOf(calendar.get(Calendar.SECOND));

        day = calendar.get(Calendar.DATE);
        month = calendar.get(Calendar.MONTH) + 1;
        year = String.valueOf(calendar.get(Calendar.YEAR));

        System.out.println("Time: "+time);
        System.out.println("Date: "+month+ " "+day + " " +year);

    }



}
