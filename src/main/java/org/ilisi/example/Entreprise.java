package org.ilisi.example;

interface Managable {
    public void manage();
}

abstract class Employee {
    public static int TAX = 5;
    private String name;
    private String address;
    private double salary;

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }



    public abstract void work();
    public abstract void getNetSalary();

    public Double getSalary() {
        return salary;
    }
}


class Seller extends Employee {
    private double bonus;

    public void work() {
        System.out.println("Seller is working");
    }

    public static void work(String product) {
        System.out.println("Seller is selling " + product);

    }

    public void getNetSalary() {
        System.out.println("Manager salary is: " + (this.getSalary() + this.bonus));
    }

    public Seller(String name, String address, double salary, double bonus) {
        super(name, address, salary);
        this.bonus = bonus;
    }
}

class Director extends Employee implements Managable {

    private String departement;

    public Director(String name, String address, double salary, String departement) {
        super(name, address, salary);
        this.departement = departement;
    }

    @Override
    public void work() {
        System.out.println("Director is working in departement " + this.departement);
    }

    @Override
    public void getNetSalary() {

    }

    @Override
    public void manage() {
        System.out.println("Director is managing departement " + this.departement);
    }
}



public class Entreprise {

    public static void main(String[] args) {
        Employee e1 = new Director("John", "Rue 1", 1000, "IT");
        Employee e2 = new Seller("Jack", "Rue 2", 1000, 100);

        System.out.println(Employee.TAX);


    }
}
