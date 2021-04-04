import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            System.out.print("이름을 입력하세요: ");
            al.add(sc.next());
        }
        Iterator<String> it = al.iterator();
        String shortest = al.get(0);
        String str;
        while(it.hasNext()) {
            str = it.next();
            System.out.print(str+" ");
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        System.out.println();
        System.out.println("가장 짧은 이름은: "+shortest+"입니다.");
    }
}
