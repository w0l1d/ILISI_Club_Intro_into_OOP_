package org.ilisi.entrepriseExp;

// Concrete subclass representing an Intern, which is a type of Employee
class Intern extends Employee {
    private String mentor;

    public Intern(String name, int age, double salary, String mentor) {
        super(name, age, salary);
        this.mentor = mentor;
    }

    public void work() {
        System.out.println(getName() + ", the Intern, is learning from " + mentor + ".");
    }

    public String getMentor() {
        return mentor;
    }
}