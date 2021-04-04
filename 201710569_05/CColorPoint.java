class Cpoint {
	public int x;
	public int y;
	public String color;
	public void show() {
		System.out.println("("+x+","+y+")"+color);
	}
	public Cpoint(int a, int b) {
		this.x=a;
		this.y=b;
	}
}

public class CColorPoint extends Cpoint {
	
	public CColorPoint(int a, int b, String color) {
		super(a,b);
		super.x=a;
		super.y=b;
		super.color=color;
	}
	
	
	public static void main(String[] args) {
		Cpoint a,b;
		a=new Cpoint(2,3);
		b=new CColorPoint(3,4,"red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
	}

}
