package de1.dung;

public class SanPham {
	private String maSP;
	private String tenSP;
	private int soLuong;
	private double donGia;
	private String ngaySX;
	
	public void display() {
		System.out.printf("%5s %25s %3d %15.1f %10s%n",this.maSP,this.tenSP,this.soLuong,this.donGia,this.ngaySX);
	}
	
	public SanPham(String maSP, String tenSP, int soLuong, double donGia, String ngaySX) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.soLuong=soLuong;
		this.donGia = donGia;
		this.ngaySX = ngaySX;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public SanPham() {
		super();
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getNgaySX() {
		return ngaySX;
	}
	public void setNgaySX(String ngaySX) {
		this.ngaySX = ngaySX;
	}
	

}
