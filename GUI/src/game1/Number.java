package game1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Number extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	
	//  in this app try find integer betwen 1 and 10
	
	private static final long serialVersionUID = 1L;
	private JTextField number;
	private JTextField bigLess;
	private JTextField times;
	private JButton check;
	private JPanel panel;
	
	public Number(){
        
		setLayout(new FlowLayout());
		
		number = new JTextField(2);
		bigLess = new JTextField(4);
		times = new JTextField(1);
		check = new JButton("Check");
		panel = new JPanel();
		
		panel.add(number);
		panel.add(bigLess);
		panel.add(check);
		panel.add(times);
		add(panel);
		
		times.setText("3");
		
		check.addActionListener(this);

		setSize(300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == check){
			
			int iNumber = (int) (Math.random() * 10);
	        
			if(Integer.parseInt(number.getText()) == iNumber){
				bigLess.setText("OK");
				check.setEnabled(false);
				panel.setBackground(Color.GREEN);
			}
			
			if(Integer.parseInt(number.getText()) < iNumber){
				bigLess.setText("Big");
				times.setText(String.valueOf(Integer.parseInt(times.getText()) - 1));
			}
			
			if(Integer.parseInt(number.getText()) > iNumber){
				bigLess.setText("Less");
				times.setText(String.valueOf(Integer.parseInt(times.getText()) - 1));
			}
			
			if(Integer.parseInt(times.getText()) == 0){
				bigLess.setText("END");
				check.setEnabled(false);
				panel.setBackground(Color.RED);
			}
		}
	}

}
