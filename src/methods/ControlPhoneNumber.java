package methods;

import exeptions.IncorrectDateFormat;
import exeptions.IncorrectPhoneFormat;

import java.util.regex.Pattern;

public class ControlPhoneNumber {

    public static String checkPhoneNumber(String[] s) {
        int right = 11;
        String phone = null;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == right && !Pattern.matches("[a-zA-Z]+",s[i]) && !Pattern.matches("[а-яА-Я]+",s[i]) ) {
                phone = s[i];
                try {
                    long result = Long.parseLong(phone);
                }catch (NumberFormatException e){
                    throw new IncorrectPhoneFormat();
                }
            }

        }
        if (phone==null) throw new IncorrectPhoneFormat();


        return phone;


    }

}
