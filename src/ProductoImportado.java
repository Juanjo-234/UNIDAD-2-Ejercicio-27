public class ProductoImportado extends ItemFacturable{
    double Tasa_Impuesto = 0.30;

    public ProductoImportado(String nombre, double precioBase){
        super(nombre, precioBase);
    }
    public double calcularImpuesto(){
        return precioBase * Tasa_Impuesto;
    }
}
