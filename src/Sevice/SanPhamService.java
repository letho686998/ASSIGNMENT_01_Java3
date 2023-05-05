/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevice;

import Repository.SanPhamRepository;
import java.util.ArrayList;
import model.SanPham;
import model.Xuatnhap;

/**
 *
 * @author LENOVO
 */
public class SanPhamService {

    private SanPhamRepository repository = new SanPhamRepository();

    public ArrayList<SanPham> danhSachSanPham() {
        return repository.lsSanPham();
    }

//     public Integer suaSanPham(SanPham sanPham){
//         return repository.updateSanPham(sanPham);
//     }
    public Integer xoaSanPham(Integer id) {
        return repository.deleteSanPham(id);
    }

    public ArrayList<SanPham> timSanPham(int sanPham) {
        return repository.timSanPham(sanPham);
    }

    public Integer themSp(SanPham sp) throws Exception {
        return repository.addSanPham(sp);
    }

    public Integer suaSp(SanPham sp) {
        return repository.updateSanPham(sp);
    }

   
}
