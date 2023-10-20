package ejercicio_dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tijera="tijera";
		String piedra="piedra";
		String papel="papel";
		String player1;
		String player2;
		String rendirse="s";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Jugador1, eliga piedra ,papel o tijera");
		player1 = sc.next();
		if (player1.equalsIgnoreCase(rendirse)) {
			System.out.println("No se puede jugar si 1 de los participantes deja de jugar");
		} else {
			
		while (!player1.equalsIgnoreCase(papel)
			&&!player1.equalsIgnoreCase(piedra)
			&&!player1.equalsIgnoreCase(tijera)) {
			System.out.println("El jugador 1 ha elegido mal");
			System.out.println("Escriba Piedra, Papel o Tijera. Jugador 1");
			player1 = sc.next();
		}
		
		System.out.println("Jugador2, eliga piedra,papel o tijera");
		player2 = sc.next();
		if (player2.equalsIgnoreCase(rendirse)) {
			System.out.println("No se puede jugar si 1 de los participantes deja de jugar");
		} else {
		while (!player2.equalsIgnoreCase(papel)
				&&!player2.equalsIgnoreCase(piedra)
				&&!player2.equalsIgnoreCase(tijera)) {
				System.out.println("El jugador 2 ha elegido mal");
				System.out.println("Escriba Piedra, Papel o Tijera. Jugador 2");
				player1 = sc.next();
		do {
			if (player1==player2) {
				System.out.println("EMPATE");
			}else if (player1.equalsIgnoreCase(papel)&&player2.equalsIgnoreCase(piedra)
					||player1.equalsIgnoreCase(piedra)&&player2.equalsIgnoreCase(tijera)
					||player1.equalsIgnoreCase(tijera)&&player2.equalsIgnoreCase(papel)) {
				System.out.println("Gana jugador1");
			} else {
				System.out.println("Gana jugador2");
			} 
			System.out.println("Jugador 1, eliga piedra,papel o tijera");
			player1 = sc.next();
			
			System.out.println("Jugador 2, eliga piedra,papel o tijera");
			player2 = sc.next();
			
		} while (player1!=rendirse||player2!=rendirse);
		}
		}
		sc.close();
		}
	
		
		
	}	
	
}
