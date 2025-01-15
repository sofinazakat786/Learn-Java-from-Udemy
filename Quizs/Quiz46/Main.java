
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 18);
        Student charlie = new Student("Charlie", 24);

        HashMap<Student, Integer> hashMap = new HashMap<>();

        hashMap.put(alice, 1);
        hashMap.put(bob, 2);
        hashMap.put(charlie, 3);


        Student alice3 = alice;
        System.out.println(hashMap.get(alice3));
        // Student alice2 = new Student("Alice", 20);
        // System.out.println(hashMap.get(alice2));

        
    }
}
