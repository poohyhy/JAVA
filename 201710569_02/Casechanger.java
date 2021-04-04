import java.io.*;

public class Casechanger {
	public static void main(String args[]) {
		InputStreamReader rd = new InputStreamReader(System.in);
		System.out.println("영문자를 입력하시오.");
		try {
			while (true) {
				int a = rd.read();
				
				if (a == -1)
					break;
				
				else if (a=='\n' || a=='\r')
					continue;
				
				else if (a>='a' && a<='z') {
					a = a - ('a' - 'A');
				}
				
				else if (a>='A' && a<='Z') {
					a = a + ('a' - 'A');
				}
				
				else {
					System.out.println("영문자가 아닙니다.");
					continue;
				}
						
				System.out.println((char)a);
			}
		}
		catch (IOException e) {
			System.out.println("입력 에러 발생");
		}
		
	}

}
