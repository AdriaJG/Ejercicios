
public class Password {
	private int longitud;
	private String contrase�a;
	
	public Password() {
		this.longitud = 8;
		this.contrase�a = generadorRandom();
		
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
