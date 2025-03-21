
public class GetterAndSetters {

	String name;
	int age;
	
	public static void main(String[] args) {
		GetterAndSetters g = new GetterAndSetters();
		g.setName("collinstone");
		g.setAge(22);
		
		System.out.println(g.getName());
		System.out.println(g.getAge());
 g.giveDetails();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void giveDetails() {
		System.out.println(getAge() +" , "+ getName());
	}
	
	}


