package thogakade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author niroth
 */
public class ThogaKade {

    public static void main(String[] args) throws SQLException {
        String SQL = "Insert into Customer values('C3333','Gunasiri','Kandy',50000)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //throws ClassNotFoundException
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ThogaKade", "root", "mysql"); //throws SQLException
            Statement stm = conn.createStatement();//throws SQLException
            stm.executeUpdate(SQL);//throws SQLException
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver S/W not found...");
            return;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
