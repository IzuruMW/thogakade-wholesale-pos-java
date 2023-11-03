package thogakade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author niroth
 */
public class ThogaKade {

    public static void main(String[] args) throws SQLException {
        String SQL = "Select * From Customer";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //throws ClassNotFoundException
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ThogaKade", "root", "mysql"); //throws SQLException
            Statement stm = conn.createStatement();//throws SQLException
            ResultSet rst = stm.executeQuery(SQL);
            while(rst.next()){
                String id=rst.getString("id");
                String name=rst.getString("name");
                String address=rst.getString("address");
                double salary=rst.getDouble("salary");
                System.out.println(id+"\t"+name+"\t"+address+"\t"+salary);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver S/W not found...");
            return;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
