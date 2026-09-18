public abstract class ItemFacturable {
    String nombre;
    double precioBase;

    public ItemFacturable(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public abstract double calcularImpuesto();

    public double calcularPrecioTotal(){
        return precioBase + calcularImpuesto();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;

    }
}
