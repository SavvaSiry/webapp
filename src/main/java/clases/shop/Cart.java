package clases.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Cart {


    private List<Product> productList;

    @PostConstruct
    private void start(){
        productList = new ArrayList<Product>();
    }

    public List<Product> getProductList() {
        return productList;
    }
}
