
public class StringArray {

    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        int wins = 0;
        int losses = 0;

        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins++;
                // continue;
            } else {
                losses++;
            }

        }

        System.out.println(
                "With a professional record of " + wins + " wins and " + losses + " losses .\nHe is the pirde of oracle: java Fury!");

        String[] apples = {"Gala", "Granny Smith", "Macintosh", "delicius"};
        Double[] prices = {1.99, 1.49, 1.29};

        for (int i = 0; i < Math.min(apples.length, prices.length); i++) {
            System.out.println("Apple: " + apples[i] + " Price: $ " + prices[i]);
        }
    }

}
