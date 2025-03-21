
public class ToStringMethod {

	String student;
	int grade;
	
	ToStringMethod(String student,int grade) {
		this.student = student;
		this.grade = grade;
	}
	public String toString() {
		return student +" "+ grade;
	}
}
