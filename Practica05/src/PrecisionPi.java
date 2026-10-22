public class PrecisionPi{
	public static void main (String [] args){

		double tolerancia = 0.001;
		double pi = 0;
		int lanzados = 0;
		int dentro = 0;
		double error = Math.abs(Math.PI - pi);

		while(error >= tolerancia){

			double ejeX = Math.random();
			double ejeY = Math.random();
			lanzados++;

			if(Math.pow(ejeX,2) + Math.pow(ejeY,2) <= 1){

				dentro++;
				
			}else{}

			pi = 4 * ((double)dentro/lanzados);
			error = Math.abs(Math.PI - pi);

		}

		System.out.println("==============================================\n");
		System.out.printf("Se tiene una tolerancia de %.3f %nSe necesitaron lanzar %d dardos%nY se llego a un estimación de pi de %.6f %n", tolerancia, lanzados, pi);
		System.out.println("\n==============================================");
	}
}