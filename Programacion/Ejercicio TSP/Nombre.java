public class Nombre {
    String[] nombres = {
        "Kurt Lewin",
        "Prosci",
        "John Kotter",
        "Elisabeth Kubler-Ross",
        "McKinsey & Company",
        "Edward Deming",
        "William Bridges"
    };

    public String toString() {
        String resultado = "";
        for (int i = 0; i < nombres.length; i++) {
            resultado += "Teoría " + (i + 1) + " - Autor/Origen: " + nombres[i] + "\n";
        }
        return resultado;
    }
}
