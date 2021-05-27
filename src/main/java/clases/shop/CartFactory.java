package clases.shop;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class CartFactory {

    @Lookup
    public static Cart getCart(){
        return null;
    }
}
