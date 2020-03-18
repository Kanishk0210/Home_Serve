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
public class admin_dao {
    Connection con;
    private Connection CreateConnection() throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/home_serve","root","");
    return con;
    }
    
    public int check_login (String name,String pass) throws Exception{
     con=CreateConnection();
    Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select* from admin");
        int count=0;
        admin_pojo obj=new admin_pojo();
        obj.setName(name);
        obj.setPassword(pass);
        while(rs.next())
        {
            if(name.equals(rs.getString(3)) && pass.equals(rs.getString(4)))
            {
            count=1;
            break;
            }
        }
        return count;
    }
    
    public int add_categories(String... data) throws Exception
    {
        con=CreateConnection();
    category_pojo obj=new category_pojo();
    
    
    obj.setCategory(data[0]);
    obj.setCat_desc(data[1]);
    
    Statement stmt=con.createStatement();
    int i=0;
    i=stmt.executeUpdate("insert into category(category, categoryDesc) values('"+obj.getCategory()+"','"+obj.getCat_desc()+"')");
    return i;
    }
    
    public ArrayList<admin_pojo> admin_fetch (String email) throws Exception
    {
    con=CreateConnection();
    Statement stmt=con.createStatement();
    ArrayList<admin_pojo> data=new ArrayList<admin_pojo>();
    
    ResultSet rs=stmt.executeQuery("select * from admin where adminEmail='"+email+"'");
    while(rs.next())
    {
    admin_pojo obj=new admin_pojo();
    obj.setId(Integer.parseInt(rs.getString(1)));
    obj.setName(rs.getString(2));
    obj.setEmail(rs.getString(3));
    data.add(obj);
    }
    
    return data;
    }

}
