package methods;

import exeptions.IncorrectDateFormat;
import exeptions.IncorrectPhoneFormat;

public class ControlPhoneNumber {

    public static void checkPhoneNumber(String[] s) {
        int right = 11;

        String phone = null;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == right) {
                phone = s[i];
                try {
                    long result = Long.parseLong(phone);
                }catch (NumberFormatException e){
                    throw new IncorrectPhoneFormat();
                }
            }

        }
        if (phone==null) throw new IncorrectPhoneFormat();

    }

}
