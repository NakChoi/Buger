package app.product.subproduct;

import app.product.Product;

public class BurgurSet extends Product {
    private Hambuger hambuger;
    private Side side;
    private Drink drink;

    public BurgurSet(int id, String name, int price, int kcal, Hambuger hambuger, Side side, Drink drink) {
        super(id, name, price, kcal);
        this.hambuger = hambuger;
        this.side = side;
        this.drink = drink;
    }

    public Hambuger getHambuger(){
        return  hambuger;
    }
    public Side getSide(){
        return side;
    }

    public Drink getDrink(){
        return drink;
    }
}
