import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class Problem68 extends GraphicsProgram{
	private JTextField textField;
	
	public void init() {
		textField = new JTextField(20);
		add(textField, SOUTH);
		addActionListeners();
	}
	public void run() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
