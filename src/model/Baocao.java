/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Baocao {
    private int idsp,soluong;
    private String tensp;

    public Baocao() {
    }

    public Baocao(int idsp, int soluong, String tensp) {
        this.idsp = idsp;
        this.soluong = soluong;
        this.tensp = tensp;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    @Override
    public String toString() {
        return "Baocao{" + "idsp=" + idsp + ", soluong=" + soluong + ", tensp=" + tensp + '}';
    }
    
}
