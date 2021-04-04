
public class ArrayUtility {
	
	static int [] concat(int[] s1, int[] s2) {
		int [] array = new int[(s1.length+s2.length)];
		for(int i=0; i<s1.length; i++) {
			array[i] = s1[i];
		}
		for(int i=0; i<s2.length; i++) {
			array[s1.length+i] = s2[i];
		}
		return array;
	}
	
	static int [] remove(int[] s1, int[] s2) {
		int [] array = new int[s1.length];
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if (s1[i]==s2[j])	{
					break;
				}
				if (j==s2.length-1) {
					array[i]=s1[i];
					break;
				}
			}
		}
		return array;
	}

}
