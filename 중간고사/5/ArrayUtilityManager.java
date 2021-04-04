
public class ArrayUtilityManager {
	
	static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			if (a[i]!=0) {
				System.out.print(a[i]+" ");
			}
			else {
				System.out.print("");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4};
		int [] array2 = {3,4,5,6};
		int [] array3 = ArrayUtility.concat(array1, array2);
		int [] array4 = ArrayUtility.remove(array1, array2);
		
		System.out.print("concat의 결과: ");
		ArrayUtilityManager.print(array3);
		System.out.print("remove의 결과: ");
		ArrayUtilityManager.print(array4);
	}

}
