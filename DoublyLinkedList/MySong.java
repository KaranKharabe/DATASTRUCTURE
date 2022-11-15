package datastructure.arrays.java;

public class MySong {

	String title;
	String album;
	String artist;
	int year;
	
	MySong next;
	MySong prev;
	public MySong(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MySong [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	
	
	
}
