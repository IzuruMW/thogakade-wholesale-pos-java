package ik.ijse.thogakade.controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author izuru_mw
 */
public class CustomerController {
    public static ArrayList<String> getAllCustomerIds() 
            throws ClassNotFoundException,SQLException{
        // jdbc code
        ArrayList<String> ids = new ArrayList<>();
        Class.forName("com.mysql.jdbc.cj.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Nry@2611");
        PreparedStatement stm = connection.prepareStatement("SELECT id FROM Customer");
        ResultSet set = stm.executeQuery();
        while(set.next()){
            ids.add(set.getString(1));
        }
        return ids;
    }

}
