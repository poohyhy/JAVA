import java.io.*;

public class FileCopy2 {
	public static void main(String[] args) {
		BufferedInputStream src=null;
		BufferedOutputStream dst=null;
		File srcFile=new File("/Users/kimyun/Documents/a.jpg");
		File dstFile=new File("/Users/kimyun/Documents/b.jpg");
		int c;
		try  {
			src=new BufferedInputStream(new FileInputStream(srcFile));
			dst=new BufferedOutputStream(new FileOutputStream(dstFile));
			dst.write(c);
			src.close();
			dst.close();
		} catch(IOException e) {
			System.out.println("입출력 오류 발생");
		}
	}
}
