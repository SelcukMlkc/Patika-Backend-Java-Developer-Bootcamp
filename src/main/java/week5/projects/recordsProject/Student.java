package week5.projects.recordsProject;

// Define the Student record
public record Student(String firstName, String lastName, int studentNumber) {
    // No need to manually write constructors, getters, toString, equals, or hashCode
}

class StudentRecordApp {

    public static void main(String[] args) {

        // Create student objects using the record
        Student student1 = new Student("Ali", "Güneş", 1001);
        Student student2 = new Student("Ayşe", "Demir", 1002);
        Student student3 = new Student("Ali", "Güneş", 1001); // Same as student1 for equals test

        // Print student details
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("------------------------");

        // Check equality
        System.out.println("student1 equals student2? " + student1.equals(student2)); // false
        System.out.println("student1 equals student3? " + student1.equals(student3)); // true

        // Check hash codes
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
    }
}