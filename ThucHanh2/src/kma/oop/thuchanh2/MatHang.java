package kma.oop.thuchanh2;

public class MatHang {
	protected String tenHang;
	protected int maHang;
	protected String nuocSX;
	
	public void display() {
		System.out.printf("%-25s %-10d %-25s",this.tenHang,this.maHang,this.nuocSX);
	}
	public MatHang(String tenHang, int maHang, String nuocSX) {
		super();
		this.tenHang = tenHang;
		this.maHang = maHang;
		this.nuocSX = nuocSX;
	}
	public MatHang() {
		super();
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getMaHang() {
		return maHang;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}
	public String getNuocSX() {
		return nuocSX;
	}
	public void setNuocSX(String nuocSX) {
		this.nuocSX = nuocSX;
	}
	
}
