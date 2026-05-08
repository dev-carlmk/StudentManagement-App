import java.sql.*;

public class StudentManager {

    // ADD STUDENT
    public void addStudent(Student student){
        String sql = "INSERT INTO students(name, age, course) VALUES(?,?,?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            if(conn == null){
                System.out.println("Database connection failed!");
                return;
            }

            pst.setString(1, student.name);
            pst.setInt(2, student.age);
            pst.setString(3, student.course);

            pst.executeUpdate();
            System.out.println("Student saved to database!");

        } catch(Exception e){
            System.out.println("Add Error: " + e.getMessage());
        }
    }

    // VIEW STUDENTS
    public void viewStudents(){
        String sql = "SELECT * FROM students";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            boolean empty = true;

            while(rs.next()){
                empty = false;
                System.out.println(
                        "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Course: " + rs.getString("course")
                );
            }

            if(empty){
                System.out.println("No students found.");
            }

        } catch(Exception e){
            System.out.println("View Error: " + e.getMessage());
        }
    }

    // COUNT STUDENTS
    public void countStudents(){
        String sql = "SELECT COUNT(*) FROM students";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if(rs.next()){
                System.out.println("Total Students: " + rs.getInt(1));
            }

        } catch(Exception e){
            System.out.println("Count Error: " + e.getMessage());
        }
    }

    // DELETE STUDENT
    public void deleteStudents(String name){
        String sql = "DELETE FROM students WHERE name = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, name);

            int rows = pst.executeUpdate();

            if(rows > 0){
                System.out.println("Student deleted!");
            } else {
                System.out.println("Student not found!");
            }

        } catch(Exception e){
            System.out.println("Delete Error: " + e.getMessage());
        }
    }

    // SEARCH STUDENT
    public void searchStudents(String name){
        String sql = "SELECT * FROM students WHERE name = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, name);

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                System.out.println(
                        "ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Course: " + rs.getString("course")
                );
            } else {
                System.out.println("Student not found!");
            }

        } catch(Exception e){
            System.out.println("Search Error: " + e.getMessage());
        }
    }

    // UPDATE STUDENT
    public void updateStudent(String name){
        String sql = "UPDATE students SET name=?, age=?, course=? WHERE name=?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, "Updated Name");
            pst.setInt(2, 99);
            pst.setString(3, "Updated Course");
            pst.setString(4, name);

            int rows = pst.executeUpdate();

            if(rows > 0){
                System.out.println("Student updated!");
            } else {
                System.out.println("Student not found!");
            }

        } catch(Exception e){
            System.out.println("Update Error: " + e.getMessage());
        }
    }
}