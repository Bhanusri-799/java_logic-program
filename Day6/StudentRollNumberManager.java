//Create a HashSet to store student roll numbers. Write methods to:
import java.util.HashSet;

public class StudentRollNumberManager {
    private HashSet<Integer> rollNumbers = new HashSet<>();
    public void addRollNumber(int rollNumber) {
        rollNumbers.add(rollNumber);
        System.out.println("Added roll number: " + rollNumber);
    }
    public boolean checkRollNumberExists(int rollNumber) {
        return rollNumbers.contains(rollNumber);
    }
    public void removeRollNumber(int rollNumber) {
        if (rollNumbers.contains(rollNumber)) {
            rollNumbers.remove(rollNumber);
            System.out.println("Removed roll number: " + rollNumber);
        } else {
            System.out.println("Roll number not found: " + rollNumber);
        }
    }
    public void displayRollNumbers() {
        System.out.println("All student roll numbers:");
        for (int rollNumber : rollNumbers) {
            System.out.println(rollNumber);
        }
    }

    public static void main(String[] args) {
        StudentRollNumberManager manager = new StudentRollNumberManager();
        manager.addRollNumber(101);
        manager.addRollNumber(102);
        manager.addRollNumber(103);
        manager.addRollNumber(101);
        System.out.println("Does roll number 102 exist? " + manager.checkRollNumberExists(102));
        manager.removeRollNumber(102);
        manager.displayRollNumbers();
    }
}
