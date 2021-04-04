import java.util.Scanner;

public class GoodsArray {
	
	public static void main(String[] args) {
		class Goods {
			private String name;
			private int price;
			private int numberOfStock;
			private int sold;

			Goods(String n, int p, int nStock, int s) {
				name = n;
				price = p;
				numberOfStock = nStock;
				sold = s;
			}

			String getName() {return name;} 
			int getPrice() {return price;}
			int getNumberOfStock() {return numberOfStock;}
			int getSold() {return sold;}
		}

		Scanner sc= new Scanner(System.in);
		
		Goods[] Gd;
		Gd = new Goods[3];
		for (int i=0;i<Gd.length;i++) {
			Gd[i]=new Goods(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			
		}
		for (int i=0;i<Gd.length;i++) {
			System.out.print(Gd[i].getName()+"\t");
			System.out.print(Gd[i].getPrice()+"\t");
			System.out.print(Gd[i].getNumberOfStock()+"\t");
			System.out.println(Gd[i].getSold()+"\t");
			
		}
	}



}
