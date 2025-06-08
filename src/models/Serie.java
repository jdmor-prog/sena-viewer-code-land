import java.util.ArrayList;

public class Serie extends Film {
    private int id;
    private int timeViewed;
    private int sessionQuantity;
    private ArrayList<Chapter> chapters;

    public Serie(String title, String genre, String creator, int duration, int sessionQuantity) {
        super(title, genre, creator, duration);
        this.sessionQuantity = sessionQuantity;
        this.chapters = new ArrayList<Chapter>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return ":: SERIE ::" +
                "\n Title: " + getTitle() +
                "\n Genre: " + getGenre() +
                "\n Year: " + getYear() +
                "\n Creator: " + getCreator() +
                "\n Duration: " + getDuration() +
                "\n Session: " + getSessionQuantity();
    }
}
