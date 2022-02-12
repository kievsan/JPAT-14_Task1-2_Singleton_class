//package knhel7.jd14.jpat14.task12_2;

import java.util.Date;

public class Logger {
    private static Logger instance = null;
    private Date d = new Date();
    private int num = 1;

    private Logger() {}

    public static Logger getSingleInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }

    public void log(String msg) {
        System.out.println(
                "[" +
                        String.format("%1$td.%1$tm.%1$tY %tT", d) +
                        ", " + num++ +
                        "] " +
                        msg
        );
    }
}
