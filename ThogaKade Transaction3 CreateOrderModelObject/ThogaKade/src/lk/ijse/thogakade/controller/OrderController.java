/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.thogakade.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import lk.ijse.thogakade.db.DBConnection;


/**
 *
 * @author niroth
 */
public class OrderController {
    
    public static String getLastOrderId() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT id FROM Orders ORDER BY id DESC LIMIT 1");
        return rst.next() ? rst.getString("id") : null;
    }
    

}
