package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyWindow extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jtf;
	private JPasswordField jpf;
	private JButton jb;
	private JButton button;
	private JPanel panel1;
	private JPanel panel2;
	private JButton jb1;
	private JButton jb2;
	
	public MyWindow(){
		setLayout(new FlowLayout());
		
		jpf = new JPasswordField(10);
		jtf = new JTextField(10);
		jb = new JButton("Open");
		button = new JButton("Close");
		panel1 = new JPanel();
		panel2 = new JPanel();
		jb1 = new JButton();
		jb2 = new JButton();
		
		panel1.add(jpf);
		panel1.add(jtf);
		panel1.add(jb);
		panel2.add(jb1);
		panel2.add(jb2);
		
		panel1.setBackground(new Color(255,0,0));
		panel2.setBackground(new Color(0,255,0));
		panel1.setPreferredSize(new Dimension(150, 100));
		panel2.setPreferredSize(new Dimension(60, 80));
		
		
		add(panel1);
		add(panel2);
	
		jb.addActionListener(this);
		button.addActionListener(this);
		setSize(300,250);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb){
			char[] password = jpf.getPassword();
			String str = new String(password);
			jtf.setText(str);
		}
		
		if(e.getSource() == button){
			jtf.setText("");
			jpf.setText("");
			//setVisible(false);
		}
		
	}
}
