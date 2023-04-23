import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        Scanner sc = new Scanner(System.in);
        // populate employees array with sample data
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name : ");
            String name = sc.next();
            System.out.print("Enter department: ");
            String dept = sc.next();
            System.out.print("Enter salary : ");
            int sal = sc.nextInt();
            employees[i] = new Employee(i + 1, name, dept, sal);
        }
        System.out.print("Enter a name or ID to search for:");
        String query = sc.next();

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee == null) {
                // end of employee records
                break;
            }

            if (employee.getName().equals(query) || String.valueOf(employee.getId()).equals(query)) {
                System.out.println("Employee found:");
                System.out.println(employee);
                sc.close();
                return;
            }
        }

        System.out.println("No employee found with that name or ID.");
        sc.close();
    }
}