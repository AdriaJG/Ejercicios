
public class TA4APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		int num1 = 12;
		int num2 = 88;
		
		System.out.println(num1 + num2);
		
		System.out.println(num1 - num2);

		System.out.println(num1 * num2);

		System.out.println(num1 / num2);
		
		System.out.println(num1 % num2);

		// 2
		
		int N = 10;
		double A = 11;
		char C = '7';
		
		System.out.println("Variable N =" + N);
		
		System.out.println("Variable A =" + A);
		
		System.out.println("Variable C =" + C);
		
		System.out.println(N + "+" + A + "=" +(N+A));
		
		System.out.println(A + "-" + N + "=" +(A-N));
		
		System.out.println("Valor numerico del caracter" + C +( C + 0));
		
		//3
		
		int x = 2;
		int y = 4;
		double n = 6;
		double m = 12;
		
		System.out.println("El valor de X es =" + x);
		System.out.println("El valor de Y es =" + y);

		System.out.println("El valor de N es =" + n);
		System.out.println("El valor de M es =" + m);
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		System.out.println(n+m);
		System.out.println(n-m);
		System.out.println(n*m);
		System.out.println(n/m);
		System.out.println(n%m);
		
		System.out.println("Doble de cada variable");
		
		System.out.println(x*2);
		System.out.println(y*2);
		System.out.println(n*2);
		System.out.println(m*2);
		
		System.out.println("La suma total de las variables es " + (x+y+n+m));
		
		System.out.println("El producto total de las variables es " + (x*y*n*m));
		
		//4
		
		int N2 = 12;
		System.out.println("Valor inicial de N = " + N2);
		N2 += 77;
		System.out.println(N2 - 77 +" +  77 = " + N2);
		N2 -= 3;
		System.out.println(N2 + 3 +" -  3 = " + N2);
		N2 *= 2;
		System.out.println(N2 / 2 +" *  2 = " + N2);
		
		// 5
		
		int A2 = 1;
		int B2 = 2;
		int C2 = 3;
		int D2 = 4;
		
		B2 = C2;
		C2 = A2;
		A2 = D2;
		B2 = B2;
		
		System.out.println("Valor de A " + A2);
		System.out.println("Valor de B " + B2);
		System.out.println("Valor de C " + C2);
		System.out.println("Valor de D " + D2);
	}

}
