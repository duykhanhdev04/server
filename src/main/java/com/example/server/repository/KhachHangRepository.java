package com.example.module_nv_kh.repository;

import com.example.module_nv_kh.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String> {
}
