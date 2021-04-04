import java.util.Scanner;

abstract class DObject {
	public DObject next;
	public DObject() { next = null;}
	public void setNext(DObject obj) {next=obj;}
	public DObject getNext() {return next;}
	public abstract void draw();
}

class Line extends DObject {
	public void draw() {
		 System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() {
		 System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() {
		 System.out.println("Circle");
	}
}

public class graphicEditor {
	Scanner sc=new Scanner(System.in);
	DObject start=null, last=null, obj;
	int count=0;
	
	void insert() {
		System.out.print("도형종류 Line(1), Rect(2), Circle(3)>>");
		int num1=sc.nextInt();
		switch (num1) {
		case 1:
			obj=new Line();
			break;
		case 2:
			obj=new Rect();
			break;
		case 3:
			obj=new Circle();
			break;
		}
		if(start == null) {
			start = obj;
			last = obj;
			
		}
		else {
			last.setNext(obj);
			last = obj;
			
		}
		count++;

	}
	void delete() {
		DObject current = start;
		DObject previous = null;
		DObject temp = null;
		System.out.print("삭제할 도형의 위치>>");
		int num = sc.nextInt();
		
		for(int i=0; i<(num-1); i++) {
			previous = current;
			current = current.getNext();
		}
		for(int i=0; i<(count-num); i++) {
			previous.setNext(current.getNext());
			previous = current;
			current = current.getNext();
		}
		
		last = null;


	}
	void show() {
		DObject p=start;
		while (p != null) {
			p.draw();
			p=p.getNext();
		}
	}
	void run() {
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int select = sc.nextInt();
			switch(select) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				show();
				break;
			case 4: 
				System.out.println("종료합니다.");
				return;
			}
		}

	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		graphicEditor k= new graphicEditor();
		k.run();
	}

}
