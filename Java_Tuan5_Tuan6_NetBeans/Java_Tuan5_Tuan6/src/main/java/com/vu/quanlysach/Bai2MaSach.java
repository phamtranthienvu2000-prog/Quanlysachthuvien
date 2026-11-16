package com.vu.quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2MaSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danhSachMa = new ArrayList<String>();

        System.out.print("Nhap so ma sach muon them: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap ma sach thu " + (i + 1) + ": ");
            danhSachMa.add(sc.nextLine());
        }

        System.out.println("\nDanh sach ma sach:");
        for (String ma : danhSachMa) {
            System.out.println(ma);
        }

        System.out.print("\nNhap ma sach can tim: ");
        String maTim = sc.nextLine();

        if (danhSachMa.contains(maTim)) {
            System.out.println("Tim thay ma sach " + maTim);
        } else {
            System.out.println("Khong tim thay ma sach!");
        }

        System.out.print("\nNhap ma sach can xoa: ");
        String maXoa = sc.nextLine();

        if (danhSachMa.remove(maXoa)) {
            System.out.println("Da xoa ma sach " + maXoa);
        } else {
            System.out.println("Ma sach khong ton tai!");
        }

        System.out.println("\nDanh sach sau khi xoa:");
        for (String ma : danhSachMa) {
            System.out.println(ma);
        }
    }
}
