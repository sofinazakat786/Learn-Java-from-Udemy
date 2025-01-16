import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;
    private Map<String, String> players;

    //Constructor Task 1
    public Team(String name){
        this.name = name;
        this.players = new HashMap<>();
    }

    //Getters and Setters  == Task 2
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer(String position) {
        return players.get(position); //return a player from hashmap
    }

    public void setPlayer(String position, String player) {
        players.put(position, player); //Add a <String, String> entry into the Hashmap
    }


}
