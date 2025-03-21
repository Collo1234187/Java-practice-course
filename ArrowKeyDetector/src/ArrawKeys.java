import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class ArrawKeys {
	public ArrawKeys() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setFocusable(true);
		
		JPanel panel = new JPanel();
		 final JLabel up = new JLabel();
		 final JLabel down  = new JLabel();
		final JLabel right = new JLabel();
		final JLabel left = new JLabel();
		
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);
		
		
		up.setText("UP = 0");
		down.setText("down = 0");
		right.setText("right = 0");
		left.setText("left = 0");
		
		frame.addKeyListener(new KeyListener(){
			int upCounter = 0;
			int downCounter = 0;
			int rightCounter = 0;
			int leftCounter = 0;

			public void keyTyped(KeyEvent e) {
				
				
				
			}

			public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
				
				switch (keyCode) {
					case KeyEvent.VK_UP:
						 up.setText("up = 0" +Integer.toString(upCounter++));	
					 break;
					case KeyEvent.VK_DOWN:
						 down.setText("down = 0" +Integer.toString(downCounter++));	
						 break;
					case KeyEvent.VK_LEFT:
						 left.setText("left = 0" +Integer.toString(leftCounter++));	
						 break;
					case KeyEvent.VK_RIGHT:
						 right.setText("right = 0" +Integer.toString(rightCounter++));	
						break;	
				
			}	

			}
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}});
		frame.add(panel);
	}
	

	public static void main(String[] args) {
	  new ArrawKeys();

	}

}
