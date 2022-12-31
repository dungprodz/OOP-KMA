package de1.dung;

import java.util.ArrayList;
import java.util.Scanner;


public class QuanLySanPham {
	static Scanner sc = new Scanner(System.in);
	private static ArrayList<SanPham> list=new ArrayList<SanPham>();
	
	public static ArrayList<SanPham> getList() {
		return list;
	}

	public static void setList(ArrayList<SanPham> list) {
		QuanLySanPham.list = list;
	}

	public static void nhap() {
		System.out.println("Nhap ma san pham moi:");
		String code =sc.nextLine();
		int index= indexOfSP(code);
		if(index!=-1) {
			System.out.println("San pham da ton tai");
			System.out.println("Nhap so luong can tang");
			int soLuongThem=Integer.parseInt(sc.nextLine());
			int	amount=list.get(index).getSoLuong()+soLuongThem;
			list.get(index).setSoLuong(amount);
		}else {
			System.out.println("Nhap ten san pham");
			String name=sc.nextLine();
			System.out.println("Nhap so luong");
			int soLuong=Integer.parseInt(sc.nextLine());
			System.out.println("Nhap don gia");
			double donGia=Double.parseDouble(sc.nextLine());
			System.out.println("Nhap ngay san pham");
			String date=sc.nextLine();
			SanPham sp=new SanPham(code,name,soLuong,donGia,date);
			list.add(sp);
		}
	}
	public static void sua() {
		System.out.println("Nhap ma san pham");
		String code =sc.nextLine();
		int index= indexOfSP(code);
		if(index==-1) {
			System.out.println("san pham khong ton tai");
			return;
		}
		System.out.println("Nhap ten san pham moi");
		String name=sc.nextLine();
		System.out.println("Nhap so luong moi");
		int soLuong=Integer.parseInt(sc.nextLine());
		System.out.println("Nhap don gia moi");
		double donGia=Double.parseDouble(sc.nextLine());
		System.out.println("Nhap ngay san pham moi");
		String date=sc.nextLine();
		SanPham sp=new SanPham(code,name,soLuong,donGia,date);
		list.set(index, sp);
		System.out.println("sua thanh cong");
	}
	public static void hienThi() {
		for(SanPham x:list) {
			x.display();
		}
	}
	public static int indexOfSP(String code) {
		for(int index=0;index<list.size();index++) {
			if(code.compareToIgnoreCase(list.get(index).getMaSP())==0){
				return index;
			}
		}
		return -1;
		
	}
	public static double thanhTien(int index,int amount) {
		return list.get(index).getDonGia()*amount;
	}
}
