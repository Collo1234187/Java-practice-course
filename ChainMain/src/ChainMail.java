class Student {
	String name;
	int age;
	
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public Student setAge(int age) {
		this.age = age;
		return this;
	}
}




public class ChainMail {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.setName("Collinstone").setAge(22);

		System.out.println(s.name);
		System.out.println(s.age);
	}

}
