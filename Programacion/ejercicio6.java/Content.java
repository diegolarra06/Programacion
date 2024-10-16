public class Content {
    private String title;
    private int type;

    public Content(String title, int type) {
        this.title = title;
        this.type = type;
    }

    public String toString() {
        return "Content{" +
               "title=" + title +
               ", type='" + type + '\'' +
               '}';
    }
}