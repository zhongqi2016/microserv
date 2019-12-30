package com.homework.micserv.microserv;


public class FindDay256 {
    private int errorCode;
    private String dataMessage;

    public FindDay256(String year) {
        int yearI = StringToInt(year);
        if (yearI ==-1){
            errorCode=10;
            dataMessage="";
        }else if (yearI==-2){
            errorCode=20;
            dataMessage="";
        }else {
            errorCode=200;
            dataMessage=find256(yearI).DateOutput();
        }
    }

    private int StringToInt(String year) {
        int res = 0;
        for (int i = 0; i < year.length(); ++i) {
            char ch = year.charAt(i);
            if (ch <= '9' && ch >= '0') {
                res*=10;
                res += ch - '0';
            } else return -1;
        }
        if (year.length()>5) return  -2;
        return res;
    }

    private boolean isLeap(int year) {
        if (year % 100 != 0) return false;
        else if (year % 400 != 0) return false;
        else if (year % 4 != 0) return false;
        return true;
    }

    private Date find256(int year) {
        int days = 256;
        final int[][] monthLN = {
                {31, 31},
                {28, 29},
                {31, 31},
                {30, 30},
                {31, 31},
                {30, 30},
                {31, 31},
                {31, 31},
                {30, 30},
                {31, 31},
                {30, 30},
                {31, 31}};
        int day = 0;
        int month = 0;
        boolean LN = isLeap(year);
        int i;
        for (i = 0; days > 0; ++i) {
            ++month;
            days -= monthLN[i][LN ? 1 : 0];
        }
        day = monthLN[i][LN ? 1 : 0] + days;
        return new Date(day, month, year);
    }
    public int getErrorCode() {
        return errorCode;
    }

    public String getDataMessage() {
        return dataMessage;
    }
}
