import java.util.Scanner;

public class Gambling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("플레이어 A의 이름을 입력하세요: ");
        Person A = new Person(sc.next());
        System.out.print("플레이어 B의 이름을 입력하세요: ");
        Person B = new Person(sc.next());
        System.out.print("플레이어 C의 이름을 입력하세요: ");
        Person C = new Person(sc.next());
        System.out.print("플레이어 D의 이름을 입력하세요: ");
        Person D = new Person(sc.next());

        System.out.println();

        String enter;
        String user = A.name;
        int out1, out2;
        int count = 0;

        while(true) {
            enter=sc.nextLine();
            count++;
            out1 = (int)(Math.round(Math.random()*2));
            out2 = (int)(Math.round(Math.random()*2));

            if (count%4 == 1) {
                user = A.name;
            }
            else if (count%4 == 2) {
                user = B.name;
            }
            else if (count%4 == 3) {
                user = C.name;
            }
            else if (count%4 == 0) {
                user = D.name;
            }

            System.out.println(user+":");
            System.out.println("난수 발생 결과: "+out1+", "+out2);

            if (out1 == out2) {
                System.out.println(user+" 승리");
                System.out.println("게임 끝");
                break;
            }
        }
    }
}
