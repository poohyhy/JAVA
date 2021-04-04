import java.io.*;

public class Append {
	public static void main(String[] args) {
		InputStreamReader in=new InputStreamReader(System.in);
		
		FileWriter fout=null;
		int c;
		try {
			fout=new FileWriter("/Users/kimyun/Documents/test.txt");
			
			in.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
