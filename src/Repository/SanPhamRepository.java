/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Dbexecute.Xhelp;
import helper.DbConnector;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import model.SanPham;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Xuatnhap;

/**
 *
 * @author LENOVO
 */
public class SanPhamRepository {

    public static ArrayList<SanPham> lsSanPham = new ArrayList<>();

    public ArrayList<SanPham> lsSanPham() {
        try {
            Connection connection = DbConnector.getConnection();
            String query = "select Id,CategoryId,ProductName,CurrentPrice,Quantity,chatLieu,DoDanHoi from Product";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            lsSanPham = new ArrayList<>();
            while (rs.next()) {
                Integer id = rs.getInt("id");
                Integer categoryid = rs.getInt("CategoryId");
                String productName = rs.getString("ProductName");
                BigDecimal currentPrice = rs.getBigDecimal("CurrentPrice");
                Integer quatity = rs.getInt("Quantity");
                String chatlieu = rs.getString("chatLieu");
                String doDanHoi = rs.getString("DoDanHoi");
                SanPham sp = new SanPham();
                sp.setId(id);
                sp.setCategoryId(categoryid);
                sp.setProductName(productName);
                sp.setCurrentPrice(currentPrice);
                sp.setQuantity(quatity);
                sp.setChatLieu(chatlieu);
                sp.setDoDanHoi(doDanHoi);
                lsSanPham.add(sp);

            }
        } catch (Exception e) {
        }
        return lsSanPham;
    }

    //THÊM
    public Integer addSanPham(SanPham sanPham) throws Exception {
        Integer ketQua = -1;
//        try {
        Connection connection = DbConnector.getConnection();
        String query = "INSERT INTO Product (CategoryId, ProductName,"
                + " CurrentPrice, Quantity,chatLieu,DoDanHoi)\n"
                + "VALUES (?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, sanPham.getCategoryId());
        statement.setString(2, sanPham.getProductName());
        statement.setBigDecimal(3, sanPham.getCurrentPrice());
        statement.setInt(4, sanPham.getQuantity());
        statement.setString(5, sanPham.getChatLieu());
        statement.setString(6, sanPham.getDoDanHoi());

        ketQua = statement.executeUpdate();
        statement.close();
        connection.close();
//        } catch (Exception e) {
//            System.out.println("Lỗi");
//        }
//        String query = "INSERT INTO Product \n"
//                + "VALUES (?,?,?,?,?,?)";
//        Integer row = Xhelp.excuteUpdate(query, sanPham.getCategoryId(),
//                sanPham.getProductName(), sanPham.getCurrentPrice(),
//                sanPham.getQuantity(), sanPham.getChatLieu(), sanPham.getXuatXu());

        return ketQua;
    }

    //update
    public Integer updateSanPham(SanPham sanPham) {

        Integer kequa = -1;
        try {
            Connection connection = DbConnector.getConnection();

            String query = "update Product\n"
                    + "set CategoryId=?"
                    + ",chatLieu=?,DoDanHoi=?\n"
                    + "where ProductName=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, sanPham.getCategoryId());
//            statement.setBigDecimal(2, sanPham.getCurrentPrice());
//            statement.setInt(3, sanPham.getQuantity());
            statement.setString(2, sanPham.getChatLieu());
            statement.setString(3, sanPham.getDoDanHoi());
            statement.setString(4, sanPham.getProductName());
            kequa = statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Lỗi");
        }

//        Integer row = Xhelp.excuteUpdate(query,
//                sanPham.getCategoryId(), sanPham.getCurrentPrice(),
//                sanPham.getQuantity(), sanPham.getChatLieu(),
//                sanPham.getXuatXu(), sanPham.getProductName());
        return kequa;
    }
    //delete

    public Integer deleteSanPham(Integer id) {
        Integer kq = -1;
        try {
            Connection connection = DbConnector.getConnection();
            String query = "delete from Product where Id =?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            kq = statement.executeUpdate();
            statement.close();
            connection.close();

        } catch (Exception e) {

        }

//        Integer row = Xhelp.excuteUpdate(query,
//                id);
        return kq;
    }

    public ArrayList<SanPham> timSanPham(int sanPham) {

        try {
            Connection connection = DbConnector.getConnection();
            String query = "select Id,CategoryId,ProductName,CurrentPrice,Quantity,"
                    + "chatLieu,DoDanHoi from Product where CategoryId =" + sanPham;

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            lsSanPham = new ArrayList<>();
            while (rs.next()) {
//                SanPham sp = new SanPham();
//                sp.setCategoryId(rs.getInt("CategoryId"));
//                sp.setProductName(rs.getString("ProductName"));
//                sp.setCurrentPrice(rs.getBigDecimal("CurrentPrice"));
//                sp.setQuantity(rs.getInt("Quantity"));
//                sp.setChatLieu(rs.getString("chatLieu"));
//                sp.setXuatXu(rs.getString("xuatXu"));
                Integer Id = rs.getInt(1);
                Integer categoryId = rs.getInt(2);
                String productName = rs.getString(3);
                BigDecimal currentprice = rs.getBigDecimal(4);
                Integer quantity = rs.getInt(5);
                String chatlieu = rs.getString(6);
                String doDanHoi = rs.getString(7);
                lsSanPham.add(new SanPham(Id, categoryId, productName, currentprice,
                        quantity, chatlieu, doDanHoi));
            }
        } catch (Exception e) {
        }
        return lsSanPham;

    }

    

}
