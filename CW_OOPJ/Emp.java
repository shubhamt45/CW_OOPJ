class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    // Method to display employee details
    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}

public class SimpleEmployee {
    public static void main(String[] args) {
        // Creating 3 employees
        Employee e1 = new Employee(101, "Amit", 50000);
        Employee e2 = new Employee(102, "Rahul", 60000);
        Employee e3 = new Employee(103, "Priya", 55000);

        // Displaying employees
        e1.display();
        e2.display();
        e3.display();
    }
}
