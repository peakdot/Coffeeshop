package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProductMenu extends JFrame {

	String data[][] = { { "ÐšÐ¾Ñ„Ðµ", "Ð›Ð°Ñ‚Ñ‚Ðµ", "6000", "10%"}, { "ÐšÐ¾Ñ„Ðµ", "ÐœÐ¾ÐºÐ°", "6500", "10%"}, { "ÐœÓ©Ñ�Ñ‚Ñ�Ð¹ ÐºÐ¾Ñ„Ðµ", "ÐœÓ©Ñ�Ñ‚Ñ�Ð¹ Ñ†Ð°Ð¹ Ð»Ð°Ñ‚Ñ‚Ðµ", "5000", "10%" } };
	String column[] = { "Ð¢Ó¨Ð Ó¨Ð›", "Ð�Ð­Ð ", "Ò®Ð�Ð­", "Ð¥Ó¨Ð�Ð“Ó¨Ð›Ó¨Ð›Ð¢" };
	JTable tab1,tab2;
	JButton b1, b2, b3;
	JScrollPane sp1, sp2;
	JPanel p3;

	public ProductMenu() {
		tab1 = new JTable(data, column);
		sp1 = new JScrollPane(tab1);
		p3 = new JPanel();
		b1 = new JButton("Ð�Ñ�Ð¼Ñ�Ñ…");
		b2 = new JButton("Ð¥Ð°Ñ�Ð°Ñ…");
		b3 = new JButton("Ð¦ÑƒÑ†Ð»Ð°Ñ…");
		
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		
		tab1.setBounds(30, 40, 200, 300);
		
		getContentPane().add(sp1);
		getContentPane().add(p3, BorderLayout.SOUTH);
		pack();
		setTitle("Ð¦Ñ�Ñ� Ò¯Ò¯Ñ�Ð³Ñ�Ñ…");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
