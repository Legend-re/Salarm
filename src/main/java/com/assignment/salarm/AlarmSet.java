package com.assignment.salarm;

import java.time.LocalDateTime;

public class AlarmSet {
    private Long id;
    private String label;
    public String time;
    private Boolean vibrate;
    private String repeat;
    public LocalDateTime date;


    public AlarmSet(Long id, String label, String time, Boolean vibrate, String repeat) {
        this.id = id;
        this.label = label;
        this.time = time;
        this.vibrate = vibrate;
        this.repeat = repeat;
    }

    public AlarmSet(Long id, String label, String time, Boolean vibrate, String repeat, LocalDateTime date) {
        this.id = id;
        this.label = label;
        this.time = time;
        this.vibrate = vibrate;
        this.repeat = repeat;
        this.date = date;
    }

    public AlarmSet() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getVibrate() {
        return vibrate;
    }

    public void setVibrate(Boolean vibrate) {
        this.vibrate = vibrate;
    }

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString(){
        return "Alaram {" + "ID " + id + "Label "+ label + "Time " + time + "Vibrate" + vibrate + "Repeat" + repeat + "}";
    }
}
