class Pedido {
    private String fechaEntrega;
    private Transporte transporte;

    public Pedido(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public void imprimirInfo() {
        System.out.println("Fecha de entrega: " + fechaEntrega);
    
    
    }
}