package app.product.subproduct;

import app.product.Product;

public class BurgurSet extends Product {
    private Hambuger hambuger;
    private Side side;
    private Drink drink;

    public BurgurSet(String name, int price, int kcal, Hambuger hambuger, Side side, Drink drink) {
        super(name, price, kcal);
        this.hambuger = hambuger;
        this.side = side;
        this.drink = drink;
    }
    public BurgurSet(BurgurSet burgerSet) {
        super(burgerSet.getName(), burgerSet.getPrice(), burgerSet.getKcal());
        this.hambuger = new Hambuger(burgerSet.hambuger);
        this.side = new Side(burgerSet.side);
        this.drink = new Drink(burgerSet.drink);
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
