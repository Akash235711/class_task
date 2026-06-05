package problem1;

public class PartTimeEmployee extends Employee {
    public double hourlyRate;
    public int hoursWorked;
    public PartTimeEmployee(String name, int id, String department,
                            double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}