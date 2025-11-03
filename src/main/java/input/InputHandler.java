package input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int readInt(String message) {
        while (true) {
            System.out.print(message + ": ");
            try {
                int input = SCANNER.nextInt();
                SCANNER.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Format error: " + e.getMessage());
                SCANNER.nextLine();
            }
        }
    }

    public static String readString(String message) {
        while (true) {
            System.out.print(message + ": ");
            try {
                String input = SCANNER.nextLine();
                if (input.isEmpty()) {
                    throw new Exception("Empty field");
                }
                return input.trim();
            } catch (Exception e) {
                System.out.println("Format error: " + e.getMessage());
            }
        }
    }

    public static void closeScanner() {
        SCANNER.close();
    }
}