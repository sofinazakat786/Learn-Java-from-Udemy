import static Workbook9_2.Position.*;

public class Main {
    public static void main(String[] args) {
        Team bulls = new Team("Chicago Bulls");
        bulls.setPlayer(SHOOTING_GUARD, "Michael Jordan");
        bulls.setPlayer(SMALL_FORWARD, "Scottie Pippen");
        bulls.setPlayer(POWER_FORWARD, "Dennis Rodman");
        bulls.setPlayer(CENTER, "Bill Wennington");
        bulls.setPlayer(POINT_GUARD, "Randy Brown");

        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer(SHOOTING_GUARD, "Joe Dumars");
        pistons.setPlayer(SMALL_FORWARD, "Mark Aguirre");
        pistons.setPlayer(POWER_FORWARD, "Rick Mahorn");
        pistons.setPlayer(CENTER, "James Edwards");
        pistons.setPlayer(POINT_GUARD, "Isiah Thomas");

        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);
    }
}
