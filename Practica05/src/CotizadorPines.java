public class CotizadorPines{
	public static void main (String [] args){

	String cliente1 = "Robbie Valentino";
	int precioCliente1 = 12899;
	int plazoMeses = 21;
	char clasificacionCliente1 = 'R';
	double tasaAnual;
	//12899,21
	
	if(clasificacionCliente1 == 'E'){

		tasaAnual = 0.15;

	}else if(clasificacionCliente1 == 'P'){

		tasaAnual = 0.13;

	}else if(clasificacionCliente1 == 'R'){

		tasaAnual = 0.18;

	}else{

		tasaAnual = 0;
	}

	double plazosCliente1 = ((double)plazoMeses) / 12;
	double interes = (precioCliente1 * tasaAnual * plazosCliente1);
	double total = precioCliente1 + interes;
	double mensualidad = total / plazoMeses;

	if (plazoMeses <= 0){

		System.out.println("=============================================================================================\n");
		System.out.println("Hay un error en la asignación del plazo siendo de " + plazoMeses + " meses, lo cual no le conviene.");
		System.out.println("\n=============================================================================================");

	}else if (precioCliente1 <= 0){

		System.out.println("=======================================================================================================\n");
		System.out.println("Hay un error en la asignación del precio del cliendo siendo de " + precioCliente1 + " el precio, lo cual no le conviene.");
		System.out.println("\n=======================================================================================================");

	}else if (tasaAnual == 0){

		System.out.println("=============================================================================================\n");
		System.out.println("Hay un error en la asignación de la clasificación del cliente favor de poner 'E' o 'P' o 'R'");
		System.out.println("\n=============================================================================================");

	}else{

		System.out.println("====================================\n");
		System.out.println("-Cliente: " + cliente1);
		System.out.println("-Clasificacion: " + clasificacionCliente1);
		System.out.printf("-Cobro de intereses: $%1.2f %n", (interes));
		System.out.printf("-Pago total de: $%1.2f %n", (total));
		System.out.printf("-Con una mensualidad de: $%1.2f %n %n", (mensualidad));
		System.out.println("====================================");

	}

	}
}