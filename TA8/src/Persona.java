
public class Persona {
	private final char HOMBRE = 'H';
	private final char MUJER = 'M';
	private String nombre = "";
	private int edad = 0;
	private String DNI;
	private char sexo = HOMBRE;
	private double peso = 0;
	private double altura;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad, String dNI, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dNI;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	
	
	
}
