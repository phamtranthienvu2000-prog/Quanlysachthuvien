package com.vu.quanlysach;

import java.util.Scanner;

public class Bai1Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] soLuong = new int[5];
        int tong = 0;
        int lonNhat;

        // Nhap so luong cua 5 cuon sach
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
        }

        // Hien thi va tinh tong
        lonNhat = soLuong[0];
        System.out.println("\nSo luong 5 cuon sach:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);
            tong += soLuong[i];

            if (soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }

        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + lonNhat);
    }
}
