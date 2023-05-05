/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import model.User;
import repository.userRepository;

/**
 *
 * @author LENOVO
 */
public class userService {

    private userRepository repository = new userRepository();

    public User tim(String tendn, String matkhau) {
        return repository.timUser(tendn, matkhau);
    }

    public String timTaiKhoanThemTen(User tenDNCanTim){
        return repository.timTaiKhoanThemTen(tenDNCanTim);
    }
    
     public ArrayList<User> xemDanhSachTK(){
        return repository.layTaiKhoan();
    }
}
