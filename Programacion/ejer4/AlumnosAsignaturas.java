public class AlumnosAsignaturas {
    public static void main(String[] args) {
        // Definir los datos de los alumnos
        String[][] alumnos = {
            {"Juan", "Martín", "5"},
            {"Samuel", "María", "4"},
            {"Carlos", "Trujillano", "3"},
            {"Ana", "Pérez", "2"},
            {"Diego", "Larrazabal", "1"}
        };

        // Imprimir la información de los alumnos
        System.out.println("Información de los alumnos:");
        System.out.println("---------------------------");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nombre: " + alumnos[i][0]);
            System.out.println("Apellido: " + alumnos[i][1]);
            System.out.println("Número de asignaturas cursadas: " + alumnos[i][2]);
            System.out.println("---------------------------");
        }
    }
}