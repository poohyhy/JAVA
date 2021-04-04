public class Cpoint {
    int x, y;
    public String toString() {
        return "("+this.x+" , "+this.y+")"+" 입니다.";
    }
    public String showString() {
        return "("+this.x+" , "+this.y+")";
    }
    void show() {
        System.out.println(showString());
    }
    public Cpoint(int x, int y) {
        this.x=x;
        this.y=y;
    }
}
