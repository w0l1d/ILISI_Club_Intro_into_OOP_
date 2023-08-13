package org.ilisi.entrepriseExp;

// Concrete subclass representing a Developer, which is a type of Employee
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void work() {
        System.out.println(getName() + ", the Developer, is coding in " + programmingLanguage + ".");
    }

    public void work(String project) {
        System.out.println(getName() + ", the Developer, is coding in " + programmingLanguage + " in the project " + project + " .");
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
