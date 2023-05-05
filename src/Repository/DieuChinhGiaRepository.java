/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import helper.DbConnector;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Danhmuc;
import model.DieuChinhGia;

public class DieuChinhGiaRepository {

    private ArrayList<Danhmuc> lsDanhsach = new ArrayList<>();
    private ArrayList<DieuChinhGia> lsDanhsach2 = new ArrayList<>();

    public ArrayList<Danhmuc> getAll() {
        try {
            Connection connection = DbConnector.getConnection();
            String sql = "select CategoryId,CategoryName from Category";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                Integer categoryId = rs.getInt("CategoryId");
                String categoryname = rs.getString("CategoryName");
                Danhmuc dm = new Danhmuc();
                dm.setCategoryId(categoryId);
                dm.setCategoryName(categoryname);
                lsDanhsach.add(dm);
            }
        } catch (Exception e) {
        }
        return lsDanhsach;
    }

    public Integer updateSanPham(DieuChinhGia gia, String tenSp) {
        try {

            Connection connection = DbConnector.getConnection();
            String query = "update Product set currentPrice =" + gia.getCurrentPrice() + "  where productName like N'%" + tenSp + "'";
            Statement statement = connection.createStatement();// câu lệnh
            //3. Thực thi câu lệnh
            int result = statement.executeUpdate(query);
           // JOptionPane.showMessageDialog(null, "Update  giá thành công");
            statement.close();
            connection.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Update giá thất bại.");
            e.printStackTrace();
        }
        return 1;
    }

//    public ArrayList<DieuChinhGia> danhsachsp(String sp) {
//
//        try {
//            Connection connection = DbConnector.getConnection();
//            // Truy vấn danh sách sản phẩm
//            String query = "SELECT CategoryId, ProductName, CurrentPrice FROM Product WHERE ProductName = ?";
//            PreparedStatement stmt = connection.prepareStatement(query);
//            stmt.setString(1, sp);
//            ResultSet rs = stmt.executeQuery();
//            while (rs.next()) {
//                Integer categoryId = rs.getInt("CategoryId");
//                String productname = rs.getString("ProductName");
//                BigDecimal currentprice = rs.getBigDecimal("CurrentPrice");
//                DieuChinhGia dc = new DieuChinhGia();
//                dc.setProductName(productname);
//                dc.setCurrentPrice(currentprice);
//                lsDanhsach2.add(dc);
//            }
//            stmt.close();
//            rs.close();
//
//        } catch (Exception e) {
//        }
//        return lsDanhsach2;
//
//    }
}
