package deepcloning;

public class Course implements Cloneable {

	public String subject1;
	public String subject2;
	public String subject3;

	public Course(String subject1, String subject2, String subject3) {
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}

}
