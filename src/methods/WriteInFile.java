package methods;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

    public static void write(String pathname, String text)  {
        try(FileWriter file = new FileWriter(pathname)) {
            file.append(text);
        }catch (IOException e){
            e.printStackTrace();
        }



    }

//    String fioResult, String phone, String gender, String date

}
