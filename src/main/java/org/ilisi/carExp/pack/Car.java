package org.ilisi.carExp.pack;

public class Car {
    //attributes - fields
    private int nrbSeats;
    private float speed;
    private boolean isOn;
    private String color;

    //constructor
    public Car() {
    }

    //behavior - methods
    public void startEngine() {
        isOn = true;
    }
    public void stopEngine() {
        isOn = false;
    }
    public void speedUp(float amount) {
        speed += amount;
    }
    public void slowDown(float amount) {
        speed -= amount;
    }
}
