package com.example.module_nv_kh.service;

import com.example.module_nv_kh.entity.NhanVien;
import com.example.module_nv_kh.repository.NhanVienRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    private NhanVienRepository nhanVienRepository;

    public NhanVien createNhanVien(NhanVien nhanVien){
        NhanVien nv = new NhanVien();
        nv.setMa_nhan_vien(nhanVien.getMa_nhan_vien());
        nv.setTen_nhan_vien(nhanVien.getTen_nhan_vien());
        nv.setNgay_sinh(nhanVien.getNgay_sinh());
        nv.setMo_ta(nhanVien.getMo_ta());
        nv.setTrang_thai(nhanVien.getTrang_thai());
        nv.setGioi_tinh(nhanVien.getGioi_tinh());
        nv.setSo_dien_thoai(nhanVien.getSo_dien_thoai());
        nv.setEmail(nhanVien.getEmail());
        nv.setNgay_sua(nhanVien.getNgay_sua());
        nv.setNguoi_tao(nhanVien.getNguoi_tao());
        nv.setNguoi_sua(nhanVien.getNguoi_sua());
        return nhanVienRepository.save(nhanVien);
    }

//    private String generateMaNhanVien(String tenNhanVien){
//            String[] parts = tenNhanVien.trim().split(" ");
//            String lastName = parts[parts.length - 1].toLowerCase();
//            StringBuilder initials = new StringBuilder();
//
//            for(int i = 0; i< parts.length - 1; i++){
//                initials.append(parts[i].toLowerCase().charAt(0));
//            }
//            return lastName + initials;
//    }


    public List<NhanVien> getAllNhanVien(){
        return nhanVienRepository.findAll();
    }

    public NhanVien getNhanVienById(String id) {
        return nhanVienRepository.findById(id).orElse(null);
    }


    public NhanVien updateNhanVien(String id, NhanVien updatedNhanVien) {
        NhanVien existingNhanVien = nhanVienRepository.findById(id).orElse(null);
        if (existingNhanVien != null) {
            existingNhanVien.setMa_nhan_vien(updatedNhanVien.getMa_nhan_vien());
            existingNhanVien.setTen_nhan_vien(updatedNhanVien.getTen_nhan_vien());
            existingNhanVien.setNgay_sinh(updatedNhanVien.getNgay_sinh());
            existingNhanVien.setMo_ta(updatedNhanVien.getEmail());
            existingNhanVien.setTrang_thai(updatedNhanVien.getTrang_thai());
            existingNhanVien.setGioi_tinh(updatedNhanVien.getGioi_tinh());
            existingNhanVien.setSo_dien_thoai(updatedNhanVien.getSo_dien_thoai());
            existingNhanVien.setEmail(updatedNhanVien.getEmail());
            existingNhanVien.setNgay_sua(updatedNhanVien.getNgay_sua());
            existingNhanVien.setNguoi_tao(updatedNhanVien.getNguoi_tao());
            existingNhanVien.setNguoi_sua(updatedNhanVien.getNguoi_sua());
            return nhanVienRepository.save(existingNhanVien);
        }
        return null;
    }

    public void deleteNhanVien(String id) {
        nhanVienRepository.deleteById(id);
    }
}
