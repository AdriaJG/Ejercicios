import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JOptionPane;

public class TA7234 {
	static HashMap<String, ArrayList<Double>> carrito = new HashMap<>();
	static HashMap<String, ArrayList<Double>> almacen = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//2
	
	//A�adimos productos a la lista de la compra
	public static void a�adirCompra() {
		
	}
	//3
	//A�adimos productos al almazen
	public static void a�adirAlmazen() {
		String nombre = JOptionPane.showInputDialog("Nombre del producto");
		double precio = Double.valueOf(JOptionPane.showInputDialog("Numero de objetos"));
		double cantidad = Double.valueOf(JOptionPane.showInputDialog("Numero de objetos"));
		int confirmado = JOptionPane.showConfirmDialog(null,"�A�adir otro producto?");
		ArrayList<Double> infoProducto = new ArrayList<>();
		infoProducto.add(precio);
		infoProducto.add(cantidad);
		
		 almacen.put(nombre, infoProducto);
		
		if (confirmado == JOptionPane.OK_OPTION) {
			a�adirAlmazen();
		} else {
			mostrar(almacen);
		}
		
	}
	//Mostramos el contenido del almacen
	public static void mostrar(HashMap<String, ArrayList<Double>> mostrador) {

		for(String id :mostrador.keySet()) {
			System.out.println("Producto " + id + " precio " + mostrador.get(id).get(0) +" cantidad " + mostrador.get(id).get(1));
		}
	}
	
	// 4
	
	
}
