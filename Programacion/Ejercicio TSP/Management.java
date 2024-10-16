public class Management {
    public static void main(String[] args) {
        TSP tsp = new TSP();
        Nombre nombre = new Nombre();

        System.out.println("Teorías de Gestión del Cambio:");
        System.out.println(tsp);

        System.out.println("\nAutores de las Teorías:");
        System.out.println(nombre);

        System.out.println("\nDefiniciones de las Teorías:");
        tsp.imprimirDefiniciones();
    }
}