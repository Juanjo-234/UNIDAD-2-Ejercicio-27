public class ServicioProfesional extends ItemFacturable{
    double Tasa_impuesto = 0.21;

    public ServicioProfesional(String nombre, double precioBase){
        super(nombre, precioBase);
    }


    public double calcularImpuesto() {
        return precioBase * Tasa_impuesto;
    }
}
