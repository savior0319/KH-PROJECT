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

	private Container ct = getContentPane();
	private JLabel jl = new JLabel("학생관리", JLabel.CENTER);
	private JPanel jp1 = new JPanel();
	private JButton jbt1 = new JButton("수강신청");
	private JButton jbt2 = new JButton("성적조회");
	private JButton jbt3 = new JButton("시간표조회");
	private JLabel jl2 = new JLabel("", JLabel.CENTER);

	public MainPage() {
		setTitle("학생관리");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocation(260, 60);
		setSize(1400, 900);

		jl2.setIcon(new ImageIcon("C:\\Users\\savio\\OneDrive\\바탕 화면\\Test.gif"));

		ct.setLayout(new BorderLayout());
		jp1.setLayout(new GridLayout(1, 3));
		jp1.add(jbt1);
		jp1.add(jbt2);
		jp1.add(jbt3);
		jl.setFont(new Font("맑은고딕", Font.BOLD, 18));
		ct.add(jl, BorderLayout.NORTH);
		ct.add(jl2, BorderLayout.CENTER);
		ct.add(jp1, BorderLayout.SOUTH);
	}
}
