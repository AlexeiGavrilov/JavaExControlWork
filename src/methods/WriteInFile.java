package methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

    public static void write(String pathname, String text) {

        File f = new File(pathname);
        if (f.exists()) {
            try (FileWriter file = new FileWriter(f, true)) {
                file.append("\n");
                file.append(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try (FileWriter file = new FileWriter(f)) {
                file.append("\n");
                file.append(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
