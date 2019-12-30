package com.homework.micserv.microserv;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public String DateOutput(){
        return day+"/"+month+"/"+year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}
