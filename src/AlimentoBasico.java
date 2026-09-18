public class AlimentoBasico extends ItemFacturable{
    double Tasa_Impuesto = 0.05;

    public AlimentoBasico(String nombre, double precioBase){
        super(nombre, precioBase);
    }

    public double calcularImpuesto() {
        return precioBase * Tasa_Impuesto;
    }
}
