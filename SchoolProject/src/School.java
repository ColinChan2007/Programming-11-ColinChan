import java.util.ArrayList;

public class School {
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    // Add your three additional fields here...

    public School() {
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        // Initialize your three additional fields here...
    }

    // Add methods to add teachers, students, delete teachers, students,
    // and show all teachers and students here...

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void deleteTeacher(String fullName) {
        // Implement the logic to delete a teacher from the list
    }

    public void showAllTeachers() {
        // Implement the logic to display all teachers
    }

    // Add more methods here...

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String fullName) {
        // Implement the logic to delete a student from the list
    }

    public void showAllStudents() {
        // Implement the logic to display all students
    }

    // Add more methods here...
}