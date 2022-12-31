package de1.dung;

public class KhachHang {
	private String maKH;
	private String tenKH;
	private int namSinh;
	private String diaChi;
	private double thanhTien;
	
	public void display() {
		System.out.printf("%5s %25s %3d %15s %15.1f%n",this.maKH,this.tenKH,this.namSinh,this.diaChi,this.thanhTien);
	}
	public KhachHang(String maKH, String tenKH, int namSinh, String diaChi,double thanhTien) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
		this.thanhTien=thanhTien;
	}
	public double getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	public KhachHang() {
		super();
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
