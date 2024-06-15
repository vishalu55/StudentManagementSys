/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author visha
 */
public class DBConnection {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/student";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connection(){
    Connection conn = null;
    try{
    Class.forName(JDBC_DRIVER);
    conn = DriverManager.getConnection(DB_URL,USER,PASS);
    return conn;
    }
    catch(Exception ex){
        System.out.println("Error while connecting to database.");
        return null;
    }
    }
    
}
