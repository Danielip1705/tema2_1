package ejercicio_dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//declaramos con la variable int el num1 y num2
		int num1=1,escribenum,resultado, total=0,num2=1;
		
		//creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//imprimimos en pantalla que nos escriba un numero
		System.out.println("Inserte un numero");
		
		//escribimos el numero
		escribenum = sc.nextInt();
		
		do {
			resultado = num1+++num2;
			num1++;
			num2++;
			total += resultado;
		} while (num1 <= escribenum);
		System.out.println("Resultado: " + total);
		sc.close();
		
		
		
		
		
	}

}
