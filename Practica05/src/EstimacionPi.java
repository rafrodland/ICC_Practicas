public class EstimacionPi{
	public static void main (String[] args){

		int dardos = 1000000;
		int lanzados = 0;
		int dentro = 0;

		while (lanzados < dardos){

			double ejeX = Math.random();
			double ejeY = Math.random();

			if(Math.pow(ejeX,2) + Math.pow(ejeY,2) <= 1){

				dentro++;
				
			}else{}

			lanzados++;

		}

		double pi = 4 * ((double)dentro / dardos);

		System.out.println("=================================================\n");
		System.out.printf("Se lanzaron %d dardos a un circulo %nDentro del circulo cayeron %d dardos %nLo que nos da una aproximación de pi de %.6f %n", dardos, dentro, pi);
		System.out.println("\n=================================================");
	}
}