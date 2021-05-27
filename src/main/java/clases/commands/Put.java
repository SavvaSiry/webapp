package clases.commands;

import clases.commands.abstracts.Command;
import clases.shop.ProductRepository;

public class Put extends Command {

    private final String name = "put";

    @Override
    public void execute(String param) {
        try {
            int id = Integer.parseInt(param);
            super.getCart().getProductList().add(new ProductRepository().getProductBuId(id));
            System.out.println("Товар был успешно добавлен в корзину");
        } catch (Exception e) {
            System.out.println("Нет товара с таким id");
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
