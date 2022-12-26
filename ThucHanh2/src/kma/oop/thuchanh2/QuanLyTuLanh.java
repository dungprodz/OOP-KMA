package kma.oop.thuchanh2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class QuanLyTuLanh {
	static Scanner sc =new Scanner(System.in);
	private static ArrayList<TuLanh> list=new ArrayList<TuLanh>();
	
	public static ArrayList<TuLanh> getList() {
		return list;
	}

	public static void setList(ArrayList<TuLanh> list) {
		QuanLyTuLanh.list = list;
	}
	
	public static int indexOfTuLanh(String id) {
		for(int index=0;index<list.size();index++) {
			if(list.get(index).getMaTuLanh().compareToIgnoreCase(id)==0) {
				return index;
			}
		}
		return -1;
	}
	public static int indexOfHangTuLanh(String id) {
		for(int index=0;index<list.size();index++) {
			if(list.get(index).getHangSanXuat().compareToIgnoreCase(id)==0) {
				return index;
			}
		}
		return -1;
	}
	public static void nhap() {
		System.out.println("Nhap ma tu lanh");
		String code = sc.nextLine();
		int index=indexOfTuLanh(code);
		if(index!=-1) {
			System.out.println("Tu lanh da ton tai");
			return;
		}
		System.out.println("nhap ten hang");
		String name=sc.nextLine();
		System.out.println("nhap ma hang");
		int maHang=Integer.parseInt(sc.nextLine());
		System.out.println("nhap nuoc san xuat");
		String country=sc.nextLine();
		System.out.println("Nhap dung tich tu lanh");
		int dungtich=Integer.parseInt(sc.nextLine());
		System.out.println("nhap mau sac tu lanh");
		String color=sc.nextLine();
		System.out.println("Nhap hang san xuat");
		String hangSX=sc.nextLine();
		System.out.println("Nhap so luong");
		int amount =Integer.parseInt(sc.nextLine());
		System.out.println("Nhap don gia");
		double donGia=Double.parseDouble(sc.nextLine());
		TuLanh tl1= new TuLanh(name,maHang,country,code,dungtich,color,hangSX,amount,donGia);
		list.add(tl1);
		System.out.println("nhap thanh cong");
	}
	public static void chucNang1() {
		System.out.println("nhap so luong tu lanh muon them vao danh sach");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			nhap();
		}
	}
	public static void chucNang2() {
		System.out.printf("%-25s %-10s %-25s %-15s %-10s %-11s %-25s %-9s %-15s %-15s\n","ten mat hang","ma hang","nuoc san xuat",
				"Ma tu lanh","dung tich","mau sac","hang san xuat","so luong","don gia","Thanh tien");
		for(TuLanh x:list) {
			x.display();
		}
	}
	public static void chucNang3() {
		System.out.println("Nhap hang san xuat");
		String hangSX=sc.nextLine();
		int index = indexOfHangTuLanh(hangSX);
		if(index==-1) {
			System.out.println("khong co tu lanh nao co hang nhu tren");
			return;
		}
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getHangSanXuat().compareToIgnoreCase(hangSX)==0) {
				list.get(i).display();
			}
		}
	}
	public static void chucNang4() {
		double sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i).thanhTien();
		}
		System.out.printf("tong thanh tien: %15.1f\n",sum);
	}
	public static void chucNang5() {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getDungtich()>=200) {
				list.get(i).display();
			}
		}
	}
	public static void chucNang6() {
		Collections.sort(list, new Comparator<TuLanh>(){
			@Override
			public int compare(TuLanh o1, TuLanh o2) {
				return o1.getSoLuong() < o2.getSoLuong() ? 1 : -1;
			}
		});
		for(TuLanh x:list) {
			x.display();
		}
	}
	public static void chucNang7() {
		System.out.println("Nhap ma tu lanh");
		String code = sc.nextLine();
		int index=indexOfTuLanh(code);
		if(index ==-1) {
			System.out.println("Tu lanh ko ton tai");
			return;
		}
		System.out.println("nhap ten hang");
		String name=sc.nextLine();
		System.out.println("nhap ma hang");
		int maHang=Integer.parseInt(sc.nextLine());
		System.out.println("nhap nuoc san xuat");
		String country=sc.nextLine();
		System.out.println("Nhap dung tich tu lanh");
		int dungtich=Integer.parseInt(sc.nextLine());
		System.out.println("nhap mau sac tu lanh");
		String color=sc.nextLine();
		System.out.println("Nhap hang san xuat");
		String hangSX=sc.nextLine();
		System.out.println("Nhap so luong");
		int amount =Integer.parseInt(sc.nextLine());
		System.out.println("Nhap don gia");
		double donGia=Double.parseDouble(sc.nextLine());
		TuLanh tl1= new TuLanh(name,maHang,country,code,dungtich,color,hangSX,amount,donGia);
		list.set(index, tl1);
	}
	public static void main(String[] args) {

		do {
			System.out.println("--------Chon chuc nang----------");
			System.out.println("\t1.Nhap tu lanh");
			System.out.println("\t2.Hien thi tu lanh");
			System.out.println("\t3.liet ke tu lanh");
			System.out.println("\t4.tong tien");
			System.out.println("\t5.in tu lanh > 200l");
			System.out.println("\t6.sap xep danh sach theo so luong");
			System.out.println("\t7.sua thong tin");
			System.out.println("\t0.thoat");
			int chon=Integer.parseInt(sc.nextLine());
			
			switch(chon) {
			case 1:chucNang1();break;
			case 2:chucNang2();break;
			case 3:chucNang3();break;
			case 4:chucNang4();break;
			case 5:chucNang5();break;
			case 6: chucNang6();break;
			case 7:chucNang7();break;
			case 0:System.exit(0);
			}
		}while(true);
		
	}

}
