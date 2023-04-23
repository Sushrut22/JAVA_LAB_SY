import java.util.Scanner;

class Interview {
    private String name;
    private int age;
    private String email;
    private String phone;

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age cannot be less than 18");
        }
        this.age = age;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain '@' symbol");
        }
        this.email = email;
    }

    public void setPhone(String phone) {
        if (phone.length() != 10) {
            throw new IllegalArgumentException("Phone number must be 10 digits long");
        }
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}

public class exceptionHandling2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Interview interview = new Interview();

        System.out.print("Enter your name: ");
        try {
            interview.setName(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.print("Enter your age: ");
        try {
            interview.setAge(Integer.parseInt(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid age format");
            scanner.close();
            return;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.print("Enter your email: ");
        try {
            interview.setEmail(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.print("Enter your phone number: ");
        try {
            interview.setPhone(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.println("Name: " + interview.getName());
        System.out.println("Age: " + interview.getAge());
        System.out.println("Email: " + interview.getEmail());
        System.out.println("Phone: " + interview.getPhone());
        scanner.close();
    }
}