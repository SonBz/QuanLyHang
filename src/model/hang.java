/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nguyen Son
 */
public class hang {
    private String mahang,tenhang,dovitinh;
    private int dongia,sohang;

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        this.mahang = mahang;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getDovitinh() {
        return dovitinh;
    }

    public void setDovitinh(String dovitinh) {
        this.dovitinh = dovitinh;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSohang() {
        return sohang;
    }

    public void setSohang(int sohang) {
        this.sohang = sohang;
    }

    public hang() {
    }

    public hang(String mahang, String tenhang, String dovitinh, int dongia, int sohang) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dovitinh = dovitinh;
        this.dongia = dongia;
        this.sohang = sohang;
    }
  public hang(String mahang, String dovitinh, int dongia, int sohang) {
        this.mahang = mahang;
        
        this.dovitinh = dovitinh;
        this.dongia = dongia;
        this.sohang = sohang;
    }

   
    
    
}
