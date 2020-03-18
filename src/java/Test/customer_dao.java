/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.*;
import java.sql.*;


/**
 *
 * @author HP
 */
public class customer_dao {
     Connection con;
    private Connection CreateConnection() throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home_serve","root","");
    return con;
    }
    
    public int customer_reg(String name,String pass,String email,int number,String address) throws Exception
    {
    
        con=CreateConnection();
        Statement stmt=con.createStatement();
        int i=0;
        
        customer_pojo obj=new customer_pojo();
        obj.setName(name);
        obj.setPassword(pass);
        obj.setEmail(email);
        obj.setNumber(number);
        obj.setAddress(address);
        
        i=stmt.executeUpdate("insert into customer(cName, cPass, cEmail, cContact, cAddress) values('"+obj.getName()+"','"+obj.getPassword()+"','"+obj.getEmail()+"','"+obj.getNumber()+"','"+obj.getAddress()+"');");
        return i;
        
    }
    public int check_login (String email,String pass) throws Exception{
     con=CreateConnection();
    Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select* from customer");
        int count=0;
        customer_pojo obj=new customer_pojo();
        obj.setEmail(email);
        obj.setPassword(pass);
        while(rs.next())
        {
            if(obj.getEmail().equals(rs.getString(4)) && obj.getPassword().equals(rs.getString(3)))
            {
            count++;
            break;
            }
        }
        return count;
    }
    public ArrayList<customer_pojo> customer_fetch(String email) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    ArrayList<customer_pojo> data=new ArrayList<customer_pojo>();
    ResultSet rs=stmt.executeQuery("select * from customer where cEmail='"+email+"'");
    customer_pojo obj=new customer_pojo();
    
    while(rs.next())
    {
    obj.setId(Integer.parseInt(rs.getString(1)));
    obj.setName(rs.getString(2));
    obj.setEmail(rs.getString(4));
    obj.setNumber(Integer.parseInt(rs.getString(5)));
    obj.setAddress(rs.getString(6));
    obj.setLocation(rs.getString(7));
    data.add(obj);
    }
    return data;
    }
    public ArrayList<customer_pojo> customer_fetchc(int cid) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    ArrayList<customer_pojo> data=new ArrayList<customer_pojo>();
    ResultSet rs=stmt.executeQuery("select * from customer where cId='"+cid+"'");
    customer_pojo obj=new customer_pojo();
    
    while(rs.next())
    {
    obj.setId(Integer.parseInt(rs.getString(1)));
    obj.setName(rs.getString(2));
    obj.setEmail(rs.getString(4));
    obj.setNumber(Integer.parseInt(rs.getString(5)));
    obj.setAddress(rs.getString(6));
    obj.setLocation(rs.getString(7));
    data.add(obj);
    }
    return data;
    }
    
    public ArrayList<booking_pojo> booking_fetch (String email) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
   ArrayList<booking_pojo> data=new ArrayList<booking_pojo>();
   ResultSet rs1=stmt.executeQuery("select * from customer where cEmail='"+email+"'");
   rs1.next();
   customer_pojo o=new customer_pojo();
   int cid=Integer.parseInt(rs1.getString(1));
   
 
    ResultSet rs=stmt.executeQuery("SELECT * FROM booking WHERE cId='"+cid+"'");
    while(rs.next())
    {
    booking_pojo obj=new booking_pojo();
    obj.setBid(Integer.parseInt(rs.getString(1)));
    obj.setCid(Integer.parseInt(rs.getString(2)));
    obj.setService_name(rs.getString(5));
    obj.setSpid(Integer.parseInt(rs.getString(3)));
    obj.setService_id(Integer.parseInt(rs.getString(4)));
    obj.setBooking_time(rs.getString(6));
    obj.setBooking_duration(rs.getString(7));
    obj.setBooking_date(rs.getString(8));
    obj.setPrice(Integer.parseInt(rs.getString(9)));
    obj.setRemark(rs.getString(10));
    obj.setStatus(rs.getString(11));
    obj.setLocation(rs.getString(12));
  
       
    data.add(obj);
    }
    
    return data;
    }
}
