//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ItemFacturable item1 = new ProductoImportado("Laptop HP", 1000);
    ItemFacturable item2 = new ServicioProfesional("Asesoria contable mensual", 1500);
    ItemFacturable item3 = new AlimentoBasico("Pack de leche x10", 2500);

    ItemFacturable[] items = {item1, item2, item3};

    double TotalGeneral = 0;

    System.out.println("===REPORTE DE FACTURACIÓN===");
    for (ItemFacturable item : items) {
        double impuesto = item.calcularImpuesto();
        double totalItem = item.calcularPrecioTotal();
        TotalGeneral += totalItem;

        System.out.println("Ítem: " + item.getNombre());
        System.out.println(" - Precio Base: $" + item.getPrecioBase());
        System.out.println(" - Impuesto:    $" + impuesto);
        System.out.println(" - Total:       $" + totalItem);
        System.out.println("-----------------------------------");
    }
    System.out.println("TOTAL GENERAL DE LA FACTURA: $" +TotalGeneral);
}

