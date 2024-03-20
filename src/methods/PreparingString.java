package methods;

public class PreparingString {

    public static void prepare(String first) {
        String[] s = first.split(" ");
        ControlInputCounts.CheckInputUser(s);
        String date = ControlDate.checkDate(s);
        String gender = ControlGenderInput.checkGender(s);
        String phone = ControlPhoneNumber.checkPhoneNumber(s);
        String fio = first.replace(date, "1").replace(gender, "1").replace(phone, "1");
        String[] fioRes = fio.split(" ");
        String[] result = new String [3];
        String fioresult = "";
        for (int i = 0, j = 0; i < fioRes.length; i++) {
            if (!fioRes[i].equals("1")){
                result[j] = fioRes[i];
                fioresult += fioRes[i] + " ";
                j++;
            }
        }
        String textForFile = String.format("%s %s %s %s %s %s",result[0],result[1],result[2],date,phone,gender);
        String pathname = result[0]+"."+"txt";
        WriteInFile.write(pathname,textForFile);


    }
}
