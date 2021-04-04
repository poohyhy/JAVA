import java.util.StringTokenizer;

public class query {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer(args[0],"&=");
		for(int i=0;i<3;i++) {
			System.out.print(st.nextToken()+"\t");
			System.out.println(st.nextToken());
		}
	}

}
