package Workbook9_2;

import java.util.HashMap;
import java.util.Map;

public class Team {
    private String name;

    // private Map<String, String> players;
    private Map<Position, String> players;

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

    public String getPlayer(Position position) {
        return players.get(position); //return a player from hashmap
    }

    public void setPlayer(Position position, String player) {
        if (position == null) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        players.put(position, player); //Add a <String, String> entry into the Hashmap
    }


}
