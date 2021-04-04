
public class Sort {
	public static void main(String[] args) {
		
		int intArray[]=new int[20];
		
		for(int i=0;i<intArray.length;i++) {
			int n=Integer.parseInt(args[i]);
			intArray[i]=n;
		}
		
		int a;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray.length-1;j++) {
				if (intArray[j]<intArray[j+1]) {
					a=intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=a;
				}
			}
		}
		
		System.out.print("정렬결과는 다음과 같습니다.: ");
		
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
	}

}
