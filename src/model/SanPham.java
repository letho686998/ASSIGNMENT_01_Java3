/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author LENOVO
 */
public class SanPham {

    private Integer id;
    private Integer categoryId;
    private String productName;
    private BigDecimal currentPrice;
    private Integer quantity;
    private String chatLieu;
    private String doDanHoi;

    public SanPham() {
    }

    public SanPham(Integer id, Integer categoryId, String productName, BigDecimal currentPrice, Integer quantity, String chatLieu, String doDanHoi) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.chatLieu = chatLieu;
        this.doDanHoi = doDanHoi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getDoDanHoi() {
        return doDanHoi;
    }

    public void setDoDanHoi(String doDanHoi) {
        this.doDanHoi = doDanHoi;
    }

}
