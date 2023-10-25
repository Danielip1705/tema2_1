package ejercicios_for;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//indicamos con la varible int el num
		int num,total=0;
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		for (int contador=1;contador<=10;contador++) {
			
		//imprimimos en pantalla que escriba el numero
		System.out.println("Escriba el "+contador+ " numero");
		
		num = sc.nextInt();
		total +=num;
		
		}
		
		System.out.println("La media de los 10 numeros son: " +total/10 );
		}
	}


