/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package childrenvaccination;
import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author ZAHIR
 */
public class Db {
    private String username="root";
    private String password ="";
    private String conn_string ="jdbc:mysql://localhost:3306/vaccination?JDBCCompliantTimezoneShift=true&serverTimezone=UTC";
    ResultSet rs = null;
    
    public Connection getconnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(conn_string,username,password);
            System.out.println("Connected to the database");
            
        }catch(Exception e){
            System.out.println("Could not establish a database connection: "+e);
            
        }
        return conn;
        
    }
    public static Connection getCon() {
        Connection con = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?JDBCCompliantTimezoneShift=true&serverTimezone=UTC", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    
}
