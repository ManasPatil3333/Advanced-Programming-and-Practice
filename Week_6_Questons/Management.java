abstract class Employee {
    String name;
    String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    abstract double calculateSalary();
    abstract String getEmployeeDetails();
}

class RegularEmployee extends Employee {
    double baseSalary;
    double bonus;

    public RegularEmployee(String name, String employeeId, double baseSalary, double bonus) {
        super(name, employeeId);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    String getEmployeeDetails() {
        return "Regular Employee: " + name + ", ID: " + employeeId + ", Base Salary: $" + baseSalary + ", Bonus: $" + bonus;
    }
}

class ContractEmployee extends Employee {
    double contractAmount;

    public ContractEmployee(String name, String employeeId, double contractAmount) {
        super(name, employeeId);
        this.contractAmount = contractAmount;
    }

    @Override
    double calculateSalary() {
        return contractAmount;
    }

    @Override
    String getEmployeeDetails() {
        return "Contract Employee: " + name + ", ID: " + employeeId + ", Contract Amount: $" + contractAmount;
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public HourlyEmployee(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    String getEmployeeDetails() {
        return "Hourly Employee: " + name + ", ID: " + employeeId + ", Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}

public class Management {
    public static void main(String[] args) {
        Employee regularEmployee = new RegularEmployee("Alice", "E001", 50000, 10000);
        Employee contractEmployee = new ContractEmployee("Bob", "E002", 60000);
        Employee hourlyEmployee = new HourlyEmployee("Charlie", "E003", 20, 160);

        System.out.println(regularEmployee.getEmployeeDetails());
        System.out.println("Salary: $" + regularEmployee.calculateSalary());

        System.out.println(contractEmployee.getEmployeeDetails());
        System.out.println("Salary: $" + contractEmployee.calculateSalary());

        System.out.println(hourlyEmployee.getEmployeeDetails());
        System.out.println("Salary: $" + hourlyEmployee.calculateSalary());
    }
}