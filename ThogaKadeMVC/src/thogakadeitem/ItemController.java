/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thogakadeitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author tashe
 */
public class ItemController {
    public static boolean insertitems(Item item) throws SQLException, ClassNotFoundException{
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("INSERT INTO item VALUES(?,?,?,?)");
        stm.setObject(1, item.getItemID());
        stm.setObject(2, item.getItemName());
        stm.setObject(3, item.getUnitprice());
        stm.setObject(4, item.getStock());
        int res = stm.executeUpdate();
        return res>0;
    }
    public static Item searchItem(String itemID) throws ClassNotFoundException, SQLException{
        //String id=srid.getText();
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        String SQL = "SELECT * FROM item WHERE itemID='"+itemID+"'";
        ResultSet rst = stm.executeQuery(SQL);
        if(rst.next()){
            Item item = new Item(rst.getString("itemID"), rst.getString("itemName"), rst.getString("unitprice"),rst.getString("stock"));
            return item;
        }else{
            return null;
        }
        
    }
    public static boolean deleteItem(String itemID) throws ClassNotFoundException, SQLException{
        return DBConnection.getInstance().getConnection().createStatement().executeUpdate("DELETE FROM item WHERE itemID = '"+itemID+"'")>0;
    }

    public static boolean updateItem(Item item) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE item SET itemName=?, unitPrice=?, stock=? WHERE itemID=?");
        stm.setObject(4, item.getItemID());
        stm.setObject(1, item.getItemName());
        stm.setObject(2, item.getUnitprice());
        stm.setObject(3, item.getStock());
        return stm.executeUpdate()>0;
    }
    public static ArrayList<Item>getAllItems() throws ClassNotFoundException, SQLException{
        ResultSet rst = DBConnection.getInstance().getConnection().createStatement().executeQuery("SELECT * FROM item");
        ArrayList<Item> itemList = new ArrayList<>();
        while(rst.next()){
            Item item = new Item(rst.getString("itemID"),rst.getString("itemName"),rst.getString("unitprice"),rst.getString("stock"));
            itemList.add(item);      
        }
        return itemList;
    }   
}
