import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private List<Product> cart;
    private ProductRepository productRepository;
    @PostConstruct
    public void CreateEmptyCart(){
        cart = new ArrayList<>();
    }
    public void AddProduct(int ID){
        cart.add(productRepository.getByID(ID));
    }
    public void DelProduct(int ID){
        cart.remove(productRepository.getByID(ID));
    }
    @Autowired
    public void CreateRepository(ProductRepository productRepository){
        this.productRepository = productRepository;

    }
}
