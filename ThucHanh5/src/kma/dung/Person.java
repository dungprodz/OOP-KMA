package kma.dung;

import java.io.Serializable;

public class Person implements Serializable{
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String gioiTinh;
	
	public void display() {
		System.out.println("Ho ten: "+this.hoTen);
		System.out.println("Ngay sinh: "+this.ngaySinh);
		System.out.println("dia chi: "+this.diaChi);
		System.out.println("gioi tinh: "+this.gioiTinh);
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
	}
	public Person() {
		super();
	}
	
}
