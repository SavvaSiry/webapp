package clases.commands;

import clases.commands.abstracts.Command;

public class DeleteAll extends Command {

    final private String name = "deleteall";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute(String param) {
       super.getCart().getProductList().clear();
    }
}
