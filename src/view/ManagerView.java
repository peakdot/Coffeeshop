package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Model;

public class ManagerView extends JFrame{
	
	JPanel p1, p2, p3;
	JButton b1, b2, b3, b4, b5;
	static Model model;
	
	public ManagerView(){
		model = new Model();	
		p1 = new JPanel();
		p2 = new JPanel();
		b1 = new JButton("Ð¢Ð°Ð¹Ð»Ð°Ð½");
		b2 = new JButton("Ð�Ð¶Ð¸Ð»Ñ‚Ð°Ð½\n Ð±Ò¯Ñ€Ñ‚Ð³Ñ�Ñ…");
		b3 = new JButton("Ò®Ð¹Ð»Ñ‡Ð»Ò¯Ò¯Ð»Ñ�Ð³Ñ‡\n Ð±Ò¯Ñ€Ñ‚Ð³Ñ�Ñ…");
		b4 = new JButton("Ð¦Ñ�Ñ� Ò¯Ò¯Ñ�Ð³Ñ�Ñ…");
		b5 = new JButton("Ð“Ð°Ñ€Ð°Ñ…");
		
		
		
		b1.setPreferredSize(new Dimension(160, 60));
		b2.setPreferredSize(new Dimension(160, 60));
		b3.setPreferredSize(new Dimension(160, 60));
		b4.setPreferredSize(new Dimension(160, 60));
		b5.setPreferredSize(new Dimension(160, 60));
		
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		p1.add(b5);
		
		p1.setPreferredSize(new Dimension(170, 400));		
		p2.setPreferredSize(new Dimension(700,400));
		
		getContentPane().add(p1, BorderLayout.WEST);
		getContentPane().add(p2, BorderLayout.CENTER);
		pack();
		setTitle("ÐœÐµÐ½ÐµÐ¶ÐµÑ€Ð¸Ð¹Ð½ Ñ…Ñ�Ñ�Ñ�Ð³");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ManagerView mv = new ManagerView();
		//ProductMenu pm = new ProductMenu();
		LoginView lv = new LoginView();
		//OfferingView ov = new OfferingView();
		
		model.test("INSERT INTO product_type values(12, 'jims')");
		
	}
}
