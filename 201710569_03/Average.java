
public class Average {
	public static void main(String[] args) {
		double sum=0;
		for (int i=0;i<args.length;i++) {
			int n = Integer.parseInt(args[i]);
			sum+=n;
		}
		System.out.println(sum/args.length);
	}

}
