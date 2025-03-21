public class ThisFun {
	
	 String food;
	 int amount;
	 
	 public void setFood(String newFood) {
		 this.food = newFood;
	 }
	 
	 public void setData(String food,int amount) {
		 this.food = food;
		 this.amount = amount;
	 }
	

	public static void main(String[] args) {
		
		ThisFun t = new ThisFun();
		t.setData("Pilau",34);
		
		
		
		System.out.println(t.food);
		System.out.println(t.amount);

	}

}
