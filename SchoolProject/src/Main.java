public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Add 10 students to the student list
        school.addStudent(new Student("John", "Doe", 10));
        // Add more students here...

        // Add 3 teachers to the teacher list
        school.addTeacher(new Teacher("Alice", "Smith", "Mathematics"));
        // Add more teachers here...

        // Display both lists
        System.out.println("Students:");
        school.showAllStudents();
        System.out.println("\nTeachers:");
        school.showAllTeachers();

        // Remove 2 students
        school.deleteStudent("John Doe");
        // Remove more students here...

        // Remove 1 teacher
        school.deleteTeacher("Alice Smith");
        // Remove more teachers here...

        // Display both lists again
        System.out.println("\nStudents:");
        school.showAllStudents();
        System.out.println("\nTeachers:");
        school.showAllTeachers();
    }
}