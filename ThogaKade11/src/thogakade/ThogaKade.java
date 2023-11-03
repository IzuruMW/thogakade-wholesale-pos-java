package thogakade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade", "root", ""); //throws SQLException
            Statement stm = conn.createStatement();//throws SQLException
            stm.executeUpdate(SQL);//throws SQLException
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver S/W not found...");
            return;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
       /* PreparedStatement pst=null;
        Connection conn = null;
        
        pst.executeQuery("select * from thogakade");
        ResultSet rs = pst.getResultSet();

while(rs.next())
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("address"));
            System.out.println(rs.getString("salary"));  */         

        }
    }


