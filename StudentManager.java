import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // View all students
    public void viewStudents(){
        if(students.isEmpty()){
            System.out.println("No students found.");
        } else {
            for(Student s : students){
                s.display();
            }
        }
    }
}