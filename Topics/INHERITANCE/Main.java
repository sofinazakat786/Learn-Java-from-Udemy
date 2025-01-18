import product.Pants; // Importing the Shirt class from the product package
import product.Product;
import product.Shirt;

public class Main {

    public static void main(String[] args) {

        Shirt shirt1 = new Shirt();
        Shirt shirt2 = new Shirt(10.99, "RED", "Adidas", Shirt.Size.SMALL);
        
        Product shirt3 = new Shirt();
        shirt3.setBrand("Levi's");
        shirt3.fold();
        productStore(shirt3);

        // Example usage
        shirt1.setBrand("Nike");
        shirt1.setColor("Blue");
        shirt1.setPrice(29.99);
        shirt1.setSize(Shirt.Size.LARGE);
        // shirt1.fold();
        // productStore(shirt1);
        shirt2.fold();
        productStore(shirt2);

        Pants pant = new Pants();
        pant.setBrand("Puma");
        pant.setWaist(32);
        pant.setLength(42);
        pant.setColor("Blue");
        pant.setPrice(39.2);
        pant.fold();
        productStore(pant);
    }

    public static void productStore(Product product){
        System.out.println("Thanks you for purchasing "+ product.getBrand()+" "+ product.getClass().getSimpleName().toLowerCase()+"."+ " YOur total comes to "+  product.getPrice());
    }



    // public static void pantStore(Pants pants){
    //     System.out.println("Thanks you for purchasing "+ pants.getBrand()+ " YOur total comes to "+ pants.getPrice());
    // }

    // public static void shirtStore(Shirt shirt){
    //     System.out.println("Thanks you for purchasing "+ shirt.getBrand()+ " YOur total comes to "+ shirt.getPrice());
    // }
}
