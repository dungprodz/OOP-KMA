package oop.thuchanh1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	static Scanner sc =new Scanner(System.in);
	private static ArrayList<CanBo> list=new ArrayList<CanBo>();
	
	public static ArrayList<CanBo> getList() {
		return list;
	}

	public static void setList(ArrayList<CanBo> list) {
		QuanLyCanBo.list = list;
	}
	public static void nhap() {
		System.out.println("Nhap ma can bo");
		String code=sc.nextLine();
		int index=indexOfCB(code);
		if(index!=-1) {
			System.out.println("can bo da ton tai");
			return;
		}
		System.out.println("nhap he so luong");
		double heSo=Double.parseDouble(sc.nextLine());
		System.out.println("nhap ho ten");
		String name=sc.nextLine();
		System.out.println("nhap dien thoai");
		String phone=sc.nextLine();
		System.out.println("nhap email");
		String mail=sc.nextLine();
		System.out.println("nhap gioi tinh");
		String gender=sc.nextLine();
		System.out.println("nhap phu cap");
		double bonus=Double.parseDouble(sc.nextLine());
		CanBo cb1=new CanBo(code,heSo,name,phone,mail,gender,bonus);
		list.add(cb1);
		System.out.println("nhap thanh cong");
	}

	public static void chucNang1() {
		System.out.println("nhap so luong can bo muon them vao danh sach");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			nhap();
		}
	}
	
	public static void chucNang2() {
		System.out.printf("%-5s %-11s %-25s %-12s %-25s %-5s %-10s\n",
				"Ma CB","He so luong","Ho ten","dien thoai","email","gioi tinh","phu cap");
		for(CanBo x:list) {
			x.display();
		}
	}
	public static void chucNang3() {
		double sum=0;
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i).luong();
		}
		System.out.printf("tong luong can bo: %15.1f\n",sum);
	}
	public static void chucNang4() {
		System.out.println("Nhap ma can bo");
		String code=sc.nextLine();
		int index=indexOfCB(code);
		if(index==-1) {
			System.out.println("can bo ko ton tai");
			return;
		}
		list.get(index).display();
	}
	public static void chucnang5() {
		double max=list.get(0).luong();
		for (int i=0;i<list.size();i++) {
			if(max<list.get(i).luong()) {
				max=list.get(i).luong();
			}
		}
		int index=indexOfLuong(max);
		list.get(index).display();
	}
	public static void chucNang6() {
		System.out.println("Nhap gioi tinh");
		String gender=sc.nextLine();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getGioiTinh().compareToIgnoreCase(gender)==0) {
				list.get(i).display();
			}
		}
	}
	public static void main(String[] args) {
		
		
		
		do {
			System.out.println("--------Chon chuc nang----------");
			System.out.println("\t1.Nhap can bo");
			System.out.println("\t2.Hien thi danh sach can bo");
			System.out.println("\t3.Tong luong cac can bo");
			System.out.println("\t4.Hien thi thong tin can bo tu ban phim");
			System.out.println("\t5.Can bo co luong cao nhat");
			System.out.println("\t6.Hien thi can bo theo gioi tinh");
			System.out.println("\t0.thoat");
			int chon=Integer.parseInt(sc.nextLine());
			
			switch(chon) {
			case 1:chucNang1();break;
			case 2:chucNang2();break;
			case 3:chucNang3();break;
			case 4:chucNang4();;break;
			case 5:chucnang5();;break;
			case 6: chucNang6();;break;
			case 0:System.exit(0);
			}
		}while(true);
		

	
		
	}
	public static int indexOfCB(String id) {
		for(int index=0;index<list.size();index++) {
			if(list.get(index).getMaCB().compareToIgnoreCase(id)==0) {
				return index;
			}
		}
		return -1;
	}
	public static int indexOfLuong(double luong) {
		for(int index=0;index<list.size();index++) {
			if(list.get(index).luong()==luong) {
				return index;
			}
		}
		return -1;
	}
}
