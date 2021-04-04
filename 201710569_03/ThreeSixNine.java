
public class ThreeSixNine {
	public static void main(String[] args) {
		for (int i=0;i<100;i++) {
			 switch (i%10) {
			 case 3:
				 if (i==33) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 if (i==63) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 if (i==93) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 
				 System.out.println(i+"박수 한 번");
				 break;
			 case 6:
				 if (i==36) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 if (i==66) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 if (i==96) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 System.out.println(i+"박수 한 번");
				 break;
			 case 9:
				 if (i==39) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 if (i==69) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 if (i==99) {
					 System.out.println(i+"박수 두 번");
					 break;
				 }
				 System.out.println(i+"박수 한 번");
				 break;
			 }
			 
		}
	}

}
