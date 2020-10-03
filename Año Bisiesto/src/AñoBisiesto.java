import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class A�oBisiesto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE TIPO SCANNER
		System.out.print("Introduzca a�o: ");
		int A�o = teclado.nextInt();		//ALMACENA A�O EN A�o

		/*A�O BISIESTO: DIVISIBLE ENTRE 4: S� ==> 400 = BISIESTO.
		 * 				 DIVISIBLE ENTRE 10: NO ==> 1900 = NO BISIESTO.
		 * 				 DIVISIBLE ENTRE 400: S� ==> 800 = BISIESTO.
		 * 
		 *RESUMEN: S�LO LOS A�OS DIVISIBLES ENTRE 4 SON BISIESTOS, LOS QUE ACABAN EN 00 NO LO SON A MENOS QUE TAMBI�N SEAN DIVISIBLES ENTRE 400.
		 */
		
		if (A�o%4 == 0 && A�o%100 != 0 || A�o % 400 == 0) {		//CONDICI�N EQUIVALENTE:
									//if (((double)A�o/4 == (int)A�o/4) && ((double) A�o/100 != (int)A�o/100) || (((double) A�o/100 != (int)A�o/100) )&& ((double) A�o/400 == (int) A�o/400)) {
			System.out.println("El a�o introducido es bisiesto.");
		} else {
			System.out.println("El a�o introducido no es bisiesto.");
		} 
	}

}
