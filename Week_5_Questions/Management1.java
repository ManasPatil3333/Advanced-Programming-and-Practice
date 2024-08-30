class Employee {
    String name;
    int baseSalary;

    public Employee(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    int bonus;

    public Manager(String name, int baseSalary, int bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public int calculateSalary() {
        return baseSalary + bonus;
    }
}

class Programmer extends Employee {
    int overtimePay;

    public Programmer(String name, int baseSalary, int overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }

    @Override
    public int calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class Management1 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 50000, 10000);
        Employee programmer = new Programmer("Bob", 40000, 5000);

        System.out.println("Manager's Salary: $" + manager.calculateSalary());
        System.out.println("Programmer's Salary: $" + programmer.calculateSalary());
    }
}