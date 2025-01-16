
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Game {
    private String arena;
    private LocalDate date;

    public Game(String arena){
        this.arena = arena;
        this.date = LocalDate.now();

    }
    public void begin(Team home, Team away){
        // String formattedDate = date.getDayOfMonth() + "/"+ date.getMonthValue()+ "/" date.getYear();
        String formattedDate = this.date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        System.out.println(
            "\n - This matchup takes place at the " + this.arena + "arena on "+ formattedDate +" . "+ 
            "\n - Tonight's game is between the "+ home.getName()+ " and the "+ away.getName()+ " .\n"+
            "\n - The starting lineup for the home team is : at poitn guard, "+ home.getPlayer("POINT_GUARD") + " at shooting guard, "+ 
            "\n - The starting lineup for the visiting team is : at poitn guard, "+ "<AWAY_POITN_GUARD" + "; at ------"+
            "\n - Let's give a warem round of applause for both teams as they take the court!" 

        );
    }

}
