import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class AñoBisiesto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER
		System.out.print("Introduzca año: ");
		int Año = teclado.nextInt();		//ALMACENA AÑO EN Año

		/*AÑO BISIESTO: DIVISIBLE ENTRE 4: SÍ ==> 400 = BISIESTO.
		 * 				 DIVISIBLE ENTRE 10: NO ==> 1900 = NO BISIESTO.
		 * 				 DIVISIBLE ENTRE 400: SÍ ==> 800 = BISIESTO.
		 * 
		 *RESUMEN: SÓLO LOS AÑOS DIVISIBLES ENTRE 4 SON BISIESTOS, LOS QUE ACABAN EN 00 NO LO SON A MENOS QUE TAMBIÉN SEAN DIVISIBLES ENTRE 400.
		 */
		
		if (Año%4 == 0 && Año%100 != 0 || Año % 400 == 0) {		//CONDICIÓN EQUIVALENTE:
									//if (((double)Año/4 == (int)Año/4) && ((double) Año/100 != (int)Año/100) || (((double) Año/100 != (int)Año/100) )&& ((double) Año/400 == (int) Año/400)) {
			System.out.println("El año introducido es bisiesto.");
		} else {
			System.out.println("El año introducido no es bisiesto.");
		} 
	}

}
