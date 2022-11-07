package app;

import app.product.Product;
import app.product.ProductRepository;

public class OrderApp {

    public void start(){

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        System.out.printf("🍔BurgerQueen Order Service");
        //while (true){
            menu.printMenu();
        //}
    }
}
