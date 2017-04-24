package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class OfferingView extends JFrame {
	
	JPanel p1, p2, p3;
	JScrollPane sp1,sp2;
	JTable tab1, tab2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton b1, b2, b3;
	
	String data1[][] = { { "Кофе", "Латте", "6000", "10%"}, { "Кофе", "Мока", "6500", "10%"}, { "Мөстэй кофе", "Мөстэй цай латте", "5000", "10%" } };
	String column1[] = { "ТӨРӨЛ", "НЭР", "ҮНЭ", "ХӨНГӨЛӨЛТ" };
	
	String data2[][] = { { "Кофе", "Латте", "6000", "1"}, { "Кофе", "Мока", "13000", "2"}, { "Мөстэй кофе", "Мөстэй цай латте", "20000", "4" } };
	String column2[] = { "ТӨРӨЛ", "НЭР", "НИЙТ ҮНЭ", "ШИРХЭГ" };
	
	public OfferingView(){

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		sp1 = new JScrollPane();
		sp2 = new JScrollPane();
		l1 = new JLabel("Цэс");
		l2 = new JLabel("Захиалга");
		l3 = new JLabel("Нийт дүн: ");
		l4 = new JLabel("0₮");
		t1 = new JTextField(15);
		t2 = new JTextField(15);
		t3 = new JTextField(15);
		b1 = new JButton("Захиалгад\n оруулах");
		b2 = new JButton("Захиалах");
		b3 = new JButton("Үйлчлүүлэгч бүртгэх");
		
		tab1 = new JTable(data1, column1);
		tab2 = new JTable(data2, column2);
		
		
		sp1.add(tab1);
		sp2.add(tab2);
		tab1.setBounds(0, 0, 300, 500);
		tab2.setBounds(0, 0, 300, 500);
		sp1.setPreferredSize(new Dimension(300,500));
		sp2.setPreferredSize(new Dimension(300,500));
		
		p1.setPreferredSize(new Dimension(300,500));
		p2.setPreferredSize(new Dimension(300,500));
		p3.setPreferredSize(new Dimension(600,100));
		p1.add(l1);
		p1.add(sp1);
		p2.add(l2);
		p2.add(sp2);
		p2.add(l3);
		p2.add(l4);
		p3.add(b3);
		p3.add(b2);
		
		getContentPane().add(p1, BorderLayout.WEST);
		getContentPane().add(p2, BorderLayout.EAST);
		getContentPane().add(p3, BorderLayout.SOUTH);
		getContentPane().add(b1, BorderLayout.CENTER);
		pack();
		setTitle("Захиалгын хэсэг");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
