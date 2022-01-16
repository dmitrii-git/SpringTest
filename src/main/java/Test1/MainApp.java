package Test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = context.getBean("cart", Cart.class);
        ProductRepository productRepository = context.getBean( "productRepository", ProductRepository.class );
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.println("1 - add, 2 - del, 3 - print, 4 - show available");
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
                cart.Print();
            }
            if (task == 4) {
                productRepository.Print();

            }
        }


        //context.close();
    }
}