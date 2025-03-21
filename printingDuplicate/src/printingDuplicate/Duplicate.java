package printingDuplicate;

public class Duplicate {

	public static void main(String[] args) {
		String sentence ="print all the duplicate characters";
		System.out.println(sentence);
		
		 String duplicates="";
		 String charaters="";
     
		 
		for(int i =0 ;i < sentence.length(); i ++) {
			
		String current = Character.toString(sentence.charAt(i));
		
		if (current.equals(" ")) {
			continue;
		}
		
		if (charaters.contains(current)){
			if(!duplicates.contains(current)) {
			duplicates += current + "," ;
			
			}
			
		}
		
		charaters += current;
		
		}
		System.out.println(duplicates);
	
		
		
		
}
	
}