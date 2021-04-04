import java.io.*;

public class TextCopy {
	public static void main(String[] args) {
		File src=new File("/Volumes/BOOTCAMP/Windows/system.ini");
		File dst=new File("/Users/kimyun/Documents/system.ini");
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader in=null;
		BufferedWriter out=null;
		int c;
		try {
			fr=new FileReader(src);
			fw=new FileWriter(dst);
			in=new BufferedReader(fr);
			out=new BufferedWriter(fw);
			while ((c=in.read())!=-1) {
				out.write((char)c);
			}
			in.close();
			out.close();
			fr.close();
			fw.close();
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
