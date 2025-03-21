import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	int count = 0;
	public GUI() {
		JFrame frame = new JFrame();
		
		JButton button = new JButton("click button");
		button.addActionListener(this);
		
		 label = new JLabel("Number of click: 0");
		
		
		 panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(label);
		panel.add(button);
		
		frame.add(panel,BorderLayout.CENTER );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI frame");
		frame.pack();
		frame.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new GUI();

	}


	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks:"+count);
		
		
	}

}
