package methods;

import java.util.Arrays;
import java.util.Scanner;

public class StartProgram {

    public static void start() {
        System.out.println("Введите в произвольном порядке ФИО, дату рождения, " +
                "номер телефона в формате 11 цифр и пол через пробел");
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        PreparingString.prepare(first);






    }




}
