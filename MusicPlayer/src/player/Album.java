package player;

import java.util.ArrayList;

public class Album {
	private ArrayList<Song> songs;
	private String number;
	
	public Album(String number) {
		this.number = number;
		songs = new ArrayList<Song>();
	}
	
	public void addSong(Song s) {
		songs.add(s);
		s.setIsItInAlbum();
	}
	
	public ArrayList<Song> getSongs(){
		return songs;
	}
	
	public String getNumber() {
		return number;
	}
}
