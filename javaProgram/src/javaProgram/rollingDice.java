package javaProgram;

import java.util.Random;

public class rollingDice {

	public static void main(String[] args) {
		Random number=new Random();
		int r=number.nextInt(100) + 4;
		System.out.println("you got:" +r); 

	}

}
