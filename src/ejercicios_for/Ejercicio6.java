package ejercicios_for;

public class Ejercicio6 {

	public static void main(String[] args) {
		//indicamos con la variable int el numPar(0) y el numImpar(1)
		int numPar=0,numImpar=1;
		
		//con for, indicamos i(1)
		//mientras i sea menor igual a 10, i se incrementa
		for (int i = 1; i<=10;i++) {
			//numpar + numimpar
			numPar+=numImpar;
			//numimpar se suma 2 a si mismo
			numImpar+=2;
		}
		//imprimimos el resultado
		System.out.println("La suma es: "+numPar);
		
	}

}
