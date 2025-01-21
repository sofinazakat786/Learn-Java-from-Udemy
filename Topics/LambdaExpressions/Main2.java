
import java.util.Arrays;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        // prices.stream()
        //         .filter(price -> {
        //             return price > 100;
        //         }).map(price -> {
        //     return price - 20;
        // }).sorted((right, left) -> {
        //     return right.compareTo(left);
        // }).map(price -> {
        //     return "S " + price;
        // }).forEach(price -> {
        //     System.out.println(price);
        // });
        prices.stream()
                .filter(price -> price > 100) //Filter: Retain prices greater than 100.
                .map(price -> price - 20) //Map: Subtract 20 from each price.
                .sorted((a, b) -> a.compareTo(b)) //Sort: Arrange the prices in ascending order.
                .map(price -> "$ " + price) //Map: Add the "S " prefix to each price.
                .forEach(price -> System.out.println(price));  //ForEach: Print each price.

    }
}
