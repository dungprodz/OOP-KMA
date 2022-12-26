package kma.oop3;

import java.util.ArrayList;
import java.util.Scanner;





public class QuanLyChuongTrinh {
	static Scanner sc =new Scanner(System.in);
	private static ArrayList<Employee> list=new ArrayList<>();
	private static ArrayList<Customer> list1=new ArrayList<>();
	private static ArrayList<Person> list2=new ArrayList<>();

	
	
	public static void main(String[] args) {
		list2.addAll(list);
		list2.addAll(list1);
		do {
			System.out.println("--------Chon chuc nang----------");
			System.out.println("\t1.Nhap danh sach employee va customer");
			System.out.println("\t2.Hien thi danh sach");
			System.out.println("\t3.tong tien cua employee");
			System.out.println("\t4.in danh sach ten cong ty");
			System.out.println("\t5.in thong tin customer theo sdt nhap vao");
			System.out.println("\t0.thoat");
			int chon=Integer.parseInt(sc.nextLine());
			
			switch(chon) {
			case 1:chucNang1();break;
			case 2:chucNang2();break;
			case 3:chucNang3();break;
			case 4:chucNang4();break;
			case 5:chucNang5();break;
			case 0:System.exit(0);
			}
		}while(true);
	}

	private static void chucNang5() {
		System.out.println("nhap so dien thoai");
		String phone =sc.nextLine();
		int index=indexOfSDT(phone);
		if(index==-1) {
			System.out.println("sdt ko thoa man");
			return;
		}
		list1.get(index).display();
	}

	private static void chucNang3() {
		double sum=0;
		for(Employee x:list) {
			sum+=x.luong();
		}
		System.out.printf("tong luong: %15.1f\n",sum);
	}

	private static void chucNang4() {
		for (Customer x:list1) {
			x.display();
		}
		
	}

	public static void chucNang2() {
		for(int i=0;i<list2.size();i++) {
			list2.get(i).display();
		}
	}

	public static void chucNang1() {
		System.out.println("nhap so emp va cus ban muon nhap");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap employee chon 1, nhap customer chon 2");
			int choice=Integer.parseInt(sc.nextLine());
			if(choice==1) {
				System.out.println("Nhap ho ten");
				String name = sc.nextLine();
				System.out.println("Nhap dia chi");
				String address=sc.nextLine();
				System.out.println("nhap so dien thoai");
				String phone=sc.nextLine();
				System.out.println("nhap he so luong");
				double HSL=Double.parseDouble(sc.nextLine());
				Employee emp1=new Employee(name, address, phone, HSL);
				list.add(emp1);
				list2.addAll(list);
				System.out.println("nhap thanh cong");
			}
			if(choice==2) {
				System.out.println("Nhap ho ten");
				String name = sc.nextLine();
				System.out.println("Nhap dia chi");
				String address=sc.nextLine();
				System.out.println("nhap so dien thoai");
				String phone=sc.nextLine();
				System.out.println("Nhap ho ten cong ty");
				String nameCompany = sc.nextLine();
				System.out.println("nhap tri gia hoa don");
				double HD=Double.parseDouble(sc.nextLine());
				Customer cus1=new Customer(name, address, phone, nameCompany, HD);
				list1.add(cus1);
				list2.addAll(list1);
				System.out.println("nhap thanh cong");
			}
			
		}
	}
	public static int indexOfSDT(String phone) {
		for(int index=0;index<list1.size();index++) {
			if(list1.get(index).getDienThoai().compareToIgnoreCase(phone)==0) {
				return index;
			}
		}
		return -1;
	}
}
