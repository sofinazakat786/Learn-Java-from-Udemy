public class Passport3 {
    private String name;
    private String nationality;
    private String dateOfBirth;

    // Constructor
    public Passport3(String name, String nationality, String dateOfBirth) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    // toString method for Passport
    @Override
    public String toString() {
        return "[" + name + ", " + nationality + ", " + dateOfBirth + "]";
    }
}