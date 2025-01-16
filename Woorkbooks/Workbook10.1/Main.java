public class Main {
    public static void main(String[] args) {
        // Instantiate the Game class
        Game basketballGame = new Game();
        
        // Print basketball game details using the Game class
        System.out.println("Basketball Game Rules and Specifications:");
        System.out.println(basketballGame.details());
        
        // Example: Accessing specific regulations directly from the Regulation class
        System.out.println("\nIndividual Rule Access:");
        System.out.println("Court Length: " + Regulation.COURT_LENGTH + " feet");
        System.out.println("Rim Height: " + Regulation.RIM_HEIGHT + " feet");
        System.out.println("Three-Point Distance: " + Regulation.THREE_POINT_DISTANCE + " feet");
        System.out.println("Possession Time: " + Regulation.POSSESSION_TIME + " seconds");
        
        // Example: Using constants in a custom calculation
        int totalScore = Regulation.FREE_THROW + Regulation.INSIDE_THREE_POINT_ARC + Regulation.BEYOND_THREE_POINT_ARC;
        System.out.println("\nCustom Calculation:");
        System.out.println("Total possible score from one free throw, one 2-point, and one 3-point shot: " + totalScore);
    }
}
