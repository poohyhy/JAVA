
public class ColorPoint extends Point{
	String color;
	void setColor(String color) {
		this.color=color;
	}
	void showColorPoint() {
		System.out.println(color+"("+x+","+y+")");
	}
	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint();
		cp.set(3,4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}