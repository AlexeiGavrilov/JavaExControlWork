package methods;

import exeptions.IncorrectDateFormat;

import java.time.Year;
import java.util.*;

public class ControlDate {

    public static String checkDate(String[] s) {

        int right = 10;
        String date = null;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == right && s[i].contains(".") || s[i].contains("/") || s[i].contains(",")
                    || s[i].contains("\\") || s[i].contains(";") || s[i].contains(":") || s[i].contains("-")) {date = s[i];}
        }
        if (date==null) throw new IncorrectDateFormat();
        String [] result = date.replace('.',' ').replace('\\',' ').
                replace('/',' ').replace(',', ' ').replace(';', ' ').
                replace(':', ' ').replace('-', ' ').split(" ");
        int [] resultList = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            try {
                int value  = Integer.parseInt(result[i]);
                resultList[i] = value;
            }catch (NumberFormatException e){
                throw new IncorrectDateFormat();
            }
        }
        if (resultList[0]>31 || resultList[0] <=0 ) throw new IncorrectDateFormat();
        if (resultList[1]>12 || resultList[1] <=0) throw new IncorrectDateFormat();
        if (resultList[2] <1900 || resultList[2]>2024) throw new IncorrectDateFormat();

        return date;

    }

}
