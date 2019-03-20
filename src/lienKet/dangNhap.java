/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienKet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.hang;
import model.thongTinDangNhap;
import view.GDHang;

/**
 *
 * @author Nguyen Son
 */
public class dangNhap {
        private String name="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/quanlyhang";
    private String user="root";
    private String pass="1234";
    private Connection conn;

    public dangNhap() {
        try {
            Class.forName(name);
            conn=(Connection) DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    public void dangKi(thongTinDangNhap tt){
        String str="insert into quanly(ten,ngaysinh,gioitinh,username,pass)values (?,?,?,?,?) ";
        try {
            PreparedStatement ps=conn.prepareStatement(str);
            ps.setString(1,tt.getTen() );          
            ps.setDate(2,new Date(tt.getNgaysinh().getTime()));        
            ps.setString(3,tt.getGioitinh() );
            ps.setString(4,tt.getUser() );
            ps.setString(5,tt.getPass() );
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean dangNhap(thongTinDangNhap tt){
        String str="select * from quanly where username=? and pass=?";
        try {
            PreparedStatement ps=conn.prepareStatement(str);
            ps.setString(1, tt.getUser());
            ps.setString(2, tt.getPass());
            
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {  
                thongTinDangNhap dn=new thongTinDangNhap();
                dn.setTen(rs.getString(1));
                dn.setNgaysinh(rs.getDate(2));
                dn.setGioitinh(rs.getString(3));
                     
               return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  false;
    }
   
}
