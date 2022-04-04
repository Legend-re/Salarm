package com.assignment.salarm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("alarm/legendre")
public class AlarmController {
    private final AlarmDetails alarmDetails;
    @Autowired
    public AlarmController(AlarmDetails alarmDetails) {
        this.alarmDetails = alarmDetails;
    }

    @GetMapping
    public List<AlarmSet> getAlarm() {
        return alarmDetails.getAlarm();
    }
    

}
