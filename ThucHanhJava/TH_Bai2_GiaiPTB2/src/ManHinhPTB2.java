import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhPTB2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JLabel lblNhpVoH_1;
	private JTextField txtKQ;
	private JButton btnKQ;


	void GiaiPhuongTrinhBac2() {
		String soA = txtA.getText();
		String soB = txtB.getText();
		String soC = txtC.getText();
		double a = Double.parseDouble(soA);
		double b = Double.parseDouble(soB);
		double c = Double.parseDouble(soC);
		if(a==0) {
			txtKQ.setText("x = " + String.valueOf(-c/b));
		} else {
			double den_ta = (b*b) - (4*a*c);
			if(den_ta > 0) {
				double x1 = (-b + Math.sqrt(den_ta))/(2*a);
				double x2 = (-b - Math.sqrt(den_ta))/(2*a);
				txtKQ.setText("x1 = " + String.valueOf(x1) + "    " + "x2 = " + String.valueOf(x2));
			} else if(den_ta == 0) {
				double x = -b/(2*a);
				txtKQ.setText("x1 = x2 = " + String.valueOf(x));
			} else {
				txtKQ.setText("Phương Trình Vô Nghiệm!");
			}
		}
	}
	 
	public ManHinhPTB2() {
		setTitle("Phần Mềm Giải Phương Trình Bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập vào hệ số A: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(167, 40, 142, 32);
		contentPane.add(lblNewLabel);
		
		txtA = new JTextField();
		txtA.setBounds(330, 43, 158, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblNhpVoH = new JLabel("Nhập vào hệ số B: ");
		lblNhpVoH.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpVoH.setBounds(167, 112, 142, 32);
		contentPane.add(lblNhpVoH);
		
		JLabel lblNhpVoH_2 = new JLabel("Nhập vào hệ số C: ");
		lblNhpVoH_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpVoH_2.setBounds(167, 183, 142, 32);
		contentPane.add(lblNhpVoH_2);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(330, 115, 158, 32);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(330, 186, 158, 32);
		contentPane.add(txtC);
		
		lblNhpVoH_1 = new JLabel("Kết Quả:");
		lblNhpVoH_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpVoH_1.setBounds(167, 340, 96, 32);
		contentPane.add(lblNhpVoH_1);
		
		txtKQ = new JTextField();
		txtKQ.setColumns(10);
		txtKQ.setBounds(330, 343, 158, 32);
		contentPane.add(txtKQ);
		
		btnKQ = new JButton("Tính Kết Quả");
		btnKQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GiaiPhuongTrinhBac2();
			}
		});
		btnKQ.setBackground(new Color(0, 128, 255));
		btnKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnKQ.setBounds(330, 261, 151, 39);
		contentPane.add(btnKQ);
	}

}
