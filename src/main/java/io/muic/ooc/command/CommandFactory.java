package io.muic.ooc.command;

import java.util.HashMap;

public class CommandFactory {
    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            put("go", new Go());
            put("attack with", new AttackWith());
            put("quit", new Quit());
            put("help", new Help());
            put("take", new Take());
            put("use", new Use());
            put("drop", new Drop());
        }
    };

    public static Command getCommand(String name) {
        return commands.get(name);
    }

}
