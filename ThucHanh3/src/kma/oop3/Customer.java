package kma.oop3;

public class Customer extends Person {
	private String tenCongTy;
	private double hoaDon;
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public double getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(double hoaDon) {
		this.hoaDon = hoaDon;
	}
	public Customer(String hoTen, String diaChi, String dienThoai, String tenCongTy, double hoaDon) {
		super(hoTen, diaChi, dienThoai);
		this.tenCongTy = tenCongTy;
		this.hoaDon = hoaDon;
	}
	public Customer() {
		super();
	}
	public double chietKhau() {
		return this.hoaDon *0.05;
	}
	@Override
	public String toString() {
		return super.toString()+"[Ten cong ty= " + tenCongTy+ "chiet khau: "+chietKhau();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%-25s %-10.1f\n",this.tenCongTy,this.hoaDon);
	}
}
