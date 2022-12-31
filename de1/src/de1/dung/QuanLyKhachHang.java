package de1.dung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class QuanLyKhachHang {
	static Scanner sc = new Scanner(System.in);
	private static ArrayList<KhachHang> list=new ArrayList<KhachHang>();
	
	public static ArrayList<KhachHang> getList() {
		return list;
	}

	public static void setList(ArrayList<KhachHang> list) {
		QuanLyKhachHang.list = list;
	}

	public static void them() {
		System.out.println("Nhap ma khach hang");
		String code =sc.nextLine();
		int index= indexOfKH(code);
		if(index==-1) {
			System.out.println("Nhap ten khach hang");
			String name=sc.nextLine();
			System.out.println("Nhap nam sinh");
			int namSinh=Integer.parseInt(sc.nextLine());
			System.out.println("Nhap dia chi khach hang");
			String diaChi=sc.nextLine();
			double tienDaMua=0;
			KhachHang kh=new KhachHang(code,name,namSinh,diaChi,tienDaMua);
			list.add(kh);
		}else {
			System.out.println("khach hang da ton tai");
		}
	}
	
	public static void muaHang() {
		System.out.println("Nhap ma khach hang");
		String codeKH =sc.nextLine();
		int index= indexOfKH(codeKH);
		if(index==-1) {
			System.out.println("Nhap ten khach hang");
			String name=sc.nextLine();
			System.out.println("Nhap nam sinh");
			int namSinh=Integer.parseInt(sc.nextLine());
			System.out.println("Nhap dia chi khach hang");
			String diaChi=sc.nextLine();
			System.out.println("Nhap ma hang can mua");
			String code= sc.nextLine();
			int indexSP=QuanLySanPham.indexOfSP(code);
			if(indexSP==-1) {
				System.out.println("mat hang ko ton tai");
				return;
			}else {
				System.out.println("Nhap so luong can mua");
				int amount=Integer.parseInt(sc.nextLine());
				
					if(amount<QuanLySanPham.getList().get(indexSP).getSoLuong()) {
						int soLuong=QuanLySanPham.getList().get(indexSP).getSoLuong()-amount;
						QuanLySanPham.getList().get(indexSP).setSoLuong(soLuong);
						double tien=QuanLySanPham.thanhTien(indexSP, amount);
						KhachHang kh=new KhachHang(codeKH,name,namSinh,diaChi,tien);
						list.add(kh);
						System.out.println("thong tin mua hang");
						System.out.printf("%5s %25s %3d %15.1f %10s%n",
								code,QuanLySanPham.getList().get(indexSP).getTenSP(),amount,
								QuanLySanPham.getList().get(indexSP).getDonGia(),QuanLySanPham.getList().get(indexSP).getNgaySX());
						System.out.println("thanh tien: " +tien);
					}else {
						System.out.println(" sieu thi khong du san pham de ban cho quy khach");
						System.out.println("vui long nhap so luong mua it hon");
						return;
					}
					
				
			}
			
		}else {
			System.out.println("Nhap ma hang can mua");
			String code= sc.nextLine();
			int indexSP=QuanLySanPham.indexOfSP(code);
			if(indexSP==-1) {
				System.out.println("mat hang ko ton tai");
				return;
			}else {
				System.out.println("Nhap so luong can mua");
				int amount=Integer.parseInt(sc.nextLine());
				if(amount<QuanLySanPham.getList().get(indexSP).getSoLuong()) {
					int soLuong=QuanLySanPham.getList().get(indexSP).getSoLuong()-amount;
					QuanLySanPham.getList().get(indexSP).setSoLuong(soLuong);
					double tien=QuanLySanPham.thanhTien(indexSP, amount);
					System.out.println("thong tin mua hang");
					System.out.printf("%5s %25s %3d %15.1f %10s%n",
							code,QuanLySanPham.getList().get(indexSP).getTenSP(),amount,
							QuanLySanPham.getList().get(indexSP).getDonGia(),QuanLySanPham.getList().get(indexSP).getNgaySX());
					System.out.println("thanh tien: " +tien);
				}else {
					System.out.println(" sieu thi khong du san pham de ban cho quy khach");
					System.out.println("vui long nhap so luong mua it hon");
					return;
				}
				
			}
		}
		
	}
	public static void tienLonNhat() {
		Collections.sort(list, new Comparator<KhachHang>() {
			@Override
			public int compare(KhachHang o1, KhachHang o2) {
				return o1.getThanhTien() > o2.getThanhTien()?1:-1;
			}
			
		});
		list.get(0).display();
	}
	public static int indexOfKH(String code) {
		for(int index=0;index<list.size();index++) {
			if(code.compareToIgnoreCase(list.get(index).getMaKH())==0){
				return index;
			}
		}
		return -1;
	}
}
