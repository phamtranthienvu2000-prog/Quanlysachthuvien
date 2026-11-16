package com.vu.quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySachTuan6 {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Sach> danhSach = new ArrayList<Sach>();

    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("\n===== BAI THUC HANH TUAN 6 =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua thong tin sach");
            System.out.println("6. Tinh tong so luong sach");
            System.out.println("7. Tinh tong gia tri sach");
            System.out.println("8. Thoat");

            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themSach();
                    break;
                case 2:
                    hienThiSach();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    xoaSach();
                    break;
                case 5:
                    suaSach();
                    break;
                case 6:
                    tinhTongSoLuong();
                    break;
                case 7:
                    tinhTongGiaTri();
                    break;
                case 8:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }

    // Bai 1: Them sach vao ArrayList
    static void themSach() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        if (timViTri(ma) != -1) {
            System.out.println("Ma sach da ton tai!");
            return;
        }

        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();

        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap don gia: ");
        double donGia = Double.parseDouble(sc.nextLine());

        danhSach.add(new Sach(ma, ten, soLuong, donGia));
        System.out.println("Them sach thanh cong!");
    }

    // Bai 2: Hien thi danh sach sach
    static void hienThiSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach sach dang rong!");
            return;
        }

        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println((i + 1) + ". " + danhSach.get(i));
        }
    }

    // Tim vi tri sach theo ma
    static int timViTri(String ma) {
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    // Bai 3: Tim sach theo ma
    static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            System.out.println("Tim thay sach: " + danhSach.get(viTri));
        }
    }

    // Bai 4: Xoa sach
    static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            danhSach.remove(viTri);
            System.out.println("Xoa sach thanh cong!");
        }
    }

    // Bai 5: Sua thong tin sach
    static void suaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();

        int viTri = timViTri(ma);

        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
            return;
        }

        Sach sach = danhSach.get(viTri);

        System.out.print("Nhap ten sach moi: ");
        sach.setTenSach(sc.nextLine());

        System.out.print("Nhap so luong moi: ");
        sach.setSoLuong(Integer.parseInt(sc.nextLine()));

        System.out.print("Nhap don gia moi: ");
        sach.setDonGia(Double.parseDouble(sc.nextLine()));

        System.out.println("Sua sach thanh cong!");
    }

    // Bai 6: Tinh tong so luong sach
    static void tinhTongSoLuong() {
        int tong = 0;

        for (Sach sach : danhSach) {
            tong += sach.getSoLuong();
        }

        System.out.println("Tong so luong sach: " + tong);
    }

    // Bai 7: Tinh tong gia tri sach
    static void tinhTongGiaTri() {
        double tong = 0;

        for (Sach sach : danhSach) {
            tong += sach.getSoLuong() * sach.getDonGia();
        }

        System.out.println("Tong gia tri sach: " + tong);
    }
}
