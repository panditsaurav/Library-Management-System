/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author pandi
 */
public class conn {
     Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/proj?characterEncoding=latin1","root","1manrockband");
            s =c.createStatement();
        }catch(Exception e){
            System.out.println("database error" + e);
        }  
    }
   // public static void main(String[] args) {
//	conn c=new conn();
  //  }
}
