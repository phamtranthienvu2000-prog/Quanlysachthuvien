package com.vu.quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3DanhSachSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> danhSachSach = new ArrayList<String>();
        int chon;

        do {
            System.out.println("\n===== BAI 3 - DANH SACH SACH =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap thong tin sach: ");
                    danhSachSach.add(sc.nextLine());
                    break;

                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach dang rong!");
                    } else {
                        for (int i = 0; i < danhSachSach.size(); i++) {
                            System.out.println((i + 1) + ". " + danhSachSach.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap tu khoa can tim: ");
                    String tuKhoa = sc.nextLine();
                    boolean co = false;

                    for (String sach : danhSachSach) {
                        if (sach.toLowerCase().contains(tuKhoa.toLowerCase())) {
                            System.out.println(sach);
                            co = true;
                        }
                    }

                    if (!co) {
                        System.out.println("Khong tim thay sach!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap vi tri sach can xoa: ");
                    int viTriXoa = Integer.parseInt(sc.nextLine());

                    if (viTriXoa >= 1 && viTriXoa <= danhSachSach.size()) {
                        danhSachSach.remove(viTriXoa - 1);
                        System.out.println("Da xoa sach!");
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 5:
                    System.out.print("Nhap vi tri sach can sua: ");
                    int viTriSua = Integer.parseInt(sc.nextLine());

                    if (viTriSua >= 1 && viTriSua <= danhSachSach.size()) {
                        System.out.print("Nhap thong tin moi: ");
                        danhSachSach.set(viTriSua - 1, sc.nextLine());
                        System.out.println("Da sua sach!");
                    } else {
                        System.out.println("Vi tri khong hop le!");
                    }
                    break;

                case 0:
                    System.out.println("Ket thuc Bai 3!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
}
