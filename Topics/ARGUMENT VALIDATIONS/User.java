public class User {
    private String username;
    private int age;

    public int getAge(){
        return this.age;
    }
    public void  setAge(int age){
        if (age < 0 ){
            throw new IllegalArgumentException("Age can't be negative");
        }
        this.age = age;
    }

    public String getUserName(){
        return this.username;
    }

    public void setUserName(String username){
        if (username == null || username.isBlank()){
            throw  new IllegalArgumentException("Username can't be null or blank");
        }
        this.username = username;
    }
}
