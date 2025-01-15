public class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() method to print the properties of the Person class
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    // Override equals() to compare Person objects by their content (name and age)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}