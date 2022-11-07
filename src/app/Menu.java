package app;

import app.product.Product;
import app.product.subproduct.Drink;
import app.product.subproduct.Hambuger;
import app.product.subproduct.Side;

public class Menu {
    private Product[] products;

    public Menu(Product[] products) {
        this.products = products;
    }

    public void printMenu(){
        System.out.println("[🔻] 메뉴");
        System.out.println("-".repeat(60));

        printHamburgers();
        printSides();
        printDrinks();

        System.out.println();
        System.out.println("🧺 (0) 장바구니");
        System.out.println("📦 (+) 주문하기");
        System.out.println("-".repeat(60));
        System.out.print("[📣] 메뉴를 선택해주세요 : ");

    }

    private void printDrinks() {
        System.out.println("🥤 음료");
        for (Product product : products){
            if (product instanceof Drink) {
                prinEachMenu(product);
            }
        }

        System.out.println();
    }

    private void printSides() {
        System.out.println("🍟 사이드");
        for (Product product : products){
            if (product instanceof Side) {
                prinEachMenu(product);
            }
        }

        System.out.println();
    }

    private void printHamburgers() {
        System.out.println("🍔 햄버거");
        for (Product product : products){
            if (product instanceof Hambuger) {
                prinEachMenu(product);
            }
        }

        System.out.println();
    }

    private static void prinEachMenu(Product product) {
        System.out.printf(
                "   (%d) %s %5dKcal %5d원\n",
                product.getId(), product.getName(), product.getKcal(), product.getPrice()
        );
    }

}
