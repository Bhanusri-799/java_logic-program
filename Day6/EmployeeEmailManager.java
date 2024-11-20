//Create a LinkedHashSet to manage unique employee email IDs while maintaining the order of addition. Write methods to:
import java.util.LinkedHashSet;

public class EmployeeEmailManager {
   
    private LinkedHashSet<String> emailSet = new LinkedHashSet<>();
    public void addEmail(String email) {
        emailSet.add(email);
        System.out.println("Added: " + email);
    }
    public void removeEmail(String email) {
        if (emailSet.contains(email)) {
            emailSet.remove(email);
            System.out.println("Removed: " + email);
        } else {
            System.out.println("Email not found: " + email);
        }
    public void displayEmails() {
        System.out.println("Employee Email IDs in order of addition:");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
    
    public static void main(String[] args) {
        EmployeeEmailManager manager = new EmployeeEmailManager();
        manager.addEmail("bhanu@example.com");
        manager.addEmail("sri@example.com");
        manager.addEmail("Bhanu@example.com");
        manager.addEmail("Bhanusri@example.com");
        manager.displayEmails();
        manager.removeEmail("Bhanu@example.com");
        manager.displayEmails();
    }
}
