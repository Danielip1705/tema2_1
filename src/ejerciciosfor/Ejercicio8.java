package ejerciciosfor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//indicamos con la variable int la nota
		int nota;
		int suspensos=0;
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//con for, indicamos con la variable int los alumnos(1)
		//si alumno es menor que 5 se incrementa
		for (int alumno=1;alumno<=5;alumno++) {
			
			//se imprime en consola que se escriba la nota del x alumno
			System.out.println("Escriba la nota del "+alumno+" alumno");
			
			//escribimos la nota 
			nota = sc.nextInt();
			
			//con if indicamos, que si la nota es menor que 5, que suspensos se incremente
			if (nota<5) {
				suspensos++;
			}
		}
		//imprimimos en pantalla la cantidad de suspensos que hay
		System.out.println("Hay un total de "+suspensos+ " suspensos");
		
	}

}
