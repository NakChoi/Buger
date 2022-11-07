package app;

import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {

    public void start(){

        Scanner scanner = new Scanner(System.in);

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        System.out.printf("🍔BurgerQueen Order Service");
        //while (true){
            menu.printMenu();
            String input = scanner.nextLine();

        //}
    }
}
