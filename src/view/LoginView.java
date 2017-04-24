package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Controller;

public class LoginView extends JFrame {

	JPanel p1;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton b1, b2;

	public LoginView() {
		p1 = new JPanel();
		l1 = new JLabel("Хэрэглэгчийн нэр");
		l2 = new JLabel("Нууц үг");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		b1 = new JButton("Нэвтрэх");
		b2 = new JButton("Гарах");

		p1.setPreferredSize(new Dimension(320, 120));
		l1.setPreferredSize(new Dimension(120, 30));
		l2.setPreferredSize(new Dimension(120, 30));
		t1.setPreferredSize(new Dimension(170, 30));
		t2.setPreferredSize(new Dimension(170, 30));

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(b1, BorderLayout.SOUTH);
		p1.add(b2, BorderLayout.SOUTH);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Controller.login(t1.getText(), t2.getText()) == 0)
					l3.setText("Хэрэглэгчийн нэр эсвэл нууц үг буруу байна.");;
			}
		});

		getContentPane().add(p1);
		pack();
		setTitle("Нэвтрэх");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
