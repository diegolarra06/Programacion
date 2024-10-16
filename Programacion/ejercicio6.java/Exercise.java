public class Exercise {
    private int Id_Exercise;
    private String Type;
    public Exercise(String Type, int Id_Exercise) {
        this.Id_Exercise = Id_Exercise;
        this.Type = Type;
    }

    public String toString() {
        return "Content{" +
               "Id_Exercise=" + Id_Exercise +
               ", Type='" + Type + '\'' +
               '}';
    }
}
