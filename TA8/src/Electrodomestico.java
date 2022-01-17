
public class Electrodomestico {
	protected double precioBase = 100;
	protected String color = "blanco";
	protected char consumoEnergetico = 'F';
	protected double peso = 5;
	
	public Electrodomestico() {
		
	}
	
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = eficienciaCorrecta(consumoEnergetico);
		this.peso = peso;
	}
	
	public char eficienciaCorrecta(Character eficiencia) {
		if (Character.toUpperCase(eficiencia) >= 'A' && Character.toUpperCase(eficiencia) <= 'F') {
			return eficiencia;
		} else {
			return 'F';
		}
	}
}
