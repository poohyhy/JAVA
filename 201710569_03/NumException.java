
public class NumException {
	public static void main(String[] args) {
		String stringNum[] = {"23","12","998","3.141592"};
		try {
			for (int i=0;i<stringNum.length;i++) {
				int j=Integer.parseInt(stringNum[i]);
				System.out.println("수로 변환된 값은 "+j);
			}
		}
		catch (NumberFormatException e) {
			System.out.println("정수로 변환할 수 없습니다.");
		}
	}

}
