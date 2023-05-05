/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vview;

import Sevice.NhapxuatService;

import helper.DbConnector;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Danhmuc;
import java.util.Date;
import model.SanPham;
import model.Xuatnhap;
import model.Xuatnhapton;

/**
 *
 * @author LENOVO
 */
public class NHAPXUAT extends javax.swing.JFrame {

    private NhapxuatService service = new NhapxuatService();

    public NHAPXUAT() {
        initComponents();
        setLocationRelativeTo(null);
        loadDataToCombobox();
        //loadDataToTable();
    }

    public void loadDataToCombobox() {

        DefaultComboBoxModel boxmodel = (DefaultComboBoxModel) cboDanhmuc.getModel();
        boxmodel.removeAllElements();
        ArrayList<Danhmuc> danhmucs = service.danhsach();
        boxmodel.addAll(danhmucs);
        cboDanhmuc.setModel(boxmodel);
        cboDanhmuc.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboDanhmuc = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhapxuat = new javax.swing.JTable();
        btnNhap = new javax.swing.JButton();
        btnXuat = new javax.swing.JButton();
        txtSl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cboDanhmuc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDanhmuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboDanhmucItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Danh mục");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NHẬP XUẤT");

        tblNhapxuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblNhapxuat);

        btnNhap.setBackground(new java.awt.Color(51, 51, 255));
        btnNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnNhap.setText("Nhập");
        btnNhap.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null));
        btnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapActionPerformed(evt);
            }
        });

        btnXuat.setBackground(new java.awt.Color(51, 51, 255));
        btnXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnXuat.setText("Xuất");
        btnXuat.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null));
        btnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatActionPerformed(evt);
            }
        });

        txtSl.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 255), null));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Số lượng nhập xuất");

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\quaylai1.jpg")); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(cboDanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(btnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNhap, btnXuat});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhap)
                    .addComponent(btnXuat))
                .addGap(82, 82, 82))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNhap, btnXuat, txtSl});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataToTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblNhapxuat.getModel();

            Connection connection = DbConnector.getConnection();
            String sql = "select p.Id, c.CategoryId,ProductName,Quantity from \n"
                    + "Product p join Category c on p.CategoryId=c.CategoryId where CategoryName=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cboDanhmuc.getSelectedItem().toString());
            ResultSet rs = statement.executeQuery();

            model.setColumnCount(0);
            model.addColumn("ProductId");
            model.addColumn("CategoryId");
            model.addColumn("ProductName");
            model.addColumn("Quantity");
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("Id"),
                    rs.getInt("CategoryId"),
                    rs.getString("ProductName"),
                    rs.getInt("Quantity")});
            }
            statement.clearParameters();
            connection.close();

        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    private void cboDanhmucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboDanhmucItemStateChanged
        loadDataToTable();
    }//GEN-LAST:event_cboDanhmucItemStateChanged


    private void btnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapActionPerformed

        // validate
        if (txtSl.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng không được rỗng");
            txtSl.requestFocus();
            return;
        }
        Integer quantity;
        try {
            quantity = Integer.parseInt(txtSl.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng nhập vào phải là số");
            txtSl.requestFocus();
            return;

        }
        if (quantity <= 0) {
            JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0");
            return;
        }
        int selectedRow = tblNhapxuat.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để nhập");
            return;
        }
        //  Integer categoryId = (Integer) tblNhapxuat.getValueAt(selectedRow, 1);
        Integer id = (Integer) tblNhapxuat.getValueAt(selectedRow, 0);
        Xuatnhap xp = new Xuatnhap();
        xp.setQuantity(quantity);
        xp.setId(id);

        Xuatnhapton xnt = new Xuatnhapton();
        xnt.setProductId(id);
        xnt.setQuantity(quantity);
        if (selectedRow != -1) {

            //nhập sản phẩm vào xuất nhập tồn
            service.addNhapXuatSanPham(xnt);
            //nhập số lượng tương ứng vào bảng sản phẩm
            service.nhapSanPham(xp, id);
            // Cập nhật lại dữ liệu trên Table
            int quan = (int) tblNhapxuat.getValueAt(selectedRow, 3) + quantity;

            loadDataToTable();
            JOptionPane.showMessageDialog(this, "Nhập sản phẩm thành công số lượng sản phẩm : " + quan);
            clear();
        } else {
            JOptionPane.showMessageDialog(this, "Nhập thất bại");
        }


    }//GEN-LAST:event_btnNhapActionPerformed
    private void clear() {
        txtSl.setText("");
    }
    private void btnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatActionPerformed

        //int quantity = Integer.parseInt(JOptionPane.showInputDialog("Nhập số lượng xuất"));
        if (txtSl.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng không được rỗng");
            txtSl.requestFocus();
            return;
        }

        int selectedRow = tblNhapxuat.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm để xuất");
            return;
        }
        Integer quantity;
        try {
            quantity = Integer.parseInt(txtSl.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lượng xuất phải là số");
            txtSl.requestFocus();
            return;

        }

        Xuatnhap xn = new Xuatnhap();
        xn.setQuantity(quantity);
        Integer id = (Integer) tblNhapxuat.getValueAt(selectedRow, 0);
        Xuatnhapton xnt = new Xuatnhapton();
        xnt.setProductId(id);
        xnt.setQuantity(quantity);

        if (selectedRow != -1) {
            //xuất trong bảnng xuất nhập tồn
            String productName = (String) tblNhapxuat.getValueAt(selectedRow, 2);
            service.xuatNhapXuatSanPham(xnt);

            int currentQuantity = (int) tblNhapxuat.getValueAt(selectedRow, 3);
            if (currentQuantity >= quantity) {
                //xuất trong bảng sản phẩm
                service.xuatSanPham(xn, id);
                // Cập nhật lại dữ liệu trên Table
                int socai = currentQuantity - quantity;
               // tblNhapxuat.setValueAt(currentQuantity - quantity, selectedRow, 3);
                loadDataToTable();
                JOptionPane.showMessageDialog(this, "Xuất thành công sản phẩm số lượng còn :" + socai);
                clear();
            } else {
                JOptionPane.showMessageDialog(null, "Số lượng sản phẩm không đủ để xuất");
                clear();
            }
        }

    }//GEN-LAST:event_btnXuatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DangNhap1 main = new DangNhap1();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NHAPXUAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NHAPXUAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NHAPXUAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NHAPXUAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NHAPXUAT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnXuat;
    private javax.swing.JComboBox cboDanhmuc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhapxuat;
    private javax.swing.JTextField txtSl;
    // End of variables declaration//GEN-END:variables
}
