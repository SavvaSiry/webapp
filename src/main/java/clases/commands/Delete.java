package clases.commands;

import clases.commands.abstracts.Command;
import clases.shop.Product;

import static java.lang.Integer.parseInt;

public class Delete extends Command {

    private final String name = "delete";

    @Override
    public void execute(String param) {
        try {
            int id = Integer.parseInt(param);
            for (Product product:
                    super.getCart().getProductList())
                if (product.getId() == id) {
                    super.getCart().getProductList().remove(product);
                    System.out.println("Товар " + product.getName() + " был удален");
                }
        } catch (Exception e) {
            System.out.println("Нет товара с таким id");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
