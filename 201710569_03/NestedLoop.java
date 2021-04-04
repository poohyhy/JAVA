
public class NestedLoop {
	public static void main (String[] args) {
		int a,b;
		for (a=1;a<10;a++,System.out.println()) {
			for (b=1;b<10;b++,System.out.print('\t')) {
				System.out.print(a+"*"+b+"="+a*b);
			}
		}
	}

}
