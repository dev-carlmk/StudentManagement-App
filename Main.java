import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while(true){
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Count Students");
            System.out.println("4. Search Students");
            System.out.println("5. Delete Students");

            System.out.print("Choose option: ");
            int choice = input.nextInt();
            input.nextLine(); // clear buffer

            if(choice == 1){
                System.out.print("Enter name: ");
                String name = input.nextLine();

                System.out.print("Enter age: ");
                int age = input.nextInt();
                input.nextLine();

                System.out.print("Enter course: ");
                String course = input.nextLine();

                Student s = new Student(name, age, course);
                manager.addStudent(s);

            } else if(choice == 2){
                manager.viewStudents();

            } else if(choice == 3){
                manager.countStudents();

            } else if(choice == 4) {
                System.out.println("Enter Name to Search: ");
                String name = input.nextLine();
                manager.searchStudents(name);

            }else if (choice == 5){
                System.out.println("Enter Name to Delete: ");
                String name = input.nextLine();
                manager.searchStudents(name);
            }
        }
        input.close();
    }
}