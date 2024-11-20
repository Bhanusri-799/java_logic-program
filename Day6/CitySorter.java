//Write a program to store the names of cities in a TreeSet. Observe how they are sorted.
import java.util.TreeSet;

public class CitySorter {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        System.out.println("Sorted Cities: " + cities);
    }
}
