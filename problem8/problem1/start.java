package problem1;
import problem1.ContractEmployee;
import problem1.Employee;
import problem1.FullTimeEmployee;
import problem1.PartTimeEmployee;
public class start {
    public static void main(String[] args) {

        Employee[] employees = {
                new FullTimeEmployee("Alice", 101, "Engineering", 5000.00),
                new PartTimeEmployee("Bob", 102, "Marketing", 20.0, 80),
                new ContractEmployee("Carol", 103, "Design", "Website Redesign", 3500.00)
        };

        System.out.println("===== Employee Pay Report =====");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}