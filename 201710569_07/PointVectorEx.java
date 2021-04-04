import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v=new Vector<Point>();
		Point a=new Point(2,3);
		Point b=new Point(-5,20);
		Point c=new Point(30,-8);
		v.add(a);
		v.add(b);
		v.add(c);
		for(int i=0;i<v.size();i++) {
			String str=v.get(i).toString();
			System.out.println(str);
		}
	}

}
