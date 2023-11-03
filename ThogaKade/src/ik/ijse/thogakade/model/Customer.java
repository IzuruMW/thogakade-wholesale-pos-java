/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ik.ijse.thogakade.model;

/**
 *
 * @author izuru_mw
 */
public class Customer {
    private String id;
    private String name;
    private String address;
    private String salary;

    public Customer() {
        
    }

    public Customer(String id, String name, String address, String salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Customer(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the salaty
     */
    public String getSalaty() {
        return salary;
    }

    /**
     * @param salaty the salaty to set
     */
    public void setSalaty(String salary) {
        this.salary = salary;
    }
    
}
