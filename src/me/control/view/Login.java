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
	private JLabel jl1 = new JLabel("���̵�", JLabel.CENTER);
	private JLabel jl2 = new JLabel("�н�����", JLabel.CENTER);
	private JTextField jtf1 = new JTextField();
	private JTextField jtf2 = new JTextField();
	private JButton jbt = new JButton("�α���");

	public Login() {
		setTitle("�л��������α׷�");
		setSize(300, 150);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl1.setFont(new Font("�������", Font.BOLD, 15));
		jl2.setFont(new Font("�������", Font.BOLD, 15));
		jbt.setFont(new Font("�������", Font.BOLD, 15));

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
				JOptionPane.showMessageDialog(null, "�α��μ���");
				jtf1.setText("");
				jtf2.setText("");
				new MainPage().setVisible(true);
			} else if ((getId.equals("") || getPw.equals(""))) {
				JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ ��� �Է��ϼ���");
			} else {
				JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��� ��ȣ�� �߸� �Է��߽��ϴ�");
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String getId = jtf1.getText();
		String getPw = jtf2.getText();
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if ((getId.equals("admin")) && (getPw.equals("admin"))) {
				JOptionPane.showMessageDialog(null, "�α��μ���");
				jtf1.setText("");
				jtf2.setText("");
				new MainPage().setVisible(true);
			} else if ((getId.equals("") || getPw.equals(""))) {
				JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ ��� �Է��ϼ���");
			} else {
				JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��� ��ȣ�� �߸� �Է��߽��ϴ�");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {}
}
