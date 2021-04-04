
public class ArrayUtility2Manager {
	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9 };
		int [] array2 = {3, 6, -1, 100, 7 };
		int [] array3 = ArrayUtility2.concat(array1, array2);
		ArrayUtility2.print(array3);
	}
}
