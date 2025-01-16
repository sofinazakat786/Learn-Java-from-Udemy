public class Main {
    public static void main(String[] args) {
        Team bulls = new Team("Chigago Bulls");
        bulls.setPlayer("SHOOTING_GUARD", "Micheal Jordan");
        bulls.setPlayer("SMALL_FORWARD", "Schotte Handler");
        bulls.setPlayer("POWER_GUARD", "Denis Rando");
        bulls.setPlayer("CENTER", "Bell Wninstern");
        bulls.setPlayer("POINT_GUARD", "Randy Brown");

        Team pistons = new Team("Detroit Pistons");
        pistons.setPlayer("SHOOTING_GUARD", "Randy Brown");
        pistons.setPlayer("SMALL_FORWARD", "Bell Wninstern");
        pistons.setPlayer("POWER_GUARD", "Schotte Handler");
        pistons.setPlayer("CENTER", "Micheal Jordan");
        pistons.setPlayer("POINT_GUARD", "Denis Rando");

        Game game = new Game("Etihad Stadium");
        game.begin(bulls, pistons);




        


    }
}
