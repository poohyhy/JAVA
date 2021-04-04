import java.util.Scanner;

public class DicManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word;
		for(;;) {
			System.out.print("한글 단어? ");
			word = sc.next();
			
			if (word.equals("그만")) {
				break;
			}
			
			String result = Dictionary.kor2Eng(word);
			
			if(result==(null))
				System.out.println(word+"은(는) 저의 사전에 없습니다.");
			
			else
				System.out.println(word+"은(는) "+result);


		}
		
	}

}
