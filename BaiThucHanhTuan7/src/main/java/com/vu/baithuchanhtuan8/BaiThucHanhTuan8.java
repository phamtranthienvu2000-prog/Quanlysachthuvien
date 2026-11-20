package com.vu.baithuchanhtuan8;

import java.time.Year;

// Lop Sach: dong goi du lieu bang private
class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor co day du tham so
    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan);
        setSoLuong(soLuong);
    }

    // Getter va Setter cua maSach
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    // Getter va Setter cua tieuDe
    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    // Getter va Setter cua tacGia
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    // Getter va Setter cua namXuatBan
    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();

        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Nam xuat ban khong hop le!");
        }
    }

    // Getter va Setter cua soLuong
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("So luong khong duoc am!");
        }
    }

    // Phuong thuc hien thi thong tin sach
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}

// Lop chinh, tuong tu cach dat ten trong bai tuan 7
public class BaiThucHanhTuan8 {

    public static void main(String[] args) {
        // Tao doi tuong Sach
        Sach sach1 = new Sach(
                "S001",
                "Lap trinh Java",
                "Nguyen Van A",
                2024,
                10
        );

        System.out.println("===== THONG TIN SACH =====");
        sach1.hienThiThongTin();

        // Cap nhat thong tin bang setter
        sach1.setTieuDe("Lap trinh Java co ban");
        sach1.setSoLuong(15);
        sach1.setNamXuatBan(2025);

        System.out.println();
        System.out.println("===== THONG TIN SAU KHI CAP NHAT =====");
        sach1.hienThiThongTin();

        // Kiem tra du lieu khong hop le
        System.out.println();
        System.out.println("===== KIEM TRA DU LIEU =====");
        sach1.setSoLuong(-5);
        sach1.setNamXuatBan(3000);

        System.out.println();
        System.out.println("===== THONG TIN SAU KHI KIEM TRA =====");
        sach1.hienThiThongTin();
    }
}

