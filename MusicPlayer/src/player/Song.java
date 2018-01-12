package player;

public class Song {
	private String title;
	private double duration;
	private boolean isItInAlbum;

	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	public void setIsItInAlbum() {
		isItInAlbum = true;
	}

	public boolean getIsItInAlbum() {
		return isItInAlbum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

}
