package level1;

import input.InputHandler;

public class MenuHandler {

    public void start() {
        System.out.println("Welcome to your commands history!");
        System.out.println();

        int option;
        do {
            option = showMenu();
            handleOption(option);
            System.out.println();
        } while (option != 0);

        InputHandler.closeScanner();
    }

    private int showMenu() {
        System.out.println("We can do the following:");
        System.out.println("1. Add command to history");
        System.out.println("2. Remove command from history");
        System.out.println("3. Show commands history");
        System.out.println("0. Exit");
        return InputHandler.readInt("Choose what to do next (0-3)");
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                try {
                    String command = InputHandler.readString("Enter the command");
                    Undo.getInstance().addCommand(command);
                } catch (Exception e) {
                    System.out.println("Error adding command: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    Undo.getInstance().removeCommand();
                } catch (Exception e) {
                    System.out.println("Error removing command: " + e.getMessage());
                }
                break;
            case 3:
                System.out.println(Undo.getInstance().getCommandsHistory());
                break;
            case 0:
                System.out.println("See you soon!");
                break;
            default:
                System.out.println("Invalid option (" + option + ").");
                break;
        }
    }
}
