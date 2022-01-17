
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
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	
}
