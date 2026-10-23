public class PrecisionPi{
	public static void main (String [] args){

		double tolerancia = 0.001;
		double pi = 0;
		int dardosLanzados = 0;
		int dentro = 0;
		double error = Math.abs(Math.PI - pi);

		while(error >= tolerancia){

			//Se generar valores aleatorios para x y y
			double ejeX = Math.random();
			double ejeY = Math.random();
			dardosLanzados++;

			//Se verifica si el dardo cayo dentro
			if(Math.pow(ejeX,2) + Math.pow(ejeY,2) <= 1){

				dentro++;
				
			}else{}

			// Se actualizan los valores
			pi = 4 * ((double)dentro/dardosLanzados);
			error = Math.abs(Math.PI - pi);

		}

		System.out.println("==============================================\n");
		System.out.printf("Se tiene una tolerancia de %.3f %nSe necesitaron lanzar %d dardos%nY se llego a un estimación de pi de %.6f %n", tolerancia, dardosLanzados, pi);
		System.out.println("\n==============================================");
	}
}