public class ProgramaNuevo{	
	public static void main(String[] args) {
	
	//Se define una variable de texto usando String.
	String producto = "Laptop para la carrera";

	//Se define una variable de tipo entero usando int.
	int precio = 15000;

	//Se define una variable de tipo entero usando int.
	int descuento = 3000;

	//Se define una variabel de tipo decimal usando double.
	double meses = 18.0;

	//Se pide que se imprima un texto usando doble comilla.
	System.out.println("=== Ficha de compra ===");

	/*Se pide que se imprima un texto junto con la variable producto,
	 luego otro texto con la resta de las variables precio y descuento, 
	 texto junto con una division que ocupa la variable meses, 
	 un ultimo texto y muesra el resultado de la resta de precio y descuento entre meses */
	System.out.printf("- Producto : %s %n- Precio con descuento :%d %n- Plazo de pago en anios :%.1f %n- Pago mensual : %.2f %n", producto, (precio - descuento), (meses / 12.0), ((precio - descuento) / meses));

	//Se pide que se imprima un texto para que se vea bonito.
	System.out.println("=== Fin de la ficha ===");

	}
}