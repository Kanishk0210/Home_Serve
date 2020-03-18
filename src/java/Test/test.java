/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class test {
    Connection con;
    private Connection CreateConnection() throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home_serve","root","");
    return con;
    }
    
    public ArrayList<booking_pojo> booking_fetch () throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
  ArrayList<booking_pojo> data=new ArrayList<booking_pojo>();
   //ResultSet rs1=stmt.executeQuery("select * from service_provider where email='"+email+"'");
   //rs1.next();
  // service_provider_pojo o=new service_provider_pojo();
   //int spid=Integer.parseInt(rs1.getString(2));
   
 
    ResultSet rs=stmt.executeQuery("SELECT * FROM booking WHERE serviceProviderId=1");
    while(rs.next())
    {
    booking_pojo obj=new booking_pojo();
    obj.setBid(Integer.parseInt(rs.getString(1)));
    obj.setCid(Integer.parseInt(rs.getString(2)));
    obj.setService_name(rs.getString(12));
    obj.setSpid(Integer.parseInt(rs.getString(3)));
    obj.setService_id(Integer.parseInt(rs.getString(4)));
    obj.setBooking_time(rs.getString(5));
    obj.setBooking_duration(rs.getString(6));
    //String days[]=rs.getString(7).split("+");
    //obj.setBooking_date(days[0]);
    obj.setPrice(Integer.parseInt(rs.getString(8)));
    obj.setRemark(rs.getString(9));
    obj.setStatus(rs.getString(10));
    obj.setLocation(rs.getString(11));
  
       
    data.add(obj);
    }
    
    return data;
    }
    
    
}
