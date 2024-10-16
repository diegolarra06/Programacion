
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Level level = new Level(1, "Easy");
        Exercise exercise = new Exercise("", 101);
        Content content = new Content("", 1);
        Category category = new Category("");
    
        // Imprimir las instancias
        System.out.println("Level:");
        System.out.println(level);
        System.out.println();

        System.out.println("Exercise:");
        System.out.println(exercise);
        System.out.println();

        System.out.println("Content:");
        System.out.println(content);
        System.out.println();

        System.out.println("Category:");
        System.out.println(category);
        //Content content = new Content();
        //Category category = new Category();
        //Exercise exercise = new Exercise();   
        

    }
}

