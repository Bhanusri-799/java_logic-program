//Write a program to store the names of cities using HashSet. Add duplicate names and verify if duplicates are removed.
import java.util.HashSet;

public class CityManager {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Delhi");  
        cities.add("Chennai");
        System.out.println("Cities: " + cities);
    }
}
