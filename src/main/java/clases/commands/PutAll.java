package clases.commands;

import clases.commands.abstracts.Command;
import clases.shop.Product;
import clases.shop.ProductRepository;

public class PutAll extends Command {

    private final String name = "putall";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void execute(String param) {
        this.getCart().getProductList().addAll(new ProductRepository().getAllProducts());
        System.out.println("Все товары были успешно добавлены в корзину");
    }
}
