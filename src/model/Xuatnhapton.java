/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Xuatnhapton {

    private Integer productId;
    private Date IEdate;
    private Integer IoE;
    private Integer quantity;
     private BigDecimal gia;

    public Xuatnhapton() {
    }

    public Xuatnhapton(Integer productId, Date IEdate, Integer IoE, Integer quantity, BigDecimal gia) {
        this.productId = productId;
        this.IEdate = IEdate;
        this.IoE = IoE;
        this.quantity = quantity;
        this.gia = gia;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getIEdate() {
        return IEdate;
    }

    public void setIEdate(Date IEdate) {
        this.IEdate = IEdate;
    }

    public Integer getIoE() {
        return IoE;
    }

    public void setIoE(Integer IoE) {
        this.IoE = IoE;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

   

}
