class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary); // parent class constructor
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary); // reused
        this.department = department;
    }
}

public class inheritanceProblem {
    public static void main(String[] args) {
        // object creation
        Employee emp = new Employee("Sushrut", 20, "1239", "Ambegaon", 90000.0, "Software Development");
        Manager mgr = new Manager("Atharv", 20, "1237", "Vadgaon", 80000.0, "Operations");

        System.out.println("-- Employee --");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Specialization: " + emp.specialization);

        System.out.println();

        System.out.println("-- Manager --");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        System.out.println("Salary: " + mgr.salary);
        System.out.println("Department: " + mgr.department);
    }
}