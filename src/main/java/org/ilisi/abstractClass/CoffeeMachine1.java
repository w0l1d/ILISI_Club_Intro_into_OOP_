package org.ilisi.abstractClass;

public class CoffeeMachine1 extends CoffeMachine {

    public CoffeeMachine1(int coins, int sugar, int coffee) {
        super(coins, sugar, coffee);
    }

    @Override
    public void serveCoffee() {
        //serve in way 1
        System.out.println("Cafe servi");


    }
}
