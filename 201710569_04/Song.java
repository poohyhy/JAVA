
public class Song {
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	public Song() {
		
	}
	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		this.track=track;
	
	}
	public void show() {
		System.out.println("곡명: \t\t"+this.title);
		System.out.println("가수명: \t\t"+this.artist);
		System.out.println("앨범명: \t\t"+this.album);
		System.out.print("작곡가명: ");
		for(int i=0;i<composer.length;i++) {
			System.out.println("\t\t"+this.composer[i]);
		}
		System.out.println("발매년도: \t\t"+this.year);
		System.out.println("수록 트랙 번호: \t"+this.track);
		
	}
	
}
