import java.util.Scanner;

public class RockPaperScissors {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      String str[] = {"가위", "바위", "보"};
      
      String player,computer;
      int n; 
      System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
      for(;;) {
    	  
         System.out.print("가위 바위 보! >> ");
         
         player = sc.next();
         
         if (player.equals("그만")) {
        	 System.out.println("게임을 종료합니다..");
        	 break;
         }
         
         n = (int)(Math.random()*3);
         
         computer=str[n];
         
         
         if (player.equals("가위")) {
            if (str[n].equals("가위")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 비겼습니다.");
               continue;
            }
            else if (str[n].equals("바위")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 사용자가 졌습니다.");
               continue;
            }
            else if (str[n].equals("보")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 사용자가 이겼습니다.");
               continue;
            }
         }
         else if (player.equals("바위")) {
            if (str[n].equals("가위")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 사용자가 이겼습니다.");
               continue;
            }
            else if (str[n].equals("바위")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 비겼습니다.");
               continue;
            }
            else if (str[n].equals("보")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 사용자가 졌습니다.");
               continue;
            }
         }
         else if (player.equals("보")) {
            if (str[n].equals("가위")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 사용자가 졌습니다.");
               continue;
            }
            else if (str[n].equals("바위")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 사용자가 이겼습니다.");
               continue;
            }
            else if (str[n].equals("보")) {
               System.out.println("사용자 = "+player+" , 컴퓨터 = "+computer+" 비겼습니다.");
               continue;
            }
         }
         System.out.print("사용자 = "+player+" , 컴퓨터 = "+computer+" ");
      }
   }

}
