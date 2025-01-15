
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public static void main(String[] args) {

        Map<String, Double> inventory = new HashMap<>();
        // Map<String, Double> inventory = new LinkedHashMap<>(); //Preserves the order of insertion
        inventory.put("Bananas", 3.99);
        inventory.put("Papaya", 5.99);
        inventory.put("Mango", 5.69);
        
        inventory.put("Carrots", 3.87);
        inventory.put("Lime", 0.29);
        inventory.put("Toothpaste", 5.99);
        inventory.put("Zuhci", 2.99);
        inventory.put("Apples", 1.99);

        System.out.println("\n welcome to Java Grocers. What can we help you find?: \n");

        System.out.println("\nWhat is the price of Lime");

        System.out.println("Price of Lime: "+ inventory.get("Lime"));
        System.out.println(inventory);
        

        
    }
}
