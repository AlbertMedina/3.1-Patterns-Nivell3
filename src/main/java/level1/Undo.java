package level1;

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;

    private final List<String> commands;

    public Undo() {
        commands = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addCommand(String command) {
        if (command != null && !command.trim().isEmpty()) {
            commands.add(command);
            System.out.println("'" + command + "' added");
        }
    }

    public void removeCommand() {
        if (!commands.isEmpty()) {
            String command = commands.removeLast();
            System.out.println("'" + command + "' removed");
        }
    }

    public String getCommandsHistory() {
        StringBuilder sb = new StringBuilder("Commands history:");
        commands.forEach(c -> sb.append("\n").append("- ").append(c));
        return sb.toString();
    }
}

