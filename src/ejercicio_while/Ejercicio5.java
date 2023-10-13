package ejercicio_while;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int contNeg=0;
		int mediaNeg;
		int cantidad=0;
		int sumaPos =0;
		double sumaNeg=0;
		int contcero =0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (cantidad<10) {
			System.out.println("Introduzca el " + (cantidad + 1) + " numero");
			
			num = sc.nextInt(); //1º
			
			
			cantidad++; //2º
			
			if (num<0) {
				contNeg++;
				sumaNeg+= num;
			} //3º
				
			else if (num==0) {
				contcero++;
			} //4º
			else if (num>=0) {
				sumaPos += num;
			}
		
		}
		
		System.out.println("La suma de los numeros positivos son: " +sumaPos);
		mediaNeg = suma
		System.out.println("La media de los numeros negativos son: " +/contNeg);
		System.out.println("En los 10 numeros que has insertado, hay en total " +contcero+ " ceros");
		
		
		sc.close();
		
		
	}
}



