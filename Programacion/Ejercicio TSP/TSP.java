public class TSP {
    String[] teorias = {
        "Modelo de Lewin",
        "Modelo ADKAR",
        "Modelo de Kotter de 8 pasos",
        "Curva del cambio de Kubler-Ross",
        "Modelo de las 7 S de McKinsey",
        "PHVA",
        "Modelo de transición de Bridges"
    };

    String[] definiciones = {
        "Método de 3 pasos para cambiar el comportamiento que se asemeja al proceso de derretir y volver a formar un cubo de hielo.",
        "Método centrado en las personas para facilitar el cambio a nivel individual.",
        "Proceso que utiliza la experiencia del empleado para reducir la resistencia y aceptar el cambio.",
        "Estrategia que analiza cómo las personas procesan el cambio utilizando las 5 etapas del duelo.",
        "Proceso centrado en la alineación de siete elementos fundamentales de cualquier organización.",
        "Proceso cíclico e iterativo de gestión del cambio centrado en la mejora continua.",
        "Modelo centrado en las personas y en el manejo de su experiencia en la transición al cambio."
    };

    public String toString() {
        String resultado = "";
        for (int i = 0; i < teorias.length; i++) {
            resultado += (i + 1) + ". " + teorias[i] + "\n";
        }
        return resultado;
    }

    public void imprimirDefiniciones() {
        for (int i = 0; i < teorias.length; i++) {
            System.out.println(teorias[i] + ": " + definiciones[i]);
        }
    }
}