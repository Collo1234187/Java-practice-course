import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	private static JFrame frame;
    private static JPanel panel;
    private static JLabel userFirstNameLabel;
    private static JLabel successLabel;
    private static JLabel userLastNameLabel;
    private static JLabel passwordLabel;
    private static JTextField firstName;
    private static JTextField lastName;
    private static JPasswordField  password;
    private static JButton button;
    
	public static void main(String[] args) {
		
	     panel = new JPanel();
		 frame = new JFrame();
		 frame.setSize(350,200);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 frame.add(panel);
		 
		
		panel.setLayout(null);
		
		 userFirstNameLabel = new JLabel("user first name:");
		 userFirstNameLabel.setBounds(10, 20, 100, 20);
		 panel.add(userFirstNameLabel);
		 
		 userLastNameLabel = new JLabel("user last name:");
		 userLastNameLabel.setBounds(10, 20, 100, 80);
		 panel.add(userLastNameLabel);
		 
		 passwordLabel = new  JLabel("password:");
		 passwordLabel.setBounds(10, 22, 100, 140);
		 panel.add(passwordLabel);
		 
		 successLabel = new JLabel("");
		 successLabel.setBounds(130, 140, 170, 30);
		 panel.add(successLabel);
		 
		 
		 firstName = new JTextField(20);
		 firstName.setBounds(120, 20, 165,20);
		 panel.add(firstName);
		 
		 lastName = new JTextField();
		 lastName.setBounds(120, 50, 165, 20);
		 panel.add(lastName);
		
		 password = new JPasswordField();
		 password.setBounds(120, 80, 165, 20);
		 panel.add(password);
		 
		 
		 button = new JButton("login");
		 button.setBounds(10, 120, 80, 30);
		 button.addActionListener(new GUI());
		 panel.add(button);
		 
		 
		 
		 frame.setVisible(true);
		
		 
		 
		 

	}

	public void actionPerformed(ActionEvent e) {
		String userFirstName = firstName.getText();
		String userLastName = lastName.getText();
		String userPassword = password.getText();
		
		if (userFirstName.equals("Collinstone") && userLastName.equals("Odera") && userPassword.equals("13071axyy") ) {
			successLabel.setText("Successful Login");
		}else {
			successLabel.setText("unsuccessful Login");
		
		
		
	}
	}
}

