package org.ilisi.entrepriseExp;

// Concrete subclass representing a Director, which is a type of Employee
class Director extends Employee {
    private String department;

    public Director(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public void work() {
        System.out.println(getName() + ", the Director, is managing the " + department + " department.");
    }

    public String getDepartment() {
        return department;
    }
}