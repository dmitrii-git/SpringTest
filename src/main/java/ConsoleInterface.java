import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleInterface {
    private Cart cart;
    @Autowired
    public void CreateCart(){
        this.cart = cart;
    }
    @Bean
    public void Start() {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.println("1 - add, 2 - del, 3 - print");
            int task = in.nextInt();
            if (task == 1) {
                System.out.println("Enter product ID");
                int addID = in.nextInt();
                cart.AddProduct(addID);
            }
            if (task == 2) {
                System.out.println("Enter product ID");
                int delID = in.nextInt();
                cart.DelProduct(delID);
            }
            if (task == 3) {
                System.out.println(cart);
            }


        }
    }

}
