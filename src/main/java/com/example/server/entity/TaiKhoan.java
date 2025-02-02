package com.example.module_nv_kh.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tai_khoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @Column(name = "id_vai_tro")
    private String id_vai_tro;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "trang thai")
    private int trang_thai;

    @CreationTimestamp
    @Column(name = "ngay_tao")
    private LocalDateTime ngay_tao;

    @Column(name = "ngay_sua")
    private LocalDateTime ngay_sua;
}
