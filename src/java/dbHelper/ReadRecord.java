/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelper;

/**
 *
 * @author Ryan
 */

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;

public class ReadRecord {
     
    private Connection conn;
    private ResultSet results;
    private Customers customer = new Customers();
    private int ID;
    
    public ReadRecord (int ID){
    Properties props = new Properties();
    InputStream instr =getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
       
    this.ID = ID;
    
    
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    public void doRead() {
    
        try {
            String query = "SELECT * FROM Customers WHERE ID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, ID);
            
            this.results = ps.executeQuery();
            
            this.results.next();
            
            customer.setID(this.results.getInt("ID"));
            customer.setFirstName(this.results.getString("FIRSTNAME"));
            customer.setLastName(this.results.getString("LASTNAME"));
            customer.setAddress1(this.results.getString("ADRESS1"));
            customer.setAddress2(this.results.getString("ADRESS2"));
            customer.setCity(this.results.getString("CITY"));
            customer.setState(this.results.getString("STATE"));
            customer.setZip(this.results.getString("ZIP"));
            customer.setEmail(this.results.getString("EMAIL"));
            customer.setAge(this.results.getInt("AGE"));
            
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
            
        
        

}
    
    public Customers getCustomer(){
    
            return this.customer;
    
    }
}