import java.io.*;

public class FileCopy2 {
	public static void main(String[] args) {
		BufferedInputStream src=null;
		BufferedOutputStream dst=null;
		File srcFile=new File("/Users/kimyun/Documents/a.jpg");
		File dstFile=new File("/Users/kimyun/Documents/b.jpg");
		try  {
			src=new BufferedInputStream(new FileInputStream(srcFile));
			dst=new BufferedOutputStream(new FileOutputStream(dstFile));
			long tenp=srcFile.length()/10;
			long progress=0;
			byte[] buf=new byte[1024];
			int read=0;
			while (true) {
				read=src.read(buf,0,buf.length);
				if (read==-1) {
					if(progress>0) {
						System.out.print("*");
					}
					break;
				}
				if (read>0) {
					dst.write(buf,0,read);
					progress+=read;
				}
				if (progress>=tenp) {
					System.out.print("*");
					progress=0;
				}
			}
			src.close();
			dst.close();
		} catch(IOException e) {
			System.out.println("입출력 오류 발생");
		}
	}
}
