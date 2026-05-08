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
            System.out.println("4. Delete Students");
            System.out.println("5. Search Students");
            System.out.println("6. Update Students Info");
            System.out.println("7. Exit");

            System.out.print("Choose option: ");
            int choice = input.nextInt();
            input.nextLine();

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

            } else if(choice == 4){
                System.out.print("Enter Name: ");
                manager.deleteStudents(input.nextLine());

            } else if(choice == 5){
                System.out.print("Enter Name: ");
                manager.searchStudents(input.nextLine());

            } else if(choice == 6){
                System.out.print("Enter Name: ");
                manager.updateStudent(input.nextLine());

            } else if(choice == 7){
                break;

            } else {
                System.out.println("Invalid input");
            }
        }

        input.close();
    }
}