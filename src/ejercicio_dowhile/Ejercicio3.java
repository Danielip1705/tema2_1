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
		
		//con el comando do declaramos las siguientes operaciones
		do {
			//resultado almacenara la operacion de num1 (1) y num2 (2)
			resultado = num1+++num2;
			
			//num1 se incrementa al siguiente numero
			num1++;
			
			//num2 se incrementa al siguiente numero
			num2++;
			
			//total es el resultado de las sumas y donde se imprimira en consola
			total += resultado;
			
			//con while declaramos que siga el bucle hasta que num1 sea menor o igual que el numero escrito
		} while (num1 <= escribenum);
		
		//imprimimos el resultado
		System.out.println("Resultado: " + total);
		
		//cerramos scanner
		sc.close();
		
		
		
		
		
	}

}
