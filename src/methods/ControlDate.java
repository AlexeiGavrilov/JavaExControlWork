package methods;

import exeptions.IncorrectDateFormat;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ControlDate {

    public static void checkDate(String[] s) {
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
        if (resultList[2] <0) throw new IncorrectDateFormat();

    }

}
