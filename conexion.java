/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;


import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;



public class conexion {
    
    public Connection getConecction(){
        Connection con = null;
        String base = "cajerobd";
        String url = "jdbc:mysql://localhost:3306/" + base ;
        String user = "root";
        String password = "erik1234";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url,user,password);
            
        }catch (Exception e){
            System.err.println(e);
            
        }
        return con;
    }
    
}
