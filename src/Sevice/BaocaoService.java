/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevice;

import Repository.Baocaorepo;
import java.util.ArrayList;
import model.Baocao;
import model.SanPham;

/**
 *
 * @author LENOVO
 */
public class BaocaoService {
    private Baocaorepo repo = new Baocaorepo();
     public ArrayList<Baocao> top10SpBanchay() {
        return repo.top10SpBanchay();
    }
}
