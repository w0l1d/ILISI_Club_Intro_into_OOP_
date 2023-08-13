package org.ilisi.abstractClass;

public abstract class CoffeMachine {

    private int coins;
    private int sugar;
    private int coffee;

    public CoffeMachine(int coins, int sugar, int coffee) {
        this.coins = coins;
        this.sugar = sugar;
        this.coffee = coffee;
    }

    public void choosePetite() {
        if (coins == 1)
            serveCoffee();
        else
            System.out.println("Pas assez de monnaie");
    }

    public void chooseGrand() {
        if (coins == 2)
            serveCoffee();
        else
            System.out.println("Pas assez de monnaie");
    }

    public void chooseAnnuler() {
        System.out.println("Annulation de la commande");
    }

    public abstract void serveCoffee();

    public void add1Dh() {
        coins +=1;
    }

    public void add2Dh() {
        coins += 2;
    }






}
