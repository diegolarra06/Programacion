public class Level {
    private int Id;
    private String type;

    public Level(int Id_level, String Easy) {
        this.Id = 0;
        this.type = type;
    }

    public String toString() {
        String result= "Mi nombre del nivel "+this.type;
        return result;
    }
    public String gettype(){
        return this.type;
   //un get tiene el mismo tipo de aqui a alli.
    
   
    }
}