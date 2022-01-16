import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TA6 {
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(aBinario(12));
	}
	
	//1
	
	public static double areaCirculo(double radio) {
		return (Math.sqrt(radio) * Math.PI);
	}
	
	public static double areaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	
	public static double areaCuadrado(double lado) {
		return Math.sqrt(lado);
	}
	
	// 2
	
	// 3
	
	public static boolean esPrimo(int numero) {
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		
		for (int i = 2; i < numero / 2; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	// 4
	
	public static int factorial(int numero) {
		int factorial = numero;
		
		for (int i = numero; i < 0; i--) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	// 5
	
	public static String aBinario(int numero) {
		String cadenaBinaria = "";
		int nNumero = numero;
		do {
			cadenaBinaria = String.valueOf(nNumero % 2) + cadenaBinaria;
			nNumero /= 2;
			System.out.println(nNumero);
		} while (nNumero % 2 == 0 || nNumero % 2 == 1 && nNumero > 1); 
		return "1" + cadenaBinaria;
	}
	
	// 6
	
	public static int contadorNumeros(int numero) {
		return String.valueOf(numero).length();
	}
	
	// 7
	
	public static void conversor(double euros, String moneda) {
		double cantidadConvertida = 0;
		HashMap<String, Double> valores = new HashMap<String, Double>();
		valores.put("libras", 0.86);
		valores.put("dolares", 1.28);
		valores.put("yenes", 129.85);
		
		cantidadConvertida = valores.get(moneda) * euros;
		
		System.out.println(cantidadConvertida);
		
	}
	
	// 8
	
	public static void rellenador() {
		int[] array10 = new int[10];
		
		for (int i = 0; i < array10.length; i++) {
			System.out.print("Introduce un valor en la posicion " + i);
			array10[10] = teclado.nextInt();
		}
		
		mostrador(array10);
	}
	
	public static void mostrador(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor en la posicion " + i + " es " + array[i]);
			suma += array[i];
		}
		System.out.println("La suma total es " + suma);
	}
	
	// 9
	
	public static void rellenadorAleatorio(){
		System.out.println("Tamaño del array");
		int tamaño = teclado.nextInt();
		int[] array10 = new int[tamaño];
		
		for (int i = 0; i < array10.length; i++) {
			array10[i] = ((int)Math.random() * 10);
		}
		
		mostrador(array10);
		
	}
	
	// 10
	
	public static void rellenarPrimos() {
		System.out.println("Tamaño del array");
		int tamaño = teclado.nextInt();
		int[] array10 = new int[tamaño];
		System.out.println("Entre que numeros");
		int inicio = teclado.nextInt();
		System.out.println("Siguiente valor");
		int fin = teclado.nextInt();
		int random = ((int)Math.random() * (fin - inicio) + fin);
		
		for (int i = 0; i < array10.length; i++) {
			while (!primoValido(random)) {
				random = ((int)Math.random() * (fin - inicio) + fin);
			}
			array10[i] = ((int)Math.random() * (fin - inicio) + fin);
		}
		
		mostrarPrimosRandom(array10);
	}
	
	public static boolean primoValido(int numero) {
		for (int i = 2; i > numero / 2; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void mostrarPrimosRandom(int[] array) {
		int numeroMayor = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Valor en la posicion " + i + " es " + array[i]);
			if (array[i] > numeroMayor) {
				numeroMayor = array[i];
			}
		}
		
		System.out.println("El numero mas grande es " + numeroMayor);
	}
	
	// 11
	public static void dosArray() {
		System.out.println("Tamaño del array");
		int tamaño = teclado.nextInt();
		int array1[] = new int[tamaño];
		int array2[] = new int[tamaño];
		int arrayResultado[];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int)Math.random() * 10;
			array2[i] = array1[i];
			array2[i] = (int)Math.random() * 10;
			
		}
		
		arrayResultado = multiArray(array1, array2);
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.println("Posicion " + i + " " + array1[i] + " x " + array2[i] + " = " + (array1[i] * array2[i]));
		}
		
	}
	
	public static int[] multiArray(int array1[], int array2[]){
		int arrayResultado[] = new int[array1.length];
		
		for (int i = 0; i < arrayResultado.length; i++) {
			arrayResultado[i] = array1[i] - array2[i];
			
		}
		
		return arrayResultado;
	}
	// 12
	
	public static void numerosFinalizadosEn () {
		System.out.println("Tamaño del array");
		int tamaño = teclado.nextInt();
		Integer array[] = new Integer [tamaño];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.valueOf((int) (Math.random()*300));
			//array[i].
		}
	}
	

}
