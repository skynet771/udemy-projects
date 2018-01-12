package player;

public class PlaySongs {
	public static void main(String[] args) {
		Song song1 = new Song("Let it be", 5.51);
		Song song2 = new Song("Dont cry", 6.32);
		Song song3 = new Song("Welcome to the jungle", 7.20);
		
		Album album1 = new Album("0001");
		
		album1.addSong(song1);
		album1.addSong(song2);
		album1.addSong(song3);
		
		Song[] songList = { song1, song2, song3 };
		
		PlayList.addToPlaylist(songList);
		PlayList.choice();

	}
}
