package kma.dung;

import java.io.Serializable;

public class SinhVien extends Person implements Serializable{
	private String maSV;
	private String email;
	private double diemTK;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getDiemTK() {
		return diemTK;
	}
	public void setDiemTK(double diemTK) {
		this.diemTK = diemTK;
	}
	public SinhVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maSV, String email,
			double diemTK) {
		super(hoTen, ngaySinh, diaChi, gioiTinh);
		this.maSV = maSV;
		this.email = email;
		this.diemTK = diemTK;
	}
	public SinhVien() {
		super();
	}
	public void display() {
		super.display();
		System.out.println("ma sinh vien: "+this.maSV);
		System.out.println("email: "+this.email);
		System.out.println("diem: "+this.diemTK);
	}
}
