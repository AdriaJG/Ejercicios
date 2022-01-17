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
	
	//Añadimos productos a la lista de la compra
	public static void añadirCompra() {
		
	}
	//3
	//Añadimos productos al almazen
	public static void añadirAlmazen() {
		String nombre = JOptionPane.showInputDialog("Nombre del producto");
		double precio = Double.valueOf(JOptionPane.showInputDialog("Numero de objetos"));
		double cantidad = Double.valueOf(JOptionPane.showInputDialog("Numero de objetos"));
		int confirmado = JOptionPane.showConfirmDialog(null,"¿Añadir otro producto?");
		ArrayList<Double> infoProducto = new ArrayList<>();
		infoProducto.add(precio);
		infoProducto.add(cantidad);
		
		 almacen.put(nombre, infoProducto);
		
		if (confirmado == JOptionPane.OK_OPTION) {
			añadirAlmazen();
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
