package src;
import java.util.Scanner;
public class Ejercicioa1{
	public static void main(String[] args){
		Ejercicioa1 eje = new Ejercicioa1();
	}
	Scanner entrada = new Scanner(System.in);
	int[] elementos = new int[5];

	public Ejercicioa1(){
		for (int i=0; i<5; i++){
			pedirValor(i);
		}

		for (int i=0; i<5 ; i++){
			mostrarValor(i);
		}
	}

	public void pedirValor(int numero){
		System.out.println("Ingrese valor para la casilla No. : " +(numero +1));
		elementos[numero] = entrada.nextInt();
	}

	public void mostrarValor(int numero){
		System.out.println(" el valor para la casilla : " + (numero+1)+ " es:  "   + elementos[numero]);
	}
}