package kma.dung;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class frmQuanLySinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtDate;
	private JTextField txtAddress;
	private JTextField txtGender;
	private JTextField txtCode;
	private JTextField txtEmail;
	private JTextField txtMark;

	private final File fname=new File("sinhvien.dat");
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmQuanLySinhVien frame = new frmQuanLySinhVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public SinhVien getSinhVien() {
		SinhVien sv=new SinhVien();
		sv.setHoTen(txtName.getText());
		sv.setNgaySinh(txtDate.getText());
		sv.setDiaChi(txtAddress.getText());
		sv.setGioiTinh(txtGender.getText());
		sv.setMaSV(txtCode.getText());
		sv.setEmail(txtEmail.getText());
		sv.setDiemTK(Double.parseDouble(txtMark.getText()));
		return sv;
	}
	public static void luuFileSV(SinhVien sv,File fname) throws IOException {
		FileOutputStream fout=new FileOutputStream(fname);
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(sv);
		objout.close();
		fout.close();
		
	}
	
	public static SinhVien docFileSV(File fname) throws  IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream(fname);
		ObjectInputStream objin =new ObjectInputStream(fin);
		SinhVien sv=new SinhVien();
		sv=(SinhVien)objin.readObject();
		objin.close();
		fin.close();
		return sv;
	}
	public frmQuanLySinhVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 429);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quan Ly Sinh Vien");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(214, 10, 221, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ho ten:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(57, 56, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ngay sinh");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(57, 96, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dia chi");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(57, 133, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gioi tinh");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setToolTipText("");
		lblNewLabel_4.setBounds(57, 172, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ma sinh vien");
		lblNewLabel_5.setBounds(57, 210, 92, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("email");
		lblNewLabel_6.setBounds(57, 247, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Diem TK");
		lblNewLabel_7.setBounds(57, 286, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		txtName = new JTextField();
		txtName.setText("Nguyen Tien Dung");
		txtName.setBounds(151, 52, 243, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setText("05/10/2002");
		txtDate.setBounds(151, 92, 243, 19);
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setText("Ha Noi");
		txtAddress.setBounds(151, 129, 243, 19);
		contentPane.add(txtAddress);
		txtAddress.setColumns(10);
		
		txtGender = new JTextField();
		txtGender.setText("Nam");
		txtGender.setBounds(151, 169, 243, 19);
		contentPane.add(txtGender);
		txtGender.setColumns(10);
		
		txtCode = new JTextField();
		txtCode.setText("At170313");
		txtCode.setBounds(151, 207, 243, 19);
		contentPane.add(txtCode);
		txtCode.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("a@a");
		txtEmail.setBounds(151, 244, 243, 19);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtMark = new JTextField();
		txtMark.setText("6");
		txtMark.setBounds(151, 283, 243, 19);
		contentPane.add(txtMark);
		txtMark.setColumns(10);
		
		
		
		JButton btnAdd = new JButton("Them moi");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinhVien sv=new SinhVien();
				sv=getSinhVien();
				sv.display();
				txtName.setText("");
				txtDate.setText("");
				txtAddress.setText("");
				txtGender.setText("");
				txtCode.setText("");
				txtEmail.setText("");
				txtMark.setText("");
			}
		});
		btnAdd.setBounds(57, 345, 85, 21);
		contentPane.add(btnAdd);
		
		JButton btnSave = new JButton("Luu file");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinhVien sv=new SinhVien();
				
				sv=getSinhVien();
				try {
					luuFileSV(sv, fname);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(178, 345, 85, 21);
		contentPane.add(btnSave);
		
		JButton btnRead = new JButton("Doc file");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					SinhVien sv=new SinhVien();
				
				try {
					try {
						sv=docFileSV(fname);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				txtName.setText(sv.getHoTen());
				txtDate.setText(sv.getNgaySinh());
				txtAddress.setText(sv.getDiaChi());
				txtGender.setText(sv.getGioiTinh());
				txtCode.setText(sv.getMaSV());
				txtEmail.setText(sv.getEmail());
				txtMark.setText(String.valueOf(sv.getDiemTK()));
			}
		});
		btnRead.setBounds(309, 345, 85, 21);
		contentPane.add(btnRead);
		
		JButton btnExit = new JButton("Thoat");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(446, 345, 85, 21);
		contentPane.add(btnExit);
	}

	
	
}
