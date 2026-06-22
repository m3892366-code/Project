import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connect() {
        try {
            
            Connection con =
                DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hms",
                    "root",
                    "Kiru@123"
                );
                
                
                
            System.out.println("Datase Connected");
           
    
            return con;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}