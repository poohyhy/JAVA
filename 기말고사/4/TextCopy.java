import java.io.*;
import java.util.Scanner;

public class TextCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File src = new File(sc.next());
        File dest = new File(sc.next());

        int c;
        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(dest);
            while((c = fr.read()) != -1) {
                fw.write((char)c);
            }
            fr.close();
            fw.write();
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
