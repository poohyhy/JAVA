
public class Rect {
	int width;
	int height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public boolean equals(Rect obj) {
		if  ((this.width*this.height)==(obj.width*obj.height)) {
			return true;
		}
		else  {
			return false;
		}
	}

}
