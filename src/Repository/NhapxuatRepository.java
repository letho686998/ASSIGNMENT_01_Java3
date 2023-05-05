/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import helper.DbConnector;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Danhmuc;
import model.Xuatnhap;
import model.Xuatnhapton;

public class NhapxuatRepository {

    //UPDATE SẢN PHẨM THEO SỐ LƯỢNG XUẤT TRONG BẢNG XUẤT NHẬP TỒN
    public Integer xuatSanPham(Xuatnhap sp, Integer id) {
        try {

            Connection connection = DbConnector.getConnection();
            String query = "update Product\n"
                    + "set Quantity=Quantity-?\n"
                    + "where Id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, sp.getQuantity());
            statement.setInt(2, id);
            //3. Thực thi câu lệnh
            System.out.println(query);
            int rs = statement.executeUpdate();
            // JOptionPane.showMessageDialog(null, "Update thành công");
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Update thất bại.");
        }
        return 1;
    }
//LẤY RA DANH MỤC
    public ArrayList<Danhmuc> lsdanhmuc = new ArrayList<>();

    public ArrayList<Danhmuc> danhsach() {
        try {
            Connection connection = DbConnector.getConnection();
            String sql = "select CategoryId,CategoryName from Category";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Integer categoryId = rs.getInt("CategoryId");
                String categoryName = rs.getString("CategoryName");
                Danhmuc dm = new Danhmuc();
                dm.setCategoryId(categoryId);
                dm.setCategoryName(categoryName);
                lsdanhmuc.add(dm);

            }
            statement.close();
            connection.close();
        } catch (Exception e) {
        }
        return lsdanhmuc;
    }

    // CẬP NHẬT BẢNG XUẤT NHẬP TỒN
    public Integer addNhapXuatSanPham(Xuatnhapton x) {
        Integer kq = -1;
        try {
            Connection connection = DbConnector.getConnection();
            String sql = "insert into InventoryLog(id,IEDate,IoE,Quantity) values(?,GETDATE(),1,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, x.getProductId());
            statement.setInt(2, x.getQuantity());

            kq = statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kq;

    }

    public Integer xuatNhapXuatSanPham(Xuatnhapton x) {
        Integer kq = -1;
        try {
            Connection connection = DbConnector.getConnection();
            String sql = "insert into InventoryLog(id,IEDate,IoE,Quantity) values(?,GETDATE(),0,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, x.getProductId());
            statement.setInt(2, x.getQuantity());

            kq = statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }

    //UPDATE LẠI BẢNG SẢN PHẨM THEO SỐ LƯỢNG XUẤT NHẬP TỒN
    public Integer nhapSanPham(Xuatnhap sp, Integer id) {
        try {

            Connection connection = DbConnector.getConnection();
            String query = "update Product\n"
                    + "set Quantity=Quantity+?\n"
                    + "where Id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, sp.getQuantity());
            statement.setInt(2, id);
            //3. Thực thi câu lệnh
            System.out.println(query);
            int rs = statement.executeUpdate();
            // JOptionPane.showMessageDialog(null, "Update thành công");
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Update thất bại.");
        }
        return 1;
    }

    public void checksl() {
        try {
            Connection connection = DbConnector.getConnection();
            String sql = "select Quantity from Product where ProductName=?";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);

        } catch (Exception e) {
        }
    }

}
