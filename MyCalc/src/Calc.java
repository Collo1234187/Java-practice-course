import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;



 class Calc   implements ActionListener {
	private static JFrame f;
	private static Label L1;
	private static Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	private static Button badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback;
	private static double x;
	private static double num1,num2,check;
	
	Calc () {
		f = new JFrame("My calculator");
		L1 = new Label();
		L1.setBackground(Color.lightGray);
		L1.setBounds(50,50,260,60);
		
		b1 = new Button("1");
			b1.setBounds(50,340,50,50);
		b2 = new Button("2");
			b2.setBounds(120, 340, 50, 50);
		b3 = new Button("3");
			b3.setBounds(190,340,50,50);
		b4 = new Button("4");
			b4.setBounds(50,270,50,50);
		b5 = new Button("5");
			b5.setBounds(120,270,50,50);
		b6 = new Button("6");
			b6.setBounds(190,270,50,50);
		b7 = new Button("7");
			b7.setBounds(50,200,50,50);
		b8 = new Button("8");
			b8.setBounds(120,200,50,50);
		b9 = new Button("9");
			b9.setBounds(190,200,50,50);
		b0 = new Button("0");
			b0.setBounds(120,410,50,50);
		bneg=new Button("+/-");
			 bneg.setBounds(50,410,50,50);
		bpts=new Button(".");
			 bpts.setBounds(190,410,50,50);
		bback=new Button("back");
			 bback.setBounds(120,130,50,50);	
			
			badd=new Button("+");
			  badd.setBounds(260,340,50,50);
			bsub=new Button("-");
			  bsub.setBounds(260,270,50,50);
			bmult=new Button("*");
			  bmult.setBounds(260,200,50,50);
			bdiv=new Button("/");
			  bdiv.setBounds(260,130,50,50);
			bmod=new Button("%");
			  bmod.setBounds(190,130,50,50);
			bcalc=new Button("=");
			  bcalc.setBounds(245,410,65,50);
			bclr=new Button("CE"); 
			  bclr.setBounds(50,130,65,50);
	
		b1.addActionListener(this);
		b2.addActionListener(this);  
		b3.addActionListener(this);  
		b4.addActionListener(this);  
		b5.addActionListener(this); 
		b6.addActionListener(this); 
		b7.addActionListener(this); 
		b8.addActionListener(this); 
		b9.addActionListener(this);  
		b0.addActionListener(this);
		
		

		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmult.addActionListener(this);
		bdiv.addActionListener(this);
		bmod.addActionListener(this);
		bcalc.addActionListener(this);
		bclr.addActionListener(this);
		bpts.addActionListener(this);
		bneg.addActionListener(this);
		bback.addActionListener(this);
		
		
		f.add(L1);  
		f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

		f.add(badd); f.add(bsub); f.add(bmod); f.add(bmult); f.add(bdiv); f.add(bmod);f.add(bcalc);

		f.add(bneg); f.add(bpts); f.add(bclr); f.add(bback);

		f.setSize(360,500);  
		f.setLayout(null);  
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);  
	
		
	}
	
public void actionPerformed(ActionEvent e) {
		String z,zt;
		
if (e.getSource()==b1) {
	zt = L1.getText();
	 z = zt+"1";
	 L1.setText(z);
}
if (e.getSource()==b2) {
	zt = L1.getText();
	 z = zt+"2";
	 L1.setText(z);
}
if (e.getSource()==b3) {
	zt = L1.getText();
	 z = zt+"3";
	 L1.setText(z);
}
if (e.getSource()==b4) {
	zt = L1.getText();
	 z = zt+"4";
	 L1.setText(z);
}
if (e.getSource()==b5) {
	zt = L1.getText();
	 z = zt+"5";
	 L1.setText(z);
}
if (e.getSource()==b6) {
	zt = L1.getText();
	 z = zt+"6";
	 L1.setText(z);
}
if (e.getSource()==b7) {
	zt = L1.getText();
	 z = zt+"7";
	 L1.setText(z);
}
if (e.getSource()==b8) {
	zt = L1.getText();
	 z = zt+"8";
	 L1.setText(z);
}
if (e.getSource()==b9) {
	zt = L1.getText();
	 z = zt+"9";
	 L1.setText(z);
}
if (e.getSource()==b0) {
	zt = L1.getText();
	 z = zt+"0";
	 L1.setText(z);
}

if (e.getSource()==bpts) {
	zt = L1.getText();
	 z = zt+".";
	 L1.setText(z);
}
if (e.getSource()==bneg) {
	zt = L1.getText();
	 z = "-"+zt;
	 L1.setText(z);
}
if (e.getSource()==bback) {
	zt = L1.getText();
	try {
		z = zt.substring(0, zt.length()-1);
	}catch(StringIndexOutOfBoundsException f) {
		System.out.println("out of bound");
		return;
		
	}
	L1.setText(z);
	
}

if (e.getSource()==badd) {
	try {
		num1 = Double.parseDouble(L1.getText());
	}catch(NumberFormatException f) {
		L1.setText("invalid Format");
		return;
	}
	z = "";
	L1.setText(z);
	check = 1;
}
if (e.getSource()==bsub) {
	try {
		num1 = Double.parseDouble(L1.getText());
	}catch(NumberFormatException f) {
		L1.setText("Invalid Format");
		return;
			
		}
	z = "";
	L1.setText(z);
	check = 2;
}
if (e.getSource()==bmult) {
	try {
		num1 = Double.parseDouble(L1.getText());
	}catch (NumberFormatException f) {
		L1.setText("Invalid Format");
			return;
	}
	z = "";
	L1.setText(z);
	check = 3;
	
}
	

 
	if (e.getSource()==bmod) {
		try {
			num1 = Double.parseDouble(L1.getText());
		}catch (NumberFormatException f) {
			L1.setText("Invalid Format");
			return;
		}
		z = "";
		L1.setText(z);
		check = 4 ;
	}
	if (e.getSource()==bdiv) {
		try {
			num1 = Double.parseDouble(L1.getText());
		}catch (NumberFormatException f) {
			L1.setText("Invalid Format");
			return;
		}
		z = "";
		L1.setText(z);
		check = 5 ;
		
	}
	
	
	if(e.getSource()==bcalc){          
		  try{
		    num2=Double.parseDouble(L1.getText());
		    }catch(Exception f){
		      L1.setText("ENTER NUMBER FIRST ");
		      return;
		    }
		  if(check==1)
			    x =num1+num2;
			  if(check==2)
			    x =num1-num2;
			  if(check==3)
			    x =num1*num2;
			  if(check==4)
			    x =num1/num2; 
			  if(check==5)
			    x =num1%num2;    
			  L1.setText(String.valueOf(x));
			  

	
	}
	if (e.getSource()==bclr) {
		num1=0;
		num2=0;
		x=0;
		z="";
		check=0;
		L1.setText(z);
	}
	
}
	public static void main(String[] args) {
		new Calc ();

	}

}
	

