package media;

public class MyFavorites {

    public void ratingMessage(Audio title) {
        if (title.getRating() >= 9) {
            System.out.println(title.getTitle() + " is the heat!");
        } else {
            System.out.println(title.getTitle() + " is a good one!");
        }
    }
}
