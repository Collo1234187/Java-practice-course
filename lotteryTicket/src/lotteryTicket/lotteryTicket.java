package lotteryTicket;

public class lotteryTicket {

	public static void main(String[] args) {
		int  [] [] lotteryticket = {{3, 7, 8},
								   {8, 9, 4},
								   {5, 5, 9}
								   };
		int [] []lotteryticket2=new int [3] [3];
		lotteryticket2 [0] [0]=3;
		lotteryticket2 [0] [1]=7;
		lotteryticket2 [0] [2]=8;
		lotteryticket2 [1] [0]=8;
		lotteryticket2 [1] [1]=9;
		lotteryticket2 [1] [2]=4;
		lotteryticket2 [2] [0]=5;
		lotteryticket2 [2] [1]=5;
		lotteryticket2 [2] [2]=9;
		
		for(int i=0; i<3;i++) {
		for (int r=0; r<3;r++) 
		System.out.println(lotteryticket2 [i] [r]);
		
		}
		
	}	
		
}

	

