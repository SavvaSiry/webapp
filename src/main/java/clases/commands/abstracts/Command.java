package clases.commands.abstracts;

import clases.shop.Cart;

public abstract class Command implements Executable {

    private String name;
    private Cart cart;

    public abstract String getName();

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Cart getCart() {
        return cart;
    }
}
