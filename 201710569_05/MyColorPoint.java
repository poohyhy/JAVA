abstract class MyPoint {
	int x;
	int y;
	public MyPoint(int x, int y) {
	    this.x = x; 
	    this.y = y;
	}
	protected abstract void move(int x, int y);
	protected abstract void reverse();
	protected void show() {
		System.out.print("("+x+","+y+")");	
	}
}

public class MyColorPoint extends MyPoint {
	String color;
	
	public MyColorPoint(int x, int y, String color) {
		super(x,y);
		super.x = x;
		super.y = y;
		this.color=color;
	}
	protected void move(int x, int y)	 {
		super.x=x;
		super.y=y;
	}
	protected void reverse() {
		int temp;
		temp=super.x;
		super.x=super.y;
		super.y=temp;
	}
	protected void show() {
		System.out.println(x+","+y+","+color);
	}
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2,3,"blue");
		p.move(3,4);
		p.reverse();
		p.show();
	}


}
