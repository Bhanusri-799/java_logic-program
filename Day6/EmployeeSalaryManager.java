//Create a TreeSet to store salaries of employees in an organization. Write methods to:
import java.util.TreeSet;

public class EmployeeSalaryManager {
    private TreeSet<Integer> salaries = new TreeSet<>();
    public void addSalary(int salary) {
        salaries.add(salary);
        System.out.println("Added Salary: ₹" + salary);
    }
    public void findLowestSalary() {
        if (!salaries.isEmpty()) {
            System.out.println("Lowest Salary: ₹" + salaries.first());
        } else {
            System.out.println("No salaries found.");
        }
    }
    public void findHighestSalary() {
        if (!salaries.isEmpty()) {
            System.out.println("Highest Salary: ₹" + salaries.last());
        } else {
            System.out.println("No salaries found.");
        }
    }
    public void displaySalaryRange() {
        System.out.println("Salaries between ₹30,000 and ₹70,000:");
        for (int salary : salaries.subSet(30000, true, 70000, true)) {
            System.out.println("₹" + salary);
        }
    }

    public static void main(String[] args) {
        EmployeeSalaryManager manager = new EmployeeSalaryManager();
        manager.addSalary(50000);
        manager.addSalary(30000);
        manager.addSalary(70000);
        manager.addSalary(60000);
        manager.addSalary(45000);
        manager.addSalary(80000);  
        manager.findLowestSalary();
        manager.findHighestSalary();
        manager.displaySalaryRange();
    }
}
