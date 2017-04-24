package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterCustomer extends JFrame{

	JPanel p1;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton b1, b2;
	
	public RegisterCustomer(){
		
		p1 = new JPanel();
		l1 = new JLabel("Нэр");
		l2 = new JLabel("Имэйл хаяг");
		l3 = new JLabel("Утасны дугаар");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		b1 = new JButton("Бүртгэх");
		b2 = new JButton("Цуцлах");
		
		p1.setPreferredSize(new Dimension(320,150));
		l1.setPreferredSize(new Dimension(120,30));
		l2.setPreferredSize(new Dimension(120,30));
		l3.setPreferredSize(new Dimension(120,30));
		t1.setPreferredSize(new Dimension(170,30));
		t2.setPreferredSize(new Dimension(170,30));
		t3.setPreferredSize(new Dimension(170,30));
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1, BorderLayout.SOUTH);
		p1.add(b2, BorderLayout.SOUTH);
		
		getContentPane().add(p1);
		pack();
		setTitle("Үйлчлүүлэгч бүртгэх");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
