/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Xuatnhap {
    private Integer Id;
    private String productName;
    private Integer quantity;

    public Xuatnhap() {
    }

    public Xuatnhap(Integer Id,String productName, Integer quantity) {
        this.Id = Id;
        this.productName = productName;
        this.quantity = quantity;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Xuatnhap{" + "Id=" + Id + ", productName=" + productName + ", quantity=" + quantity + '}';
    }

  


   
    
}
