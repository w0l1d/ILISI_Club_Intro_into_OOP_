package org.ilisi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}



class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

class Cat extends Animal {
    private String breed;

    public Cat() {
    }

    public Cat(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }
}


abstract class Shape {
    public abstract void area();
}

class Rectangle extends Shape {
    public void area() {
        System.out.println("Area of rectangle is length * width");
    }
}

class Circle extends Shape {
    public void area() {
        System.out.println("Area of circle is pi * radius * radius");
    }
}


//methdoe overloading polymorphism exqmple
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, float b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}