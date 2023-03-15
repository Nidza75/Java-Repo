
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class myConnection {
    
    public static Connection getConnection(){
    
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/javacontactsapp","root","");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
}
}
