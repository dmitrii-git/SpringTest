package Test1;

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
    public void Print() {
        for (int i = 0; i <= cart.size() - 1; i++) {
            Product p = cart.get(i);
            System.out.println(p.getId() + " " + p.getName() + " " + p.getCost() + " ");


        }
    }
    @Autowired
    public void CreateRepository(ProductRepository productRepository){
        this.productRepository = productRepository;

    }
}
