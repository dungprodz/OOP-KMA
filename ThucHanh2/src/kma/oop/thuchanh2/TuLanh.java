package kma.oop.thuchanh2;

public class TuLanh extends MatHang{
	private String maTuLanh;
	private int dungtich;
	private String mauSac;
	private String hangSanXuat;
	private int soLuong;
	private double donGia;

	
	public void display() {
		super.display();
		System.out.printf("%-15s %-10d %-11s %-25s %-9d %-15.1f %-15.1f\n",this.maTuLanh,this.dungtich,this.mauSac,this.hangSanXuat,
				this.soLuong,this.donGia,this.thanhTien());
	}


	
	public TuLanh(String tenHang, int maHang, String nuocSX, String maTuLanh, int dungtich, String mauSac,
			String hangSanXuat, int soLuong, double donGia) {
		super(tenHang, maHang, nuocSX);
		this.maTuLanh = maTuLanh;
		this.dungtich = dungtich;
		this.mauSac = mauSac;
		this.hangSanXuat = hangSanXuat;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	

	public double thanhTien() {
		return this.donGia*this.soLuong;
	}


	public String getMaTuLanh() {
		return maTuLanh;
	}


	public void setMaTuLanh(String maTuLanh) {
		this.maTuLanh = maTuLanh;
	}


	public TuLanh() {
		super();
	}


	public int getDungtich() {
		return dungtich;
	}


	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}


	public String getMauSac() {
		return mauSac;
	}


	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}


	public String getHangSanXuat() {
		return hangSanXuat;
	}


	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}


	public int getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	
}
