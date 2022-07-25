package coreJava;

import java.text.SimpleDateFormat;
import java.util.Date;//package.class

public class DateDemo {

    public static void main(String[] args) {
        //current date.current time.
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
        SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");

        System.out.println(sdf.format(d));
        System.out.println(sd.format(d));

        System.out.println(d.toString());

        //mm/dd/yyyy

    }

}
