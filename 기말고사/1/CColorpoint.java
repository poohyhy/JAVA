class CColorPoint extends Cpoint {
    String color;
    public String toString() {
        return "("+this.x+" , "+this.y+")"+" 입니다.";
    }
    public String showString() {
        return "("+this.x+" , "+this.y+")"+this.color;
    }
    public CColorPoint(int x, int y, String color) {
        super(x,y);
        this.x = x;
        this.y = y;
        this.color = color;
    }

}
