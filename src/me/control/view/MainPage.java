package me.control.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JFrame {

	private Container ctn = getContentPane();
	private JLabel jlb = new JLabel("�л�����", JLabel.CENTER);
	private JPanel jpnl1 = new JPanel();
	private JButton jbtn1 = new JButton("������û");
	private JButton jbtn2 = new JButton("������ȸ");
	private JButton jbtn3 = new JButton("�ð�ǥ��ȸ");
	private JLabel jlb2 = new JLabel("", JLabel.CENTER);

	public MainPage() {
		setTitle("�л�����");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocation(260, 60);
		setSize(1400, 900);

		jlb2.setIcon(new ImageIcon("C:\\Users\\savio\\OneDrive\\���� ȭ��\\Test.gif"));

		ctn.setLayout(new BorderLayout());
		jpnl1.setLayout(new GridLayout(1, 3));
		jpnl1.add(jbtn1);
		jpnl1.add(jbtn2);
		jpnl1.add(jbtn3);
		jlb.setFont(new Font("�������", Font.BOLD, 18));
		ctn.add(jlb, BorderLayout.NORTH);
		ctn.add(jlb2, BorderLayout.CENTER);
		ctn.add(jpnl1, BorderLayout.SOUTH);
	}
}
