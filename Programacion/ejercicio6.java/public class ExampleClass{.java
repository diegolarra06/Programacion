public class ExampleClass{
    private T name;
    public T get name(){
        return this.name;

    }
    public void setName(T name) {
     this.name;
}
}
Level level = new Level(1, "Facil");
        System.out.println(level); 
        Exercise exercise = new Exercise("Exercise 10", "Dame patatas");
        System.out.println("Exercise");
        System.out.println("El nivel 'Facil' es incorrecto. Debe ser 'Fácil'.");
        Level level1 = new Level(1, "Fácil");
        Level nivelDificil = new Level(2, "Difícil");
        System.out.println("\nEjercicio actualizado:");
        System.out.println( exercise.toString() + " Nivel: " + nivelDificil.toString());