package de1.dung;

import java.util.Scanner;


public class QuanLySieuThi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("--------------Chon chuc nang-------------");
			System.out.println("\t1.Nhap san pham");
			System.out.println("\t2.Them khach hang");
			System.out.println("\t3.Thay doi thong tin san pham");
			System.out.println("\t4.Hien thi san pham");
			System.out.println("\t5.Thanh tien");
			System.out.println("\t6.Hien thi so tien mua lon nhat");
			System.out.println("\t0.Thoat");
			
			int chon=Integer.parseInt(sc.nextLine());
			switch(chon) {
			case 1:QuanLySanPham.nhap();break;
			case 2:QuanLyKhachHang.them();break;
			case 3:QuanLySanPham.sua();break;
			case 4:QuanLySanPham.hienThi();break;
			case 5:QuanLyKhachHang.muaHang();break;
			case 6:QuanLyKhachHang.tienLonNhat();break;
			case 0: System.exit(0);
			}
		}while(true);
	}

	}

