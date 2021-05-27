package clases.shop;

import org.springframework.stereotype.Component;


@Component
public class Product {

    int id;
    int price;
    String name;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "id: " + id + " | name" + name + " | price: " + price;
    }
}
