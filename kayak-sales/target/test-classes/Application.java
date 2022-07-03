import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {

  public static void main(String[] args) {
   // djbc:mysql//://hostname:port/databasename
    String connectionString = "jdbc:mysq://localhost:3306/kayak_sales";
    
    try {
    Connection conn = DriverManager.getConnection(connectionString, "root", "Lcdk9181!");
    System.out.println("connected successfully!"); 
  } catch (SQLException e) {
    System.out.println("Error");
    e.printStackTrace();
  }

}
