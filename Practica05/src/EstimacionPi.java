public class EstimacionPi{
	public static void main (String[] args){

		int dardosALanzar = 1000000;
		int dardosLanzados = 0;
		int dentro = 0;

		while (dardosLanzados < dardosALanzar){

			//Se generar valores aleatorios para x y y
			double ejeX = Math.random();
			double ejeY = Math.random();

			//Se verifica si el dardo cayo dentro
			if(Math.pow(ejeX,2) + Math.pow(ejeY,2) <= 1){

				dentro++;
				
			}else{}

			dardosLanzados++;

		}

		//Se estima pi con los valores obtenidos
		double pi = 4 * ((double)dentro / dardosALanzar);

		System.out.println("=================================================\n");
		System.out.printf("Se lanzaron %d dardos a un circulo %nDentro del circulo cayeron %d dardos %nLo que nos da una aproximación de pi de %.6f %n", dardosALanzar, dentro, pi);
		System.out.println("\n=================================================");
	}
}