package com.assignment.salarm;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class AlarmDetails {
public List<AlarmSet> getAlarm(){
 return Arrays.asList(new AlarmSet(
         1L, "Prayer time", "17:00", true, "Monday",
 ));
    }

}
