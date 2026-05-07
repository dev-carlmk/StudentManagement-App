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

     // Update Student
     public void updateStudent(String name){
        boolean found = false;

        for(Student s: students){
            if(s.name.equalsIgnoreCase(name)){
                s.name = "Updated Name";
                s.age = 99;
                s.course = "Updates Course";

                System.out.println("Student Updated !");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student Not Found !");
        }
     }
}