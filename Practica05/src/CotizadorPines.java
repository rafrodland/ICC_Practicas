public class CotizadorPines{
	public static void main (String [] args){

	String cliente1 = "Robbie Valentino";
	double precioCliente1 = 12899;
	int plazoMeses = 21;
	char clasificacionCliente1 = 'E';
	double tasaAnual;
	//12899,21, datos originales para que no se me olvide

	//Esto modifica la tasa dependiendo de la clasificación	
	if(clasificacionCliente1 == 'E'){

		tasaAnual = 0.15;

	}else if(clasificacionCliente1 == 'P'){

		tasaAnual = 0.13;

	}else if(clasificacionCliente1 == 'R'){

		tasaAnual = 0.18;

	}else{

		tasaAnual = 0;
	}

	//Esto verifica si los datos ingresados tienen sentido
	//Y si si ejecuta el programa chido
	if (plazoMeses <= 0){

		System.out.println("=============================================================================================\n");
		System.out.println("Hay un error en la asignación del plazo siendo de " + plazoMeses + " meses, lo cual no le conviene.");
		System.out.println("\n=============================================================================================");

	}else if (precioCliente1 <= 0){

		System.out.println("=======================================================================================================\n");
		System.out.println("Hay un error en la asignación del precio del cliente siendo de " + precioCliente1 + " el precio, lo cual no le conviene.");
		System.out.println("\n=======================================================================================================");

	}else if (tasaAnual == 0){

		System.out.println("=============================================================================================\n");
		System.out.println("Hay un error en la asignación de la clasificación del cliente favor de poner 'E' o 'P' o 'R'");
		System.out.println("\n=============================================================================================");

	}else{

		//Variables para el interes simple
		double plazosCliente1 = ((double)plazoMeses) / 12;
		double interes = (precioCliente1 * tasaAnual * plazosCliente1);
		double total = precioCliente1 + interes;
		double mensualidad = total / plazoMeses;

		//Variables para el interes compuesto
		double deuda = (double)(precioCliente1);
		double tasaMensual = tasaAnual/12;

		//Se hace una tablita con el saldo acumulado
		System.out.println("================================================\n");
		System.out.println(" Tabla con el saldo acumulado\n");

			for(int i = 1; i <= plazoMeses; i++){

				System.out.printf("En el mes %d se tiene un saldo de %.2f %n",i,deuda);

				deuda = (deuda) * (1 + tasaMensual);

			}

		System.out.println("\n Fin de la tabla");	
		System.out.println("\n================================================");

		double interesCompuesto = deuda - precioCliente1;
		double saldoFinal = (precioCliente1) * (Math.pow(1 + tasaMensual, plazoMeses));

		//A tasaAnual lo multiplico por 100 para que se haga entero y ya se imprima bonito
		tasaAnual = tasaAnual * 100;

		//Aqui se imprime el cotizador como tal
		System.out.println(" \n=========================================\n");
		System.out.println("-Cliente: " + cliente1);
		System.out.println("-Clasificacion: " + clasificacionCliente1);
		System.out.printf("-Tasa aplicada: %.0f%% %n", tasaAnual);
		System.out.printf("-Préstamo: $%.2f %n" ,precioCliente1);
		System.out.println("-Meses de pago: " + plazoMeses);
		System.out.printf("-Interes simple: $%1.2f %n", (interes));
		System.out.printf("-Total con interés simple: $%1.2f %n", (total));
		System.out.printf("-Interés compuesto: $%1.2f %n", interesCompuesto);
		System.out.printf("-Total con interés compuesto: $%1.2f %n",saldoFinal);
		System.out.println("\n=========================================");

	}

	}
}