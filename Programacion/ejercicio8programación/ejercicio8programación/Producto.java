class Producto {
    private String nombre;
    private int precio;
    private Pedido pedido;

    public Producto(String nombre, Pedido precio) {
        this.nombre = nombre;
        this.pedido = precio;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void imprimirInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}