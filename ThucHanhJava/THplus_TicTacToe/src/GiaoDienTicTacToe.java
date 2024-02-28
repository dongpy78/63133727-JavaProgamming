import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GiaoDienTicTacToe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextField xCount = new JTextField();
	JTextField oCount = new JTextField();
	private JFrame frame;
	private int xCount1 = 0;
	private int oCount1 = 0;
	private String startGame = "X";
	private int b1 = 10;
	private int b2 = 10;
	private int b3 = 10;
	private int b4 = 10;
	private int b5 = 10;
	private int b6 = 10;
	private int b7 = 10;
	private int b8 = 10;
	private int b9 = 10;
	
	private void chonPlayer() {
		if(startGame.equalsIgnoreCase("X")) {
			startGame = "O";
		} else {
			startGame = "X";
		}
		
	}
	
	private void winGame() {
		// Cho người chơi X win
		if(b1 == 1 && b2 == 1 && b3 == 1) {
			JOptionPane.showMessageDialog(frame, "X Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		if(b4 == 1 && b5 == 1 && b6 == 1) {
			JOptionPane.showMessageDialog(frame, "X Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		if(b7 == 1 && b8 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "X Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		if(b1 == 1 && b5 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frame, "X Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		if(b3 == 1 && b5 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frame, "X Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
		}
		// Cho người chơi Y win
				if(b1 == 0 && b2 == 0 && b3 == 0) {
					JOptionPane.showMessageDialog(frame, "O Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
					oCount1++;
					oCount.setText(String.valueOf(oCount1));
				}
				if(b4 == 0 && b5 == 0 && b6 == 0) {
					JOptionPane.showMessageDialog(frame, "O Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
					oCount1++;
					oCount.setText(String.valueOf(oCount1));
				}
				if(b7 == 0 && b8 == 0 && b9 == 0) {
					JOptionPane.showMessageDialog(frame, "O Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
					oCount1++;
					oCount.setText(String.valueOf(oCount1));
				}
				if(b1 == 0 && b5 == 0 && b9 == 0) {
					JOptionPane.showMessageDialog(frame, "O Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
					oCount1++;
					oCount.setText(String.valueOf(oCount1));
				}
				if(b3 == 0 && b5 == 0 && b7 == 0) {
					JOptionPane.showMessageDialog(frame, "O Win!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
					oCount1++;
					oCount.setText(String.valueOf(oCount1));
				}
	}


	/**
	 * Create the frame.
	 */
	public GiaoDienTicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 5, 2, 2));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
					b1 = 1;
				} else {
					btn1.setForeground(Color.BLUE);
					b1 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
					b2 = 1;
				} else {
					btn2.setForeground(Color.BLUE);
					b2 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
					b3 = 1;
				} else {
					btn3.setForeground(Color.BLUE);
					b3 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		panel_2.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("Player X");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_3.add(btnNewButton_3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JButton xCount = new JButton("0");
		xCount.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_4.add(xCount, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JButton btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
					b4 = 1;
				} else {
					btn4.setForeground(Color.BLUE);
					b4 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_6.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
					b5 = 1;
				} else {
					btn5.setForeground(Color.BLUE);
					b5 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_7.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
					b6 = 1;
				} else {
					btn6.setForeground(Color.BLUE);
					b6 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_8.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_8 = new JButton("Player O");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_9.add(btnNewButton_8, BorderLayout.CENTER);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		JButton oCount = new JButton("0");
		oCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		oCount.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_11.add(oCount, BorderLayout.CENTER);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JButton btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
					b7 = 1;
				} else {
					btn7.setForeground(Color.BLUE);
					b7 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_14.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
					b8 = 1;
				} else {
					btn8.setForeground(Color.BLUE);
					b8 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		panel_15.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));
		
		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
					b9 = 1;					
				} else {
					btn9.setForeground(Color.BLUE);
					b9 = 0;
				}
				chonPlayer();
				winGame();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_13.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);		
				b1 = 10;
				b2 = 10;
				b3 = 10;
				b4 = 10;
				b5 = 10;
				b6 = 10;
				b7 = 10;
				b8 = 10;
				b9 = 10;
				
						
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_10.add(btnReset, BorderLayout.CENTER);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(panel_17);
		panel_17.setLayout(new BorderLayout(0, 0));
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Bạn có muốn thoát không!", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_17.add(btnExit, BorderLayout.CENTER);
	}

}
