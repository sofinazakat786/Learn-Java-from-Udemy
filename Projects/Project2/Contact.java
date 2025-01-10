
import java.time.LocalDate;
import java.time.Period;

public class Contact {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    // Age calculator
    public int toAge(String birthDate) {
        LocalDate curDate = LocalDate.now();
        LocalDate dob = LocalDate.parse(birthDate);
        return Period.between(dob, curDate).getYears();
    }

    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "\n"
                + "Phone number: " + this.phoneNumber + "\n"
                + "Birth Date: " + this.birthDate + "\n"
                + "Age: " + this.age + " year old\n";
    }

}
