/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import helper.DbConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Baocao;

/**
 *
 * @author LENOVO
 */
public class Baocaorepo {

    //BÁO CÁO TOP 10 SẢN PHẨM BÁN CHẠY NHẤT NĂM
    public ArrayList<Baocao> top10SpBanchay() {
        ArrayList<Baocao> dstop10 = new ArrayList<Baocao>();
        try {

            Connection connection = DbConnector.getConnection();
            String sql = "SELECT TOP 10 p.Id, p.ProductName, SUM(il.Quantity) AS TongsoLuong\n"
                    + "                   FROM Product p\n"
                    + "                    INNER JOIN InventoryLog il ON p.Id = il.id\n"
                    + "                    WHERE YEAR(il.IEDate) = YEAR(GETDATE()) AND il.IoE = 0\n"
                    + "                    GROUP BY p.Id,p.ProductName\n"
                    + "                    ORDER BY TongsoLuong DESC";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            dstop10 = new ArrayList<>();
            while (rs.next()) {
                Integer productId = rs.getInt("Id");
                String productName = rs.getString("ProductName");
                Integer tongsoluong = rs.getInt("TongsoLuong");
                Baocao xn = new Baocao();
                xn.setIdsp(productId);
                xn.setTensp(productName);
                xn.setSoluong(tongsoluong);
                dstop10.add(xn);
                System.out.println(productName + " - " + tongsoluong);
            }

        } catch (Exception e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi");
        }
        return dstop10;
    }
}
