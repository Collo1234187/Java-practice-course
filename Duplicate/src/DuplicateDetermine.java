import javax.xml.stream.events.Characters;

public class DuplicateDetermine {

	public static void main(String[] args) {
		String sentence = "tt j ii";
	
		String character = "";
		String duplicate = "";
for(int i = 0;i < sentence.length();i++) {
	String current = Character.toString(sentence.charAt(i));
	
	
	
	if(character.contains(current)) {
	if(!duplicate.contains(current)) {
	
	
	duplicate += current + ",";
	}
	}
character += current;
}
System.out.println(duplicate);


	}
}