package kma.oop3;

public class Person {
	protected String hoTen;
	protected String diaChi;
	protected String dienThoai;
	public Person(String hoTen, String diaChi, String dienThoai) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
	}
	public Person() {
		super();
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getDienThoai() {
		return dienThoai;
	}
	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}
	@Override
	public String toString() {
		return "[hoTen=" + hoTen + ", diaChi=" + diaChi + ", dienThoai=" + dienThoai + "]";
	}
	public void display() {
		System.out.printf("%-25s %-25s %-15s",this.hoTen,this.diaChi,this.dienThoai);
	}
	
}
