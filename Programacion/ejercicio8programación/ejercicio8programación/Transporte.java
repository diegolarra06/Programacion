class Transporte {
    private String tipo;

    public Transporte(String tipo) {
        this.tipo = tipo;
    }

    public void imprimirInfo() {
        System.out.println("Tipo de transporte: " + tipo);
    }
}