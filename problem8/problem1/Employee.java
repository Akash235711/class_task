package problem1;

public abstract class Employee {
    public String name;
    public int id;
    public String department;
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    public abstract double calculatePay();
    @Override
    public String toString() {
        return String.format("Name: %s | ID: %d | Department: %s | Pay: $%.2f",
                name, id, department, calculatePay());
    }
}