package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] products;
    public ShoppingCart(Food[] products){
        this.products = products;
    }

    public double getTotalWithoutDiscount() {
        double total = 0;
        for (Food item : products) {
            total += item.getPrice() * item.getAmount(); //
        }
        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        for (Food item : products) {
            double price = item.getPrice();
            int amount = item.getAmount();
            double discount = 0;

            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }

            total += price * amount * (100 - discount) / 100;
        }
        return total;
    }

    public double getVegetarianTotalWithoutDiscount() {
        double total = 0;
        for (Food item : products) {
            if (item.isVegetarian()) {
                total += item.getPrice() * item.getAmount();
            }
        }
        return total;
    }
}
