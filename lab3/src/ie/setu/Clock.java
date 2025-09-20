package ie.setu;

import java.util.Calendar;

public class Clock {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        double millStart = System.currentTimeMillis();
        double millEnd = millStart;

        int minStart = cal.get(Calendar.MINUTE);
        int minEnd = minStart;

        int i = 0;
        int x = i;

        while (minStart == minEnd) {
            while ((millEnd - millStart) < 1000) {
                millEnd = System.currentTimeMillis();
            }
            t.tick();
            System.out.println(t);
            minEnd = t.getMinute();
            millStart = System.currentTimeMillis();
            millEnd = millStart;
        }


    }
}
