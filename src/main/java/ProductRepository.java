import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void InitialData () {
        products = new ArrayList<>();
        products.add(new Product(1, "IPhone", 1000));
        products.add(new Product(2, "MacBookPro16", 2500));
        products.add(new Product(3, "iMac", 1200));
        products.add(new Product(4, "MacBook", 800));
        products.add(new Product(5, "IPodPro", 988));

    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product getByID(int ID) {
        Product ProductGet = null;
        for (int i = 0; i <= products.size(); i++) {
            Product p = products.get(i);
            if (ID == p.getId()) {
                ProductGet = p;
            }
        }
        return ProductGet;
    }








}
