
public class Student extends Person{
	void set() {
		this.age=23;
		this.name="김민상";
		this.height=175;
		get(80);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.set();
	}

}
