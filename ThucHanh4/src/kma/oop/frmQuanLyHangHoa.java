package kma.oop;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmQuanLyHangHoa extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAmount;
	private JTextField txtPrice;
	//khai bao file
	private final File fname=new File("hanghoa.dat");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmQuanLyHangHoa frame = new frmQuanLyHangHoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public HangHoa getHangHoa() {
		HangHoa hh=new HangHoa();
		hh.setName(txtName.getText());
		hh.setAmount(Integer.parseInt(txtAmount.getText()));
		hh.setPrice(Double.parseDouble(txtPrice.getText()));
		
		return hh;
	}
	public static void luuFileHH(HangHoa hh,File fname) throws IOException {
		FileOutputStream fout=new FileOutputStream(fname);
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(hh);
		objout.close();
		fout.close();
		
	}
	
	public static HangHoa docFileHH(File fname) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream(fname);
		ObjectInputStream objin =new ObjectInputStream(fin);
		HangHoa hh=new HangHoa();
		hh=(HangHoa)objin.readObject();
		objin.close();
		fin.close();
		return hh;
	}
	
	/**
	 * Create the frame.
	 */
	public frmQuanLyHangHoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quan Ly Hang Hoa");
		lblNewLabel.setBounds(153, 21, 119, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ten Hang");
		lblNewLabel_1.setBounds(60, 62, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("So Luong");
		lblNewLabel_2.setBounds(60, 98, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Don Gia");
		lblNewLabel_3.setBounds(60, 137, 57, 13);
		contentPane.add(lblNewLabel_3);
		
		txtName = new JTextField();
		txtName.setText("Keo sua");
		txtName.setBounds(132, 59, 96, 19);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAmount = new JTextField();
		txtAmount.setText("5");
		txtAmount.setBounds(132, 95, 96, 19);
		contentPane.add(txtAmount);
		txtAmount.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setText("2000");
		txtPrice.setBounds(132, 134, 96, 19);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		JButton btnAddNew = new JButton("Them Moi");
		btnAddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAmount.setText("");
				txtPrice.setText("");
			}
		});
		
		btnAddNew.setBounds(42, 225, 85, 21);
		contentPane.add(btnAddNew);
		
		JButton btnSaveFile = new JButton("Luu file");
		btnSaveFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HangHoa hh=new HangHoa();
				hh=getHangHoa();
				
				try {
					luuFileHH(hh, fname);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnSaveFile.setBounds(163, 225, 85, 21);
		contentPane.add(btnSaveFile);
		
		JButton btnReadFile = new JButton("Doc File");
		btnReadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HangHoa hh=new HangHoa();
				
				try {
					try {
						hh=docFileHH(fname);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				txtName.setText(hh.getName());
				txtAmount.setText(String.valueOf(hh.getAmount()));
				txtPrice.setText(String.valueOf(hh.getPrice()));
			}
		});
		
		btnReadFile.setBounds(294, 225, 85, 21);
		contentPane.add(btnReadFile);
		
		JButton btnExit = new JButton("Dong");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(426, 225, 85, 21);
		contentPane.add(btnExit);
	}
}
