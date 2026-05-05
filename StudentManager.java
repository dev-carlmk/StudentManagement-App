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

    // Delete student
     public void deleteStudents(String name){
         boolean removed = false;

         for(int i=0; i < students.size(); i++){
             if(students.get(i).name.equalsIgnoreCase(name)){
                 students.remove(i);
                 System.out.println("Student removed !");
                 removed = true;
                 break;     
             }
         }
    }
}