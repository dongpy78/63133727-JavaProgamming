import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhDangNhap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_TDN;
	private JTextField txt_MK;

	void Xu_Ly_Dang_Nhap() {
		String layTen = txt_TDN.getText();
		String layMatKhau = txt_MK.getText();
		if(layTen.equals("63CNTT") && layMatKhau.equals("123")) {
			HomePage home_page = new HomePage();
			home_page.setVisible(true);
			this.setVisible(false);
		} else {
			txt_TDN.setText("");
			txt_MK.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng Nhập Thất Bại!");
		}
	}
	 
	public ManHinhDangNhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên Đăng Nhập:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(107, 48, 135, 32);
		contentPane.add(lblNewLabel);
		
		txt_TDN = new JTextField();
		txt_TDN.setBounds(252, 49, 234, 35);
		contentPane.add(txt_TDN);
		txt_TDN.setColumns(10);
		
		JLabel lblPassword = new JLabel("Mật Khẩu:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(107, 151, 135, 32);
		contentPane.add(lblPassword);
		
		txt_MK = new JTextField();
		txt_MK.setColumns(10);
		txt_MK.setBounds(252, 151, 234, 35);
		contentPane.add(txt_MK);
		
		JButton btn_DN = new JButton("Đăng  Nhập");
		btn_DN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Xu_Ly_Dang_Nhap();
			}
		});
		btn_DN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_DN.setBounds(252, 241, 135, 43);
		contentPane.add(btn_DN);
	}
}
