package thogakade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class A{
    private static A ob;
    private Connection connection;
    private A() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/thogaKade", "root", "mysql");
    }
    public Connection getConnection(){
        return connection;
    }
    public static A getInstance() throws ClassNotFoundException, SQLException{
        if(ob==null){
            ob=new A();
        }
        return ob;
    }
}

public class ThogaKade {

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        A a1=A.getInstance();
        Connection connection = a1.getConnection();
        System.out.println(connection);
    }

}
