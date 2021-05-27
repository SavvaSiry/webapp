package clases.commands;

import clases.commands.abstracts.Command;

public class Help extends Command {

    private final String name = "help";

    @Override
    public void execute(String param) {
        System.out.println( "**** LIST OF COMMANDS ****" +
                            "      Delete id" +
                            "      DeleteAll" +
                            "      Help" +
                            "      Put id" +
                            "      PutAll" +
                            "      Show");

    }

    @Override
    public String getName() {
        return name;
    }
}
