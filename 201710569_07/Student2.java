
public class Student2 {
	String name;
	String major;
	String id;
	double score;
	public Student2(String name, String major, String id, double score) {
		this.name=name;
		this.major=major;
		this.id=id;
		this.score=score;
	}
	public String getInfo() {
		return "이름:"+name+" 학과: "+major+" 학번: "+id+" 학점평균: "+score;
	}
}
