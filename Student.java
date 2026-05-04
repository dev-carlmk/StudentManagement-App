public class Student {
    String name;
    int age;
    String course;

    // Constructor
    public Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Display student info
    public void display(){
        System.out.println("Name: " + name + 
                           ", Age: " + age + 
                           ", Course: " + course);
    }
}