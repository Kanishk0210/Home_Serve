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
public class service_provider_dao {
    Connection con;
    private Connection CreateConnection() throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home_serve","root","");
    return con;
    }
    
    public int service_provider_reg(String... data) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    int i=0;
    service_provider_pojo obj=new service_provider_pojo();
    obj.setDo_reg(data[0]);
    obj.setName(data[1]);
    obj.setPassword(data[2]);
    obj.setAddress(data[3]);
    obj.setAdhar(data[4]);
    obj.setAdhar_id_proof(data[5]);
    obj.setGst(data[6]);
    obj.setShop_name(data[7]);
    obj.setEmail(data[8]);
    obj.setPhoto(data[9]);
    obj.setPhone(data[10]);
    i=stmt.executeUpdate("insert into service_provider(dateOfReg, name, pass,address,adhar_id,id_proof,gst_no,shop_name,email,photo,phone)  values('"+obj.getDo_reg()+"','"+obj.getName()+"','"+obj.getPassword()+"','"+obj.getAddress()+"','"+obj.getAdhar()+"','"+obj.getAdhar_id_proof()+"','"+obj.getGst()+"','"+obj.getShop_name()+"','"+obj.getEmail()+"','"+obj.getPhoto()+"','"+obj.getPhoto()+"');");
    return i;
    }
    
    public int check_login (String name,String pass) throws Exception{
     con=CreateConnection();
    Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select* from service_provider");
        int count=0;
        service_provider_pojo obj=new service_provider_pojo();
        obj.setName(name);
        obj.setPassword(pass);
        while(rs.next())
        {
            if(name.equals(rs.getString(10)) && pass.equals(rs.getString(4)))
            {
            count=1;
            break;
            }
        }
        return count;
    }
    
    public int insert_services(String... data) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    int i=0;
    services_pojo obj=new services_pojo();
    obj.setCategory(data[0]);
    obj.setService_name(data[1]);
    obj.setService_description(data[2]);
    obj.setService_charges(Integer.parseInt(data[3]));
    obj.setAvailable_date(data[4]);
    obj.setAvailable_Stime(data[5]);
    obj.setAvailable_Etime(data[6]);
    obj.setService_duration(data[7]);
    obj.setLocation(data[8]);
    obj.setService_pro_id(Integer.parseInt(data[9]));
    obj.setPhoto(data[10]);
    
    
    
    i=stmt.executeUpdate("insert into services values('"+obj.getService_pro_id()+"','"+obj.getService_id()+"','"+obj.getCategory()+"','"+obj.getService_name()+"','"+obj.getService_description()+"','"+obj.getService_charges()+"','"+obj.getAvailable_date()+"','"+obj.getAvailable_Stime()+"','"+obj.getAvailable_Etime()+"','"+obj.getService_duration()+"','"+obj.getLocation()+"','"+obj.getPhoto()+"');");
    return i;
    }
    
    public int insert_booking(String... data) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    int i=0;
    booking_pojo obj=new booking_pojo();
    obj.setCid(Integer.parseInt(data[0]));
    obj.setSpid(Integer.parseInt(data[1]));
    obj.setService_id(Integer.parseInt(data[2]));
    obj.setBooking_time(data[3]);
    obj.setBooking_duration(data[4]);
    obj.setBooking_date(data[5]);
    obj.setPrice(Integer.parseInt(data[6]));
    obj.setRemark(data[7]);
    obj.setStatus(data[8]);
    obj.setLocation(data[9]);
    obj.setService_name(data[10]);
    
    i=stmt.executeUpdate("insert into booking(cId, serviceProviderId, serviceId, bookingTime, bookingDuration, bookingDate, price, remark, status, location,service_name) values('"+obj.getCid()+"','"+obj.getSpid()+"','"+obj.getService_id()+"','"+obj.getBooking_time()+"','"+obj.getBooking_duration()+"','"+obj.getBooking_date()+"','"+obj.getPrice()+"','"+obj.getRemark()+"','"+obj.getStatus()+"','"+obj.getLocation()+"','"+obj.getService_name()+"');");
    return i;
    }
    
    public ArrayList<booking_pojo> booking_fetch (String email) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
  ArrayList<booking_pojo> data=new ArrayList<booking_pojo>();
   ResultSet rs1=stmt.executeQuery("select * from service_provider where email='"+email+"'");
   rs1.next();
   service_provider_pojo o=new service_provider_pojo();
   int spid=Integer.parseInt(rs1.getString(2));
   
 
    ResultSet rs=stmt.executeQuery("SELECT * FROM booking WHERE serviceProviderId='"+spid+"'");
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
    
    public ArrayList<booking_pojo> booking_fetch () throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
  ArrayList<booking_pojo> data=new ArrayList<booking_pojo>();
  
 
    ResultSet rs=stmt.executeQuery("SELECT * FROM booking ");
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
    
    public ArrayList<service_provider_pojo> service_pro_profile(String email) throws Exception
   {
       con=CreateConnection();
       Statement stmt=con.createStatement();
       
       service_provider_pojo obj=new service_provider_pojo();
       ArrayList<service_provider_pojo> data=new ArrayList<service_provider_pojo>();
       
      
       ResultSet rs=stmt.executeQuery("select * from service_provider where email='"+email+"'");
       rs.next();
       obj.setSpid(Integer.parseInt(rs.getString(2)));
       obj.setDo_reg(rs.getString(1));
       obj.setName(rs.getString(3));
       obj.setAddress(rs.getString(5));
       obj.setAdhar(rs.getString(6));
       obj.setAdhar_id_proof(rs.getString(7));
       obj.setGst(rs.getString(8));
       obj.setShop_name(rs.getString(9));
       obj.setEmail(rs.getString(10));
       obj.setPhone(rs.getString(12));
       obj.setPhoto(rs.getString(11));
       data.add(obj);
       
       return data;
       
}
    public ArrayList<category_pojo> category_fetch() throws Exception
    {
        
        ArrayList<category_pojo> data=new ArrayList<category_pojo>();
    con=CreateConnection();
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select * from category;");
    
    while(rs.next())
    {
        category_pojo obj=new category_pojo();
    obj.setCid(Integer.parseInt(rs.getString(1)));
    obj.setCategory(rs.getString(2));
    obj.setCat_desc(rs.getString(3));
    data.add(obj);
    }
    
    return data;
    }
    
    public ArrayList<services_pojo> srvice_fetch(String category) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    ArrayList<services_pojo> data=new ArrayList<services_pojo>();
    ResultSet rs=stmt.executeQuery("select * from services where category='"+category+"'");
    
    while(rs.next())
    {
    services_pojo obj=new services_pojo();
    obj.setService_id(Integer.parseInt(rs.getString(2)));
    obj.setService_name(rs.getString(4));
    obj.setService_pro_id(Integer.parseInt(rs.getString(1)));
    obj.setCategory(rs.getString(3));
    obj.setService_description(rs.getString(5));
    obj.setService_charges(Integer.parseInt(rs.getString(6)));
    obj.setAvailable_date(rs.getString(7));
    obj.setAvailable_Stime(rs.getString(8));
    obj.setAvailable_Etime(rs.getString(9));
    obj.setService_duration(rs.getString(10));
    obj.setLocation(rs.getString(11));
    obj.setPhoto(rs.getString(12));
    
    data.add(obj);
    
    }
    return data;
    }
    
    public ArrayList<services_pojo> srvice_fetch() throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    ArrayList<services_pojo> data=new ArrayList<services_pojo>();
    ResultSet rs=stmt.executeQuery("select * from services");
    
    while(rs.next())
    {
    services_pojo obj=new services_pojo();
    obj.setService_id(Integer.parseInt(rs.getString(2)));
    obj.setService_name(rs.getString(4));
    obj.setService_pro_id(Integer.parseInt(rs.getString(1)));
    obj.setCategory(rs.getString(3));
    obj.setService_description(rs.getString(5));
    obj.setService_charges(Integer.parseInt(rs.getString(6)));
    obj.setAvailable_date(rs.getString(7));
    obj.setAvailable_Stime(rs.getString(8));
    obj.setAvailable_Etime(rs.getString(9));
    obj.setService_duration(rs.getString(10));
    obj.setLocation(rs.getString(11));
    obj.setPhoto(rs.getString(12));
    
    data.add(obj);
    
    }
    return data;
    }
    
    public int status(int bid,String status) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    int i=0;
    booking_pojo obj =new booking_pojo();
    obj.setStatus(status);
    obj.setBid(bid);
    i=stmt.executeUpdate("update booking set status='"+obj.getStatus()+"' where bId='"+obj.getBid()+"'");
    
    return i;
    }
}
