package com.assignment.salarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class SalarmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SalarmApplication.class, args);

/*        AlarmSet set = new AlarmSet();

        String format = "HH:mm";
        SimpleDateFormat timeFormatter = new SimpleDateFormat(format);

        String date = timeFormatter.format(new Date());

        if (set.getTime().equals(date)) {
            System.out.println("***** ALARM!!!! \n" + "The time is " + date +
                    "\n It is time for Solat!");

        } else {
            System.out.println("The time is: " + date);
        }

    */}
}
