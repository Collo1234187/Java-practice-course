package quizProgram;

import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		String [] responses= {"","",""};
		String[] answers={"d","c","d"};
		System.out.println("which one of the following is not part of a computer?");
		System.out.println("a) CPU");
		System.out.println("b) monitor ");
		System.out.println("c) mouse");
		System.out.println("d) ring");

		System.out.println("how many cpu does a computer contain?");
		System.out.println("a) 3");
		System.out.println("b) 4");
		System.out.println("c) 1");
		System.out.println("d) 5");

		System.out.println("which one of the following is the capaital city of kenya?");
		System.out.println("a) kampala");
		System.out.println("b) mombasa");
		System.out.println("c) nakuru");
		System.out.println("d) nairobi");
		

      responses [0]=scan.next();
      responses [1]=scan.next();
      responses [2]=scan.next();
    
      int score=0;
      
      for (int i =0;i <3; i++) {
    	  if(responses [i].equalsIgnoreCase(answers[i])) {
    	  score++;
      }
      }
    	  System.out.println("score: "+score+"/3");
      
	}
	
	
	
	}


