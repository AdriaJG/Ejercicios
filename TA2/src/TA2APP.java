import java.util.Iterator;

public class TA2APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		
		//System.out.println("Hola");
		System.out.println("Adios");
		System.out.println("FIN DE PROGRAMA");
		
		//2
		
		//Creacion de un objeto Integer usando el segundo constructor
		
		Integer num1 = new Integer("125");
		
		//Creacion de un objeto Integer usando el primer contructor
		
		Integer num2 = new Integer(20);
		
		//Obtencion del entero que almacena cada objeto Integer
		
		int n1 = num1.intValue();
		int n2 = num2.intValue();
		System.out.println("Suma de " + n1 + " y " + n2 + " vale " + (n1 + n2));
		if (n1+n2>130) {
			n1++;
		} else {n1--;}
		System.out.println(n1);
		
		/* System.out.println("Hola");
		System.out.println("Adios");
		System.out.println("Cucu"); */
		for (int i = 0; i < args.length;/*Ahora viene el paso*/ i++) 
			System.out.println(i+" ");
		System.out.println("FIN DE PROGRAMA");
		
	}

}
