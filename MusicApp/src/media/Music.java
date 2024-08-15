package media;

public class Music extends Audio {

    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void ShowDetailsMusic() {
        System.out.println("Title: " + getTitle());
        System.out.println("Artist: " + artist);
        System.out.println("Album: " + album);
        System.out.println("Genre: " + genre);
        System.out.println("*******************");
    }

    @Override
    public int getRating() {
        if (getTotalPlays() > 1000) {
            return 10;
        } else {
            return 7;
        }
    }
}
