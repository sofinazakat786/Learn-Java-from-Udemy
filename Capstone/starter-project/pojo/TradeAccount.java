package pojo;

public abstract class TradeAccount {

    private String id;

    //Constructor
    public TradeAccount(String id) {
        this.id = id;
    }

    //Getters and Setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract TradeAccount clone();

}
