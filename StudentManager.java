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

    // Count all Students
    public void countStudents(){
        System.out.println("Total Students: " + students.size());
    }

    //Search student
    public void searchStudents(String name){
        boolean found = false;
        
        for(Student s: students){
            if(s.name.equalsIgnoreCase(name)){
                s.display();
                found = true;
            }
        } if (!found){
            System.out.println("Student Not Found !");
        }
    }
}