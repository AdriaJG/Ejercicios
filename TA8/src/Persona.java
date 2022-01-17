
public class Persona {
	final char HOMBRE = 'H';
	final char MUJER = 'M';
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
		this.sexo = sexoCorrecto(sexo);
	}

	public Persona(String nombre, int edad, String dNI, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = dNI;
		this.sexo = sexoCorrecto(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public char sexoCorrecto(char sexo) {
		if (sexo == HOMBRE || sexo == MUJER) {
			return sexo;
		} else {
			return HOMBRE;
		}
	}

}
