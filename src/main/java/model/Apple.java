package model;

import model.constants.Discount;
import model.constants.Colour;

public class Apple extends Food implements Discountable {
    public  Colour colour;

    public Apple (int amount, double price, Colour colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(this.colour)) {
            return Discount.DISCOUNT_RED_APPLE;
        }
        return 0;
    } //
}
