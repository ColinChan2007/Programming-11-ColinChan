public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int studentNumber;

    private static int nextStudentNumber = 1000; // A starting point for unique student numbers

    public Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = nextStudentNumber++;
    }

    // Add getters and setters here...

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + " Grade: " + grade + " Student Number: " + studentNumber;
    }
}