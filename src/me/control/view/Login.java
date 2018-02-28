package me.control.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener, KeyListener {

	private Container ct = getContentPane();
	private JPanel jp1 = new JPanel();
	private JLabel jl1 = new JLabel("아이디", JLabel.CENTER);
	private JLabel jl2 = new JLabel("패스워드", JLabel.CENTER);
	private JTextField jtf1 = new JTextField();
	private JTextField jtf2 = new JTextField();
	private JButton jbt = new JButton("로그인");

	public Login() {
		setTitle("학생관리프로그램");
		setSize(300, 150);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl1.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jl2.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jbt.setFont(new Font("맑은고딕", Font.BOLD, 15));

		ct.setLayout(new BorderLayout());
		jp1.setLayout(new GridLayout(2, 2));
		jp1.add(jl1);
		jp1.add(jtf1);
		jp1.add(jl2);
		jp1.add(jtf2);
		ct.add(jp1, BorderLayout.CENTER);
		ct.add(jbt, BorderLayout.SOUTH);

		jbt.addActionListener(this);
		jbt.addKeyListener(this);
		jtf1.addKeyListener(this);
		jtf2.addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String getId = jtf1.getText();
		String getPw = jtf2.getText();
		if (e.getSource() == jbt) {
			if ((getId.equals("admin")) && (getPw.equals("admin"))) {
				JOptionPane.showMessageDialog(null, "로그인성공");
				jtf1.setText("");
				jtf2.setText("");
				new MainPage().setVisible(true);
			} else if ((getId.equals("") || getPw.equals(""))) {
				JOptionPane.showMessageDialog(null, "아이디와 비밀번호 모두 입력하세요");
			} else {
				JOptionPane.showMessageDialog(null, "아이디 또는 비밀 번호를 잘못 입력했습니다");
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String getId = jtf1.getText();
		String getPw = jtf2.getText();
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if ((getId.equals("admin")) && (getPw.equals("admin"))) {
				JOptionPane.showMessageDialog(null, "로그인성공");
				jtf1.setText("");
				jtf2.setText("");
				new MainPage().setVisible(true);
			} else if ((getId.equals("") || getPw.equals(""))) {
				JOptionPane.showMessageDialog(null, "아이디와 비밀번호 모두 입력하세요");
			} else {
				JOptionPane.showMessageDialog(null, "아이디 또는 비밀 번호를 잘못 입력했습니다");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
}
