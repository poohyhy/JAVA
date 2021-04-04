import java.util.Scanner;

class Player {
	public int select() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3), 종료(4)>>");
		return sc.nextInt();
	}
}

class Computer {
	public int select() {
		return (int)(Math.random()*3+1);
	}
}

class RSPGame {
	String rsp[] = {"가위", "바위", "보"};
	Player p = new Player();
	Computer c = new Computer();
	
	public void Run() {
		int userchoice, computerchoice;
		
		while(true) {
			userchoice = p.select();
			computerchoice = c.select();
			
			if(userchoice == 4)
				break;
			
			System.out.println(rsp[userchoice-1] + " : " + rsp[computerchoice-1]);
			
			switch(userchoice-computerchoice) {
			case 0:
				System.out.println("비겼습니다.");
				break;
			case 2:
			case -1:
				System.out.println("컴퓨터가 이겼습니다.");
				break;
			case -2:
			case 1:
				System.out.println("당신이 이겼습니다.");
				break;
			}
		}
	}
}

public class RockScissorsPaper {
	public static void main(String[] args) {
		RSPGame game = new RSPGame();
		game.Run();
	}
}