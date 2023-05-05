/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

public class DieuChinhGia {

    private Integer categoryId;
    private String productName;
    private BigDecimal currentPrice;
   

    public DieuChinhGia() {
    }

    public DieuChinhGia(Integer categoryId, String productName, BigDecimal currentPrice) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.currentPrice = currentPrice;
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



    @Override
    public String toString() {
        return productName;
    }

}
