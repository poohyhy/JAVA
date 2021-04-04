
public class MainParameter {
	public static void main(String[] args) {
		double sum=0;
		for (int i=0;i<args.length;i++) {
			sum+=Double.parseDouble(args[i]);
		}
		System.out.println("합계는 : "+sum);
		System.out.println("평균은 : "+sum/args.length);
	}

}
