package clases.commands;

import clases.commands.abstracts.Command;
import clases.shop.Product;

public class Show extends Command {

    private final String name = "show";

    @Override
    public void execute(String param) {
        if (!super.getCart().getProductList().equals(null)) {
            for (Product product :
                    super.getCart().getProductList()) {
                product.toString();
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
