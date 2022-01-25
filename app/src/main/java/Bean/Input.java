package Bean;

import java.util.Scanner;

public class Input {

    public static String inputRequiredString(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        String input = scanner.nextLine();
        return input;
    }

    public static Integer inputRequiredInteger(String title){
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        Integer input = scanner.nextInt();
        return input;
    }

}
