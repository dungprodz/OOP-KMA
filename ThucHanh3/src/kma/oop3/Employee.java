package kma.oop3;

public class Employee extends Person {
	private double heSoLuong;

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public Employee(String hoTen, String diaChi, String dienThoai, double heSoLuong) {
		super(hoTen, diaChi, dienThoai);
		this.heSoLuong = heSoLuong;
	}

	public Employee() {
		super();
	}

	public double luong() {
		return this.heSoLuong*1650000;
	}
	
	@Override
	public String toString() {
		return super.toString()+ "Luong Employee : "+luong();
	}
	@Override
	public void display() {
		super.display();
		System.out.printf("%-15.1f\n",this.heSoLuong);
	}
}
