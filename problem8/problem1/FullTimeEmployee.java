package problem1;

public class FullTimeEmployee extends Employee {
    public double fixedSalary;
    public FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }
    @Override
    public double calculatePay() {
        return fixedSalary;
    }
}