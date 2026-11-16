package com.vu.quanlysach;

import java.util.Scanner;

public class QuanLySachTuan5 {
    static Scanner sc = new Scanner(System.in);
    static Sach[] danhSach = new Sach[1000];
    static int n = 0;

    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("\n===== BAI THUC HANH TUAN 5 =====");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tinh tong so luong va tong gia tri sach");
            System.out.println("4. Tim sach theo ma");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    nhapSach();
                    break;
                case 2:
                    hienThiSach();
                    break;
                case 3:
                    tinhTong();
                    break;
                case 4:
                    timSach();
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
    }

    // Bai 1: Nhap n sach bang vong lap
    static void nhapSach() {
        System.out.print("Nhap so luong sach: ");
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach thu " + (i + 1));
            System.out.print("Ma sach: ");
            String ma = sc.nextLine();

            System.out.print("Ten sach: ");
            String ten = sc.nextLine();

            System.out.print("So luong: ");
            int soLuong = Integer.parseInt(sc.nextLine());

            System.out.print("Don gia: ");
            double donGia = Double.parseDouble(sc.nextLine());

            danhSach[i] = new Sach(ma, ten, soLuong, donGia);
        }
    }

    static void hienThiSach() {
        if (n == 0) {
            System.out.println("Danh sach sach dang rong!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(danhSach[i]);
        }
    }

    // Bai 2: Tinh tong so luong va tong gia tri sach
    static void tinhTong() {
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (int i = 0; i < n; i++) {
            tongSoLuong += danhSach[i].getSoLuong();
            tongGiaTri += danhSach[i].getSoLuong() * danhSach[i].getDonGia();
        }

        System.out.println("Tong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }

    // Bai 4: Tim sach theo ma
    static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String maCanTim = sc.nextLine();
        boolean timThay = false;

        for (int i = 0; i < n; i++) {
            if (danhSach[i].getMaSach().equalsIgnoreCase(maCanTim)) {
                System.out.println("Tim thay: " + danhSach[i]);
                timThay = true;
                break;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay sach!");
        }
    }
}
