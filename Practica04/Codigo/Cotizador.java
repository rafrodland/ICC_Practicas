public class Cotizador{
	public static void main (String [] args){

	//Las 5 lineas de codigo de abajo son para guardar los datos captados.
	int precioCliente1 = 12899;

	String cliente1 = "Robbie Valentino";

	char clasificacionCliente1 = 'E';

	double tasaAnual = 0.15;

	int plazoMeses = 21;

	//Aqui hago los meses los convierto a años y los guardo en una variable.
	double plazosCliente1 = ((double)plazoMeses) / 12;

	//Aqui saco el interes y lo guardo realizando la multiplicacion de las variables correspondientes.
	double interes = (precioCliente1 * tasaAnual * plazosCliente1);

	//Aqui saco el total y lo guardo sumando las variables correspondientes
	double total = precioCliente1 + interes;

	//Aqui saco la mensualidad y la guardo diviviendo las las variables correspondientes.
	double mensualidad = total / plazoMeses;

	//Esta linea solo es para que se vea bonito.
	System.out.println("=========Cotizador=========\n");

	//Estas dos lineas de abajo las agarre del cotizador del ayudante.
	System.out.println("-Cliente: " + cliente1);
	System.out.println("-Clasificacion: " + clasificacionCliente1);

	/*En las 3 lineas de abajo basicamente pongo lo que el cliente pide
	imprimiendo un texto que indica que se va mostrar, osea el interes, el total y la mensualidad
	y seguido de eso uso la variable correspondiente para mostrar el valor de cada cosa, y use
	printf para poder especificar cuantos numeros aparecian despues del punto en los decimales*/
	System.out.printf("-Cobro de intereses: $%1.2f %n", (interes));
	System.out.printf("-Pago total de: $%1.2f %n", (total));
	System.out.printf("-Con una mensualidad de: $%1.2f %n %n", (mensualidad));

	//Esta linea tambien es para que se vea bonito.
	System.out.println("=======Fin cotizador=======");

	}
}