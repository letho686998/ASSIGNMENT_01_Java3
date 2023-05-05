/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevice;

import Repository.DieuChinhGiaRepository;
import java.util.ArrayList;
import model.Danhmuc;
import model.DieuChinhGia;


public class DieuChinhGiaService {
    private DieuChinhGiaRepository repository= new DieuChinhGiaRepository();
    public ArrayList<Danhmuc> getAll(){
        return repository.getAll();
    }
   public Integer updateSanPham(DieuChinhGia giaupdate, String tenSp) {
       return repository.updateSanPham(giaupdate, tenSp);
   }

}
