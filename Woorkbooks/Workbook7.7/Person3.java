
import java.util.Arrays;

public class Person3 {

    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;
    private String[] passport;

    //Constructor
    public Person3(String name, String nationality, String dateOfBirth, int seatNumber, String[] passport) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    public void setPassport() {
        // this.passport = passport;
        this.passport = new String[]{this.name, this.nationality, this.dateOfBirth};
    }
    // toString method
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
               "Nationality: " + nationality + "\n" +
               "Date of Birth: " + dateOfBirth + "\n" +
               "Seat Number: " + seatNumber + "\n" +
               "Passport: " + passport.toString() + "\n";
    }
}