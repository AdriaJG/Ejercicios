
public class Password {
	private int longitud;
	private String contraseña;
	
	public Password() {
		this.longitud = 8;
		this.contraseña = generadorRandom();
		
	}
	
	public String generadorRandom() {
		String pass = "";
		
		for (int i = 0; i < longitud; i++) {
			char caracter = (char)(Math.random()* (154 - 33) + 33);
			pass += caracter;
		}
		return pass;
	}
}
