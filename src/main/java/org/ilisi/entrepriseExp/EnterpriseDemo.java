package org.ilisi.entrepriseExp;

// Main class to demonstrate the principles
public class EnterpriseDemo {
    public static void main(String[] args) {
        // Using compile-time polymorphism (method overloading)
        printEmployeeDetails(new Director("John", 45, 8000.0, "Finance"));
        printEmployeeDetails(new Developer("Alice", 30, 6000.0, "Java"));
        printEmployeeDetails(new Intern("Bob", 22, 2000.0, "Senior Developer"));

        // Using runtime polymorphism (method overriding)
        Employee employee1 = new Director("Michael", 50, 9000.0, "Marketing");
        Employee employee2 = new Developer("Eve", 28, 6500.0, "Python");

        employee1.work();
        employee2.work();
    }

    // Method to print employee details using compile-time polymorphism
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println();
    }
}
