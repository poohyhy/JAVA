import java.util.Scanner;

public class GraphicArray {
    Scanner sc = new Scanner(System.in);
    DObject[] obj = new DObject[100];
    int count = 0;

    void add() {
        System.out.print("도형종류 Line(1), Rect(2), Circle(3)>> ");
        int insertAdd = sc.nextInt();
        if (insertAdd == 1) {
            this.obj[count] = new Line();
            count++;
        }
        else if (insertAdd == 2) {
            this.obj[count] = new Rect();
            count++;
        }
        else if (insertAdd == 3) {
            this.obj[count] = new Circle();
            count++;
        }
    }

    void delete() {
        this.obj[count] = null;
        count--;
    }

    void showAll() {
        for (int i=0;i<count;i++) {
            this.obj[count-1-i].draw();
        }
        System.out.println();
    }

    void run() {
        while (true) {
            System.out.print("Add(1), Delete(2), showAll(3), End(4)>> ");
            int insert = sc.nextInt();
            if (insert == 1) {
                this.add();
            }
            else if (insert == 2) {
                this.delete();
            }
            else if (insert == 3) {
                this.showAll();
            }
            else if (insert == 4) {
                break;
            }
        }
    }
}
