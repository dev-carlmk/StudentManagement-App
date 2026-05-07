import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection{
    public static Connection getConnection(){
        try{
            String url = "jdbc:mysql://localhost:3306/student_db";
            String user = "root";
            String password = "";

            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}