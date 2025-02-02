package com.example.module_nv_kh.service;

import com.example.module_nv_kh.entity.KhachHang;
import com.example.module_nv_kh.entity.NhanVien;
import com.example.module_nv_kh.repository.KhachHangRepository;
import com.example.module_nv_kh.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;

    public KhachHang createKhachHang(KhachHang khachHang){
        return khachHangRepository.save(khachHang);
    }

    public List<KhachHang> getAllKhachHang(){
        return khachHangRepository.findAll();
    }


    public KhachHang getKhachHangById(String id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    public KhachHang updateKhachHang(String id, KhachHang updatedKhachHang) {
        KhachHang existingKhachHang = khachHangRepository.findById(id).orElse(null);
        if (existingKhachHang != null) {
            existingKhachHang.setMa_khach_hang(updatedKhachHang.getMa_khach_hang());
            existingKhachHang.setTen_khach_hang(updatedKhachHang.getTen_khach_hang());
            existingKhachHang.setNgay_sinh(updatedKhachHang.getNgay_sinh());
            existingKhachHang.setMo_ta(updatedKhachHang.getEmail());
            existingKhachHang.setTrang_thai(updatedKhachHang.getTrang_thai());
            existingKhachHang.setGioi_tinh(updatedKhachHang.getGioi_tinh());
            existingKhachHang.setSo_dien_thoai(updatedKhachHang.getSo_dien_thoai());
            existingKhachHang.setEmail(updatedKhachHang.getEmail());
            existingKhachHang.setNgay_sua(updatedKhachHang.getNgay_sua());
            existingKhachHang.setNguoi_sua(updatedKhachHang.getNguoi_sua());
            return khachHangRepository.save(existingKhachHang);
        }
        return null;
    }

    public void deleteNhanVien(String id) {
        khachHangRepository.deleteById(id);
    }
}
