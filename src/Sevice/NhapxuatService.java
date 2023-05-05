/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevice;

import Repository.NhapxuatRepository;
import java.util.ArrayList;
import model.Danhmuc;
import model.Xuatnhap;
import model.Xuatnhapton;

/**
 *
 * @author LENOVO
 */
public class NhapxuatService {

    private NhapxuatRepository repository = new NhapxuatRepository();

    public ArrayList<Danhmuc> danhsach() {
        return repository.danhsach();
    }

    public Integer addNhapXuatSanPham(Xuatnhapton x) {
        return repository.addNhapXuatSanPham(x);
    }

    public Integer xuatNhapXuatSanPham(Xuatnhapton x) {
        return repository.xuatNhapXuatSanPham(x);
    }

    public Integer nhapSanPham(Xuatnhap sp, Integer id) {
        return repository.nhapSanPham(sp, id);

    }

    public Integer xuatSanPham(Xuatnhap sp, Integer id) {
        return repository.xuatSanPham(sp, id);
    }
}
