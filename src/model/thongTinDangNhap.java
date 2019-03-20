/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Nguyen Son
 */
public class thongTinDangNhap {
    private String ten,gioitinh,user,pass;
    private Date ngaysinh;

    public thongTinDangNhap() {
    }

    public thongTinDangNhap(String ten,String gioitinh, String user, String pass,Date ngaysinh) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.user = user;
        this.pass = pass;
        this.ngaysinh = ngaysinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
   
}
