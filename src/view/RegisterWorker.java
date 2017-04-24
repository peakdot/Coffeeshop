package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisterWorker extends JFrame{
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4;
	JTextArea t5;
	JButton b1, b2;
	JPanel p1;
	
	public RegisterWorker(){
		p1 = new JPanel();
		l1 = new JLabel("Нэр");
		l2 = new JLabel("Овог");
		l3 = new JLabel("Утасны дугаар");
		l4 = new JLabel("Регистрийн дугаар");
		l5 = new JLabel("Хаяг");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		t4 = new JTextField(15);
		t5 = new JTextArea(4,20);
		b1 = new JButton("Бүртгэх");
		b2 = new JButton("Цуцлах");
		
		p1.setPreferredSize(new Dimension(320,300));
		l1.setPreferredSize(new Dimension(120,30));
		l2.setPreferredSize(new Dimension(120,30));
		l3.setPreferredSize(new Dimension(120,30));
		l4.setPreferredSize(new Dimension(120,30));
		l5.setPreferredSize(new Dimension(290,30));
		t1.setPreferredSize(new Dimension(170,30));
		t2.setPreferredSize(new Dimension(170,30));
		t3.setPreferredSize(new Dimension(170,30));
		t4.setPreferredSize(new Dimension(170,30));
		t5.setPreferredSize(new Dimension(290,50));
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(l4);
		p1.add(t4);
		p1.add(l5);
		p1.add(t5);
		p1.add(b1, BorderLayout.SOUTH);
		p1.add(b2, BorderLayout.SOUTH);
		
		getContentPane().add(p1);
		pack();
		setTitle("Ажилчин бүртгэх");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
