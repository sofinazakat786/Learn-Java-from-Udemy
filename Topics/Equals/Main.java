
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person john = new Person("John", 30);
        Person amy = new Person("Amy", 28);
        Person sasha = new Person("Sasha", 29);

        List<Person> personList = new ArrayList<>();
        personList.add(john);
        personList.add(amy);
        personList.add(sasha);

        // Check if a specific person is in the list (e.g., "John" with age 30)
        boolean isPresent = personList.contains(new Person("John", 30));
        
        // Print each person in the list
        int index = 1;
        for (Person person : personList) {
        
            System.out.println(index  + ": " + person);
            index ++;
            
        }

        // Print whether "John" with age 30 is present in the list
        System.out.println("Is John 30 present? " + isPresent);
    }
}
