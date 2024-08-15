package media;

public class Podcast extends Audio{

    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void showDetailsPodcast() {
        System.out.println("Title: " + getTitle());
        System.out.println("Host: " + host);
        System.out.println("Description: " + description);
        System.out.println("*******************");
    }

    @Override
    public int getRating() {
        if (getTotalLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
