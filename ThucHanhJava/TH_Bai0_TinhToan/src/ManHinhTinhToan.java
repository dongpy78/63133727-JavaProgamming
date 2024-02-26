import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	
	void XuLyCong() {
		// Lấy dữ liệu từ điều khiển
		String so_A = txtA.getText();
		String so_B = txtB.getText();
		// Chuyen ve kieu du lieu double 
		double a = Double.parseDouble(so_A);
		double b = Double.parseDouble(so_B);
		double tong = a + b;
		txtKQ.setText(String.valueOf(tong));
		
	}
	
	void XuLyTru() {
		// Lấy dữ liệu từ điều khiển
				String so_A = txtA.getText();
				String so_B = txtB.getText();
				// Chuyen ve kieu du lieu double 
				double a = Double.parseDouble(so_A);
				double b = Double.parseDouble(so_B);
				double hieu = a - b;
				txtKQ.setText(String.valueOf(hieu));
	}
	
	void XuLyNhan() {
		// Lấy dữ liệu từ điều khiển
				String so_A = txtA.getText();
				String so_B = txtB.getText();
				// Chuyen ve kieu du lieu double 
				double a = Double.parseDouble(so_A);
				double b = Double.parseDouble(so_B);
				double nhan = a * b;
				txtKQ.setText(String.valueOf(nhan));
	}

	void XuLyChia() {
		// Lấy dữ liệu từ điều khiển
				String so_A = txtA.getText();
				String so_B = txtB.getText();
				// Chuyen ve kieu du lieu double 
				double a = Double.parseDouble(so_A);
				double b = Double.parseDouble(so_B);
				double chia = a / b;
				txtKQ.setText(String.valueOf(chia));
	}
	
	

	public ManHinhTinhToan() {
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất(a): ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(86, 32, 164, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai(b): ");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(86, 103, 164, 22);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtA.setBounds(286, 25, 191, 34);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtB.setColumns(10);
		txtB.setBounds(286, 96, 191, 34);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Code xử lý cộng 
				XuLyCong();
			}
		});
		btnCong.setBounds(49, 173, 85, 34);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(191, 173, 85, 34);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân ");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(338, 173, 85, 34);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(474, 173, 85, 34);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết Quả Tính Toán: ");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(86, 263, 151, 26);
		contentPane.add(lblKtQu);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setBounds(286, 262, 191, 34);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
	}
}
