package oop.thuchanh1;

public class CanBo {
	private String maCB;
	private double heSoLuong;
	private String hoTen;
	private String dienThoai;
	private String email;
	private String gioiTinh;
	private double phuCap;
	
	public void display() {
		System.out.printf("%-5s %-11.1f %-25s %-12s %-25s %-10s %-10.1f\n",this.maCB,this.heSoLuong,this.hoTen,
				this.dienThoai,this.email,this.gioiTinh,this.phuCap);
	}
	public double luong() {
		return this.heSoLuong*1650000+this.phuCap;
	}
	public String getMaCB() {
		return maCB;
	}
	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public CanBo(String maCB, double heSoLuong, String hoTen, String dienThoai, String email, String gioiTinh,
			double phuCap) {
		super();
		this.maCB = maCB;
		this.heSoLuong = heSoLuong;
		this.hoTen = hoTen;
		this.dienThoai = dienThoai;
		this.email = email;
		this.gioiTinh = gioiTinh;
		this.phuCap = phuCap;
	}
	public CanBo() {
		super();
	}
	
	
}
