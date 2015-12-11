package dbHelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customers;

public class UpdateQuery {

    private Connection conn;

    public UpdateQuery() {

        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String pass = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, pass);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void doUpdate (Customers customer){
        try {
            String query = "UPDATE CUSTOMERS SET FIRSTNAME = ?,LASTNAME = ?,ADDRESS1 = ?, ADDRESS2 = ?, CITY = ?, STATE = ?, ZIP = ?, EMAIL = ?, AGE = ?, WHERE ID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setString(3, customer.getAddress1());
            ps.setString(4, customer.getAddress2());
            ps.setString(5, customer.getCity());
            ps.setString(6, customer.getState());
            ps.setString(7, customer.getZip());
            ps.setString(8, customer.getEmail());
            ps.setInt(9, customer.getAge());
            ps.setInt(10, customer.getID());
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}