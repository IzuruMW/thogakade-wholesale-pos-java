/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.thogakade.controller;

import ik.ijse.thogakade.model.Customer;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author izuru_mw
 */
public class CustomerController {
    public static ArrayList <String> getAllCustomerId() throws ClassNotFoundException, SQLException{
        ArrayList<String> ids=new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade","root","Nry@2611");
        PreparedStatement stm= connection.prepareStatement("SELECT customerID FROM customer");
         ResultSet set= stm.executeQuery();
         while(set.next()){
         ids.add(set.getString(1));
         }
         return ids;
    }
   

    public static Customer findcustomer(String toString) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogakade","root","Nry@2611");
        PreparedStatement stm= connection.prepareStatement("SELECT name FROM customer WHERE customerID=?");
        
        ResultSet set= stm.executeQuery();
        if(set.next()){
        String add1=set.getString("name");
        
         }
        return null;
    }}
         

