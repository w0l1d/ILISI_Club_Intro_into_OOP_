package org.ilisi.abstractClass;

public class CoffeeMachine2  extends CoffeMachine {
    public CoffeeMachine2(int coins, int sugar, int coffee) {
        super(coins, sugar, coffee);
    }

    @Override
    public void serveCoffee() {
        // served in way 2
        System.out.println("Cafe servi");
    }
}
