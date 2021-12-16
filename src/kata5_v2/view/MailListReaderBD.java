package kata5_v2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */

public class MailListReaderBD {

        private Connection connect() {
        String url = "jdbc:sqlite:.\\src\\DATABASE\\Prueba.db";
        Connection conn = null;
        try 
        {
            conn = DriverManager.getConnection(url);
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public ArrayList<String> read(String nameFile) 
    {
        String sql = "SELECT * FROM EMAIL";
        ArrayList<String> email = new ArrayList<>();
        try (Connection conn = this.connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) 
        {
            
            while (rs.next()) 
            {
                email.add(rs.getString("direccion"));
            }
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return email;
    }
}
