
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up user account");

        System.out.println("Your username is currently " + user.getUserName() + ". Please update it here ");
        user.setUserName("nazakat");
        System.out.println("Your username is currently " + user.getUserName());


        System.out.println("your age is currently "+ user.getAge() + ". Please update it here: ");
        user.setAge(scanner.nextInt());
        System.out.println("your age is currently "+ user.getAge());


        System.out.println("Your username is currently " + user.getUserName()+ "your age is currently "+ user.getAge());
        scanner.close();
    }
}