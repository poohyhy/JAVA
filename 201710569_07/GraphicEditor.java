
abstract class GraphicObject  {
	int x,y,w,h;
	GraphicObject(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	public abstract void view();
}

class Rect extends GraphicObject {
	
}

class Line extends GraphicObject {
	
}

public class GraphicEditor {
	
	void add() {
		
	}
	
	void draw() {
		
	}
	
	public static void main(String[] args) {
		GraphicEditor g = new GraphicEditor();
		g.add(new Rect(2,2,3,4));
		g.add(new Line(3,3,8,8));
		g.add(new Line(2,5,6,6));
		g.draw();
	}

}
