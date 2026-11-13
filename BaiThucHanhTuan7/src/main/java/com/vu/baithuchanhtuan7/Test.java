package tuan7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    static ArrayList<Sach> danhSach = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Them sach
    public static void themSach() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();

        System.out.print("Nhap tieu de: ");
        String ten = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());

        Sach s = new Sach(ma, ten, tacGia, nam, soLuong);
        danhSach.add(s);

        System.out.println("Them sach thanh cong!");
    }

    // Hien thi danh sach
    public static void hienThiDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach sach trong!");
            return;
        }

        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }
    }

    // Tim sach theo ma
    public static void timSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();

        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                s.hienThiThongTin();
                return;
            }
        }

        System.out.println("Khong tim thay sach!");
    }

    // Xoa sach
    public static void xoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();

        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).getMaSach()
                    .equalsIgnoreCase(ma)) {
                danhSach.remove(i);
                System.out.println("Xoa sach thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay sach!");
    }

    // Sua thong tin sach
    public static void suaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();

        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {

                System.out.print("Nhap tieu de moi: ");
                s.setTieuDe(sc.nextLine());

                System.out.print("Nhap tac gia moi: ");
                s.setTacGia(sc.nextLine());

                System.out.print("Nhap nam xuat ban moi: ");
                s.setNamXuatBan(
                    Integer.parseInt(sc.nextLine()));

                System.out.print("Nhap so luong moi: ");
                s.setSoLuong(
                    Integer.parseInt(sc.nextLine()));

                System.out.println("Sua thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay sach!");
    }

    // Ham main
    public static void main(String[] args) {

        int chon;

        do {
            System.out.println("\n===== QUAN LY SACH THU VIEN =====");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Sua thong tin sach");
            System.out.println("5. Xoa sach");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themSach();
                    break;
                case 2:
                    hienThiDanhSach();
                    break;
                case 3:
                    timSach();
                    break;
                case 4:
                    suaSach();
                    break;
                case 5:
                    xoaSach();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);
    }
}