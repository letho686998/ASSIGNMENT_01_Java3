/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Vview;

import java.util.List;
import model.User;

/**
 *
 * @author LENOVO
 */
public interface IAcountRepository {
    List<User> findAll();
    User findByUsername(String username);
}
