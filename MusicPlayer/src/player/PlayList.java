package player;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList {
	private static LinkedList<Song> songs;
	private static Scanner scanner;
	static {
		songs = new LinkedList<Song>();
		scanner = new Scanner(System.in);
	}

	public static void main(String[] args) {
		Song song1 = new Song("Let it be", 5.51);
		Song song2 = new Song("Dont cry", 6.32);
		Song song3 = new Song("Welcome to the jungle", 7.20);
		
		Album album1 = new Album("0001");
		
		album1.addSong(song1);
		album1.addSong(song2);
		album1.addSong(song3);
		
		Song[] songList = { song1, song2, song3 };
		
		addToPlaylist(songList);
		choice();

	}

	public static void choice() {
		ListIterator<Song> iterator = songs.listIterator();
		boolean goForward = true;
		boolean quit = false;
		while (!quit) {
			printMenu();
			int action = scanner.nextInt();
			switch (action) {
			case 1: {
				quit = true;
			}
				break;
			case 2: {
				if (!goForward) {
					if (iterator.hasNext()) {
						Song s = iterator.next();
						System.out.printf("Song playing:%s%n", s.getTitle());
						goForward = true;
					}
				}
				if (iterator.hasNext()) {
					Song s = iterator.next();
					System.out.printf("Song playing:%s%n", s.getTitle());
					goForward = true;
				} else {
					System.out.println("We are at the end of the playlist.No more songs");
					goForward = false;
				}

			}
				break;
			case 3: {
				if (goForward) {
					if (iterator.hasPrevious()) {
						Song s = iterator.previous();
						System.out.printf("Song playing:%s%n", s.getTitle());
						goForward = false;
					}
				}
				if (iterator.hasPrevious()) {
					Song s = iterator.previous();
					System.out.printf("Song playing:%s%n", s.getTitle());
					goForward = false;
				} else {
					System.out.println("We are at the start of the playlist.Cant skip backwards");
					goForward = true;
				}
			}
				break;
			case 4: {
				if (goForward) {
					if (iterator.hasPrevious()) {
						Song s = iterator.previous();
						System.out.printf("Song started again:%s%n", s.getTitle());
						goForward = false;
					} else {
						System.out.println("We are at the start of the list! No song is started.");
					}

				} else {
					if (iterator.hasNext()) {
						Song s = iterator.next();
						System.out.printf("Song started again:%s%n", s.getTitle());
						goForward = true;
					} else {
						System.out.println("We reached the end of the list");
					}
				}
			}
				break;
			case 5: {
				ListIterator<Song> stringIterator = songs.listIterator();
				while (stringIterator.hasNext()) {
					Song s = stringIterator.next();
					System.out.printf("Song title: %s, duration:%.2f%n", s.getTitle(), s.getDuration());
				}
			}
				break;
			}
		}

	}

	public static void addToPlaylist(Song[] songList) {
		for (Song s : songList) {
			if (s.getIsItInAlbum()) {
				songs.add(s);
			} else {
				System.out.println("The song doesn't have album.");
			}
		}
	}

	private static void printMenu() {
		System.out.println("Choose action:");
		System.out.printf(
				"1.Quit%n2.Skip forward to the next song%n3.Skip backwards to previous song%n4.Replay the current song%n5.List the songs");
	}
}
