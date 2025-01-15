public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 21);
        Student student2 = student1;
        //Question 1
        System.out.println(student1.hashCode());
        System.err.println(student2.hashCode());

        //Question2 
        System.out.println(student1.equals(student2));

        //Qusetion 3
        Student student3 = new Student("Mice", 21);
        Student student4 = new Student("Mice", 21);

        System.out.println("Student 3 Hashcode: "+ student3.hashCode());
        System.out.println("Student 4 Hashcode: "+ student4.hashCode());

        System.out.println("Student 3 = student 4: "+ student3.equals(student4));

    }
}
