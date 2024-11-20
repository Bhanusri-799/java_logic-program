//Write a program to store the names of your favorite fruits in a LinkedHashSet. Add duplicate names and observe the result.

import java.util.LinkedHashSet;

public class FavoriteFruits {
    public static void main(String[] args) {
        
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  
        
        System.out.println("Favorite Fruits: " + fruits);
    }
}