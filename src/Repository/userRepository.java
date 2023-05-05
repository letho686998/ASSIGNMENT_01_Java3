/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.*;
import helper.DbConnector;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author LENOVO
 */
public class userRepository {

    private static ArrayList<User> lsUser = new ArrayList<>();

    public User timUser(String userName, String password) {
        User ketqua = null;
        try {
            Connection connection = DbConnector.getConnection();

            String query = "select Username,Password,Role from Account "
                    + "where Username =? and Password =?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, userName);
            statement.setString(2, password);
            // statement.setString(3, u.getVaiTro());

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String tenDN = rs.getString("Username");
                String matkhau = rs.getString("Password");
                String vaiTro = rs.getString("Role");
                User use = new User();
                use.setTenDangNhap(tenDN);
                use.setMatKhau(matkhau);
                use.setVaiTro(vaiTro);
                return use;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;//k thay
    }

     public String timTaiKhoanThemTen(User tenDNCanTim)
    {
        String vaitro="";
        try{
            Connection cnn= DbConnector.getConnection();
            String query= 
          "select Username,Passwords,Roles from Account where Username='"+tenDNCanTim.getTenDangNhap()+"' and Passwords='"+tenDNCanTim.getMatKhau()+"'";           
            System.out.println(query);
            Statement st=cnn.createStatement();
            ResultSet rs=st.executeQuery(query);
               
            while(rs.next()){
               vaitro =rs.getString("roles");
            }
        }
        catch(Exception e){
        e.printStackTrace();
    }
        
        return vaitro;
    }
    
       public ArrayList<User> layTaiKhoan(){
        try{
            Connection cnn = DbConnector.getConnection();
            String query = "select * from Account";
            System.out.println(query);
            Statement st = cnn.createStatement();// tạo đối tương st từ đối tương cnn = cách sử dụng phương thức createStatement() qua đó thực thi các câu lệnh SQL đến cơ sở dữ liệu
            ResultSet rs=st.executeQuery(query);
            lsUser=new ArrayList<>();
            while(rs.next())
            {
                String username = rs.getString(1);
                String password=rs.getString(2);
                String role=rs.getString(3);
                lsUser.add(new User(username, password, role));
            }
   
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return lsUser;
    }

}
