/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienKet;

import java.awt.JobAttributes;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.accessibility.AccessibleRole;
import model.hang;

/**
 *
 * @author Nguyen Son
 */
public class saveData {
       private String name="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/quanlyhang";
    private String user="root";
    private String pass="1234";
    private Connection conn;

    public saveData() {
        try {
            Class.forName(name);
            conn= DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }             
    }
    public void save(hang hh){            
       String str=" insert into hang(mahang,tenhang,donvitinh,dongia,sohang) values (?,?,?,?,?)";
        try {
            PreparedStatement ps= conn.prepareStatement(str);
            ps.setString(1,hh.getMahang());
            ps.setString(2, hh.getTenhang());
            ps.setString(3, hh.getDovitinh());
            ps.setInt(4, hh.getDongia()); 
            ps.setInt(5, hh.getSohang());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void delete(hang hh){
      String str="delete from hang where mahang=?";  
        try {
            PreparedStatement ps=conn.prepareStatement(str);
            ps.setString(1,hh.getMahang());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void update(hang hh){
        String str="update hang set mahang=?,tenhang=?,donvitinh=?,dongia=?,sohang=? where mahang=?";
        try {
            PreparedStatement ps=conn.prepareStatement(str);
            ps.setString(1, hh.getMahang());
            ps.setString(2,hh.getTenhang());
            ps.setString(3, hh.getDovitinh());
            ps.setInt(4, hh.getDongia());
            ps.setInt(5, hh.getSohang());
             ps.setString(6, hh.getMahang());
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList timKiem(String name){
         ArrayList<hang> list=new ArrayList<>();
         String str="select *from hang where tenhang=?";
         try {
            PreparedStatement ps=conn.prepareStatement(str);
            ps.setString(1, name);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
               hang h=new hang(rs.getString(1),rs.getString(2), rs.getString(3), rs.getInt(4),rs.getInt(5) );
               
              list.add(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return list;
    }
            
            
    public ArrayList loadf(){
        ArrayList<hang> list=new ArrayList<>();
        String str="Select*from hang";
        try {
             PreparedStatement ps=conn.prepareStatement(str);
             ResultSet rs=ps.executeQuery();
             while (rs.next()) {                
                hang h=new hang(rs.getString(1), rs.getString(2),rs.getString(3), rs.getInt(4),rs.getInt(5) );
                list.add(h);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
}
