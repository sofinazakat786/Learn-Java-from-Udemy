
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        /**
         * *************************************** HASHCODE **********************************************
         */
        Contact contact = new Contact("Alice", 30);
        Contact contactCopy = contact;

        System.out.println("First Hashcode: " + contact.hashCode());
        System.out.println("Second Hashcode: " + contactCopy.hashCode());

        /**
         * *************************************** EQUILITY **********************************************
         */
        System.out.println("Equality: " + contact.equals(contactCopy));

        /**
         * *************************************** HASHCODE AND EQUALS **********************************************
         */
        Map<Contact, String> peopleMap = new HashMap<>();
        peopleMap.put(new Contact("Alice", 30), "1806 Farm Meadow Drive");
        peopleMap.put(new Contact("Bob", 20), "4046 Weekly street");

        peopleMap.put(new Contact("Stephen", 36), "4046 Weekly street");
        peopleMap.put(new Contact("Lauren", 37), "4046 Weekly street");
        peopleMap.put(new Contact("Adam", 42), "4046 Weekly street");
        peopleMap.put(new Contact("Noah", 41), "4046 Weekly street");

        System.out.println("\nAlice's address is : " + peopleMap.get(new Contact("Alice", 30)));
        System.out.println("\nAdam's address is: " + peopleMap.get(new Contact("Adam", 42)));

        System.out.println("\n Is Noah, 41 years of age, in my contacts?");
        String response = peopleMap.containsKey(new Contact("Noah", 41)) ? "Yes!" : "No, Sorry";
        System.out.println(response);

    }
}
