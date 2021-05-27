package clases.shop;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    private void putProductToList(){
        productList = new ArrayList<Product>();
        productList.add(new Product(1, "огурцы", 15));
        productList.add(new Product(2, "салат", 30));
        productList.add(new Product(3, "помидоры", 35));
        productList.add(new Product(4, "хлеб", 10));
        productList.add(new Product(5, "колбаса", 98));
    }

    public Product getProductBuId(int id){
        for (Product product:
             productList) {
            if (product.getId() == id) return product;
        }
        return null;
    }

    public List<Product> getAllProducts(){
        return productList;
    }
}
