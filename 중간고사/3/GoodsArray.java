import java.util.Scanner;

public class GoodsArray {
	
	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		Goods[] Gd= new Goods[3];
		
		System.out.println("상품 세 개를 차례로 입력하라.");
		
		for (int i=0;i<Gd.length;i++) {
			Gd[i]=new Goods(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			
		}
		
		System.out.println("입력된 상품 정보는 다음과 같습니다.");
		
		for (int i=0;i<Gd.length;i++) {
			System.out.print(Gd[i].getName()+"\t");
			System.out.print(Gd[i].getPrice()+"\t");
			System.out.print(Gd[i].getNumberOfStock()+"\t");
			System.out.println(Gd[i].getSold()+"\t");
			
		}
	}
}
