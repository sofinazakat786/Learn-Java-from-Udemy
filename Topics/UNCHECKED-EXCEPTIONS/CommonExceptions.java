import java.util.Scanner;

public class CommonExceptions {
    public static void main(String[] args) {
        int[] grades = new int[] { 96, 65, 56, 86};
        System.out.println(grades[3]);


        String[] names = new String[7];
        names[0] = "John";
        names[1] = "him";
        names[2] = "Joe";

        for( String name : names){
            if (name != null){
                System.out.println(name.toUpperCase());
            }
            
        }
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a rondom integer: ");
        if ( scan.hasNextInt()){
            scan.nextInt();
        }
        scan.close();
    }
}