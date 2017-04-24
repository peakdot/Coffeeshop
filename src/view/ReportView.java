package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReportView extends JFrame{
	
	String[] time = { "Өдрөөр", "Сараар", "Жилээр" };
	String[] viewType = { "Графикаар", "Хүснэгтээр", "Үгээр", "Холимог" };
	String[] reportType = { "Цэвэр оролгын", "Зарлагын", "Орлогын" };
	JPanel p1, p2, p3;
	JLabel l1, l2, l3;
	JButton b1, b2, b3;

	public ReportView(){		
		JComboBox cb1 = new JComboBox(time);
		JComboBox cb2 = new JComboBox(viewType);
		JComboBox cb3 = new JComboBox(reportType);
		cb1.setSelectedIndex(0);
		cb2.setSelectedIndex(0);
		cb3.setSelectedIndex(0);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		l1 = new JLabel("Хугацаа");
		l2 = new JLabel("Үзүүлэх төрөл");
		l3 = new JLabel("Тайлангийн төрөл");
		b1 = new JButton("Тайлан гаргах");
		b2 = new JButton("Хэвлэх");
		b3 = new JButton("Буцах");
		
		p1.add(l1);
		p1.add(cb1);
		p1.add(l2);
		p1.add(cb2);
		p1.add(l3);
		p1.add(cb3);
		p1.add(b1);
		
		p2.add(b2);
		p2.add(b3);
		
		p1.setPreferredSize(new Dimension(120, 400));		
		p3.setPreferredSize(new Dimension(700,400));
		
		getContentPane().add(p1, BorderLayout.WEST);
		getContentPane().add(p2, BorderLayout.SOUTH);
		getContentPane().add(p3, BorderLayout.CENTER);
		pack();
		setTitle("Тайлан гаргах");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
