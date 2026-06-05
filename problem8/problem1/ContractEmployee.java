package problem1;

public class ContractEmployee extends Employee {
    public String projectName;
    public double contractAmount;
    public ContractEmployee(String name, int id, String department,
                            String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculatePay() {
        return contractAmount;
    }
}