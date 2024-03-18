package methods;

import exeptions.MaxCountOfData;
import exeptions.MinCountOfData;

import java.util.Arrays;
import java.util.Scanner;

public class ControlInputCounts {

    public static void CheckInputUser(String [] s) {
        if (s.length <6){throw new MinCountOfData();}
        else if (s.length >6 ) { throw new MaxCountOfData();}
    }

}
