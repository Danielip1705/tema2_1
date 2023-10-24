package ejerciciowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		double mediaedad=0;
		int alumnos=0;
		int mayores=0;
		int sumaedades=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		edad = sc.nextInt();
		
		while (edad>=0) {
		System.out.println("Introduce tu edad");
			
		edad = sc.nextInt();
		
		sumaedades += edad;
		
		alumnos++;
		
		mediaedad=alumnos;
			
		if (edad>=18) {
			mayores++;
		}
		}
		
		System.out.println("La suma de todas las edades son :" + sumaedades);
		
		System.out.println("La media de todas las edades son: "+ sumaedades/mediaedad);
		
		System.out.println("En el programa han escrito su edad " +alumnos+ " alumnos");
		
		System.out.println("Según todas las edades, hay " +mayores+ " mayores de edad");
		
		
	sc.close();	
		
		
		
		
		
		
		
		
	}

}
