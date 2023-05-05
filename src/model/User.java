/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class User {

    private String tenDangNhap;
    private String matKhau;
    private String vaiTro;//tham khảo roleconst

    public User() {
    }

    public User(String tenDangNhap, String matKhau, String QUAN_LY) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    @Override
    public String toString() {
        return "User{" + "tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau + ", vaiTro=" + vaiTro + '}';
    }

}
