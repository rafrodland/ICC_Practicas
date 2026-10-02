public class Programa{	
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

	//Se pide que se imprima un texto mas la variable que se habia guardado.
	System.out.println("- Producto : " + producto);	

	//Se pide que se imprma un texto y aparte muestre la resta de la variable precio menos descuento..
	System.out.println("- Precio con descuento : " + (precio - descuento));

	//Se pide que se imprima un texto y aparte muestre la division de la variable meses entre el numero 12.
	System.out.println("- Plazo de pago en anios : " + (meses / 12.0));

	//Se pide que se imprima un texto y aparte la resta entre las variables precio y descuento entre la variable meses.
	System.out.println("- Pago mensual : " + ((precio - descuento) / meses));

	//Se pide que se imprima un texto para que se vea bonito.
	System.out.println("=== Fin de la ficha ===");

	}
}