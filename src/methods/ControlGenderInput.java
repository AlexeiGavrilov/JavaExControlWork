package methods;

import exeptions.IncorrectDateFormat;
import exeptions.IncorrectGender;

public class ControlGenderInput {

    public static void checkGender(String[] s) {
        int right = 1;
        String gender = null;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == right) {gender = s[i];}
        }
        if (gender==null) throw new IncorrectGender();
        if (gender.toLowerCase().equals("f") || gender.toLowerCase().equals("m"));
        else throw new IncorrectGender();
    }

}
