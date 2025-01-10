
import java.util.Arrays;



public class Main {
    public static void main(String[] args) {
        
        Dessert cake = new Dessert(4.99);
        Dessert pie = new Dessert(cake);
 
        String[] ingredients = new String[] {"Eggs", "Flower", "Baking Powder"};
        pie.setIngredients(ingredients);
       
        ingredients[2] = "Filling";
    //    *** BREAKPOINT 1 ***
    System.out.println(Arrays.toString(pie.getIngredients()));
 
    }
}