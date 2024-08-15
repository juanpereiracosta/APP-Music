package Main;

import media.Music;
import media.MyFavorites;
import media.Podcast;

public class Main {

    public static void main(String[] args) {

        Music music1 = new Music();
        music1.setTitle("Life on Mars");
        music1.setArtist("David Bowie");
        music1.setGenre("Glam Rock");
        music1.setAlbum("Hunky Dory");
        music1.ShowDetailsMusic();

        for (int i = 0; i < 1000; i++) {
            music1.play();
        }

        for (int i = 0; i < 50; i++) {
            music1.like();
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitle("Punk Cinema");
        podcast1.setHost("Spike Lee");
        podcast1.setDescription("Let's talk about a revolution on the screen");
        podcast1.showDetailsPodcast();

        for (int i = 0; i < 5000; i++) {
            podcast1.play();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.like();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.ratingMessage(music1);
        favorites.ratingMessage(podcast1);
    }
}
