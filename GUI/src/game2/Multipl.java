package game2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Multipl extends JFrame implements ActionListener{
	/**
	 * 
	 */
	
	//   in this app you can check haow good you multiply two integers
	
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField number1;
	private JTextField number2;
	private JTextField answer;
	private JTextField result;
	private JTextField times;
	private JButton ok;
	
	public Multipl(){
        
		setLayout(new FlowLayout());
		
		panel = new JPanel();
		number1 = new JTextField(2);
		number2 = new JTextField(2);
		answer = new JTextField(3);
		result = new JTextField(2);
		times = new JTextField(2);
		ok = new JButton("OK");
		
		add(number1);
		add(number2);
		add(answer);
		add(ok);
		panel.add(result);
		panel.add(times);
		setName("Multipl");
		
		int iNumber1 = 1+(int) (Math.random() * 10);
		int iNumber2 = 1+(int) (Math.random() * 10);
		number1.setText(String.valueOf(iNumber1));
		number2.setText(String.valueOf(iNumber2));
		
		ok.addActionListener(this);
		setTitle("Mult");
		
		add(panel);
		
		result.setText("0");
		times.setText("0");

		setSize(300,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ok){
			if(Integer.parseInt(number1.getText()) * Integer.parseInt(number2.getText()) == Integer.parseInt(answer.getText())){
				result.setText(String.valueOf(Integer.parseInt(result.getText()) + 1));
				times.setText(String.valueOf(Integer.parseInt(times.getText()) + 1));
			}
			
			else{
				times.setText(String.valueOf(Integer.parseInt(times.getText()) + 1));
			}
			
			int iNumber1 = 1+(int) (Math.random() * 10);
			int iNumber2 = 1+(int) (Math.random() * 10);
			number1.setText(String.valueOf(iNumber1));
			number2.setText(String.valueOf(iNumber2));
			
			if(Integer.parseInt(times.getText()) == 10){
				ok.setEnabled(false);
				if(Integer.parseInt(result.getText()) >= 9){
					panel.setBackground(Color.GREEN);
				}
				if(Integer.parseInt(result.getText()) < 9 && Integer.parseInt(result.getText()) > 4){
					panel.setBackground(Color.YELLOW);
				}
				
				if(Integer.parseInt(result.getText()) <= 4 ){
					panel.setBackground(Color.RED);
				}
			}
			
		}
		
	}
	
}
