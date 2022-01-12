import java.util.Iterator;
import java.util.Scanner;
import javax.swing.*;

public class TA5APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 14;
		String name = "Adria";
		int radio = 12;
		Scanner teclado = new Scanner(System.in);
		final double IVA = 21;
		int contadorCien = 100;
		int contador = 0;
		int numVentas;
		
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println("Los dos numeros son iguales");
		}
		
		System.out.println("Bienvenido "  + name);
		
		String saludo = JOptionPane.showInputDialog("Teclea tu nombre");
		
		JOptionPane.showMessageDialog(null, "Bienvenido "  + saludo);
		
		double pi = (Math.PI * Math.pow(radio, 2));
		System.out.println(pi);
		
		System.out.println("Introduce un numero");
		
		double divisible = teclado.nextDouble();
		if (divisible % 2 == 0) {
			System.out.println(divisible +" es divisible entre 2");
		} else {
			System.out.println(divisible + " no es divisible entre 2");
		}
		
		System.out.println("Introduce el precio");
		double precio = teclado.nextDouble();
		
		System.out.println("El precio con IVA es de " + ((precio) + (IVA + 100 / precio)));
		
		while (contador <= contadorCien) {
			System.out.println(contador);
			contador ++;
			
		}
		
		for (int i = 0; i <= contadorCien; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= contadorCien; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
			}
			
		}
		
		System.out.println("Introduce el numero de productos vendidos");
		numVentas = teclado.nextInt();
		int ventaTotal = 0;
		
		for (int i = 0; i <numVentas; i++) {
		System.out.println("Numero de productos vendidos del articulo " + i);
		 int precioProducto = teclado.nextInt();
		 ventaTotal = ventaTotal + ventaTotal;
		}
		
		System.out.println("Numero total de ventas " + ventaTotal);
		
		System.out.println("Introduce un numero de la semana valido");
		teclado.nextLine();
		String dia = teclado.nextLine();
		
		switch (dia) {
		case "lunes": System.out.println("Laborable");
			break;
		case "martes": System.out.println("Laborable");
		break;
		case "miercoles": System.out.println("Laborable");
		break;
		case "jueves": System.out.println("Laborable");
		break;
		case "viernes": System.out.println("Laborable");
		break;
		case "sabado": System.out.println("No laborable");
		break;
		case "domingo": System.out.println("No laborable");
		break;

		default: System.out.println("Dia invalido");
			break;
		}
		
		String password = "AlF98";
		boolean acertado = false;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Introdice tu password");
			String input = teclado.nextLine();
			if (input.equals(password)) {
				acertado = true;
				break;
			}
			System.out.println("Te quedan " + (3 - i) + " intentos");
			
		}
		
		if (acertado) {
			System.out.println("Enhorabuena");
		} else {
			System.out.println("Gastastes los 3 intentos");
		}
		
		//Calculadora
		System.out.println("Primer numero");
		int numero1 = teclado.nextInt();
		System.out.println("Segundo numero");
		int numero2 = teclado.nextInt();
		System.out.println("Operador");
		teclado.nextLine();
		String operador = teclado.nextLine();
		double resultado = 0;
		
		if (operador.equals("+")) {
			resultado = numero1 + numero2;
		} else if(operador.equals("-")) {
			resultado = numero1 - numero2;
		} else if(operador.equals("*")) {
			resultado = numero1 * numero2;
		} else if(operador.equals("/")) {
			resultado = numero1 / numero2;
		} else if(operador.equals("^")) {
			resultado = Math.pow(resultado , numero2);
		} else if(operador.equals("%")) {
			resultado = numero1 % numero2;
		} else {
			System.out.println("Operador no valido");
		}
		
		System.out.println(numero1 + operador + numero2 + "=" + resultado);
		
		
	}

}
