
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 15));

        System.out.println("Numbers before sort: "+ numbers);
        // for (int i = 0; i < numbers.size(); i++) {
        //     for (int j = 0; j < numbers.size() - 1; j++) {
        //         if (numbers.get(j) > numbers.get(j + 1)) {
        //             int temp = numbers.get(j);
        //             numbers.set(j, numbers.get(j + 1));
        //             numbers.set(j + 1, temp);
        //         }
        //     }
        // }
        // System.out.println("Sorted Numbers: " + numbers);

        

        // Sort by lambda expression  (a, b) -> a.compareTo(b)
        ArrayList<Integer> asc_numbers = new ArrayList<>(numbers);
        asc_numbers.sort((a, b) -> a.compareTo(b)); //Accending order

        ArrayList<Integer> dsc_numbers = new ArrayList<>(numbers);
        dsc_numbers.sort((a, b) -> b.compareTo(a));   //Decending order

        System.out.println("Ascessing order  by lambda ex: "+asc_numbers);
        System.out.println("Decending order  by lambda ex: "+dsc_numbers);



    }

}
