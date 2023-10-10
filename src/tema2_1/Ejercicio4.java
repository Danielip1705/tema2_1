package tema2_1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dado1, dado2;
		
		int valor1,valor2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica cuanto ha sacado en la 1º tirada");
		
		dado1 = sc.next();
		
		System.out.println("Indica cuanto has sacado en la 2º tirada");
		
		dado2 = sc.next();
		
		valor1 = switch (dado1) {
		case "UNO" ->1;
		case "DOS" ->2;
		case "TRES" ->3;
		case "CUATRO" ->4;
		case "CINCO" ->5;
		case "SEIS" ->6;
		default ->0;
		};
		
		valor2 = switch (dado2) {
		case "UNO" ->1;
		case "DOS" ->2;
		case "TRES" ->3;
		case "CUATRO" ->4;
		case "CINCO" ->5;
		case "SEIS" ->6;
		default ->0;
		};
		
		System.out.println(valor1+valor2);
		sc.close();
		
		}
		
	}


