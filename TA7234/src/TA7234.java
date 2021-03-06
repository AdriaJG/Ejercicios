import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JOptionPane;

public class TA7234 {
	static HashMap<String, ArrayList<Double>> carrito = new HashMap<>();
	static HashMap<String, ArrayList<Double>> almacen = new HashMap<>();
	static final int PRECIO = 0;
	static final int CANTIDAD = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//2
	
	//Aņadimos productos a la lista de la compra
	public static void aņadirCompra(String producto, double cantidad) {
		ArrayList<Double> infoProducto = new ArrayList<>();
		infoProducto.add(almacen.get(producto).get(PRECIO));
		infoProducto.add(cantidad);
		carrito.put(producto, infoProducto);
	}
	
	public static void generarTicket() {
		double totalPrecio = 0;
		int numTotalArticulos = 0;
		int IVA;
		double cantidadPagada = 0;
		double cantidadConIVA;
		
		for(String producto: carrito.keySet()) {
			totalPrecio += carrito.get(producto).get(PRECIO) * carrito.get(producto).get(CANTIDAD);
			numTotalArticulos += carrito.get(producto).get(CANTIDAD);
		}
		
		if (Math.random() < 0.5) {
			IVA = 21;
		} else {
			IVA = 4;
		}
		
		cantidadConIVA = (totalPrecio + (IVA * 100 / totalPrecio));
		
		while (cantidadPagada < (totalPrecio + (IVA * 100 / totalPrecio))) {
			cantidadPagada = Double.valueOf(JOptionPane.showInputDialog("Cantidad a pagar" + cantidadConIVA));
			
		}
		
		System.out.println("IVA " + IVA);
		System.out.println("Total Articulos " + numTotalArticulos);
		System.out.println("Total precio sin IVA " + totalPrecio);
		System.out.println("Precio total " + (cantidadConIVA));
		System.out.println("Cantidad pagada " + cantidadPagada);
		System.out.println("Cambio " + (totalPrecio - cantidadConIVA));
		
	}
	//3
	//Aņadimos productos al almazen
	public static void aņadirAlmazen() {
		String nombre = JOptionPane.showInputDialog("Nombre del producto");
		double precio = Double.valueOf(JOptionPane.showInputDialog("Numero de objetos"));
		double cantidad = Double.valueOf(JOptionPane.showInputDialog("Numero de objetos"));
		int confirmado = JOptionPane.showConfirmDialog(null,"ŋAņadir otro producto?");
		ArrayList<Double> infoProducto = new ArrayList<>();
		infoProducto.add(precio);
		infoProducto.add(cantidad);
		
		 almacen.put(nombre, infoProducto);
		
		if (confirmado == JOptionPane.OK_OPTION) {
			aņadirAlmazen();
		} else {
			mostrar(almacen);
		}
		
	}
	//Mostramos el contenido del almacen
	public static void mostrar(HashMap<String, ArrayList<Double>> mostrador) {

		for(String id :mostrador.keySet()) {
			System.out.println("Producto " + id + " precio " + mostrador.get(id).get(PRECIO) +" cantidad " + mostrador.get(id).get(CANTIDAD));
		}
	}
	
	// 4
	
	//Pedimos el nombre del producto
	
	public static void productoAAņadir() {
		String producto = JOptionPane.showInputDialog("Que producto quieres comprar?");
		if (productoExiste(producto)) {
			double cantidad = Double.valueOf(JOptionPane.showInputDialog("Cantidad que desea comprar max " + almacen.get(producto).get(CANTIDAD)));
			while (!tieneStock(producto) || cantidad > almacen.get(producto).get(CANTIDAD)) {
				cantidad = Double.valueOf(JOptionPane.showInputDialog("Cantidad ERRONIA, maximo " + almacen.get(producto).get(CANTIDAD)));
			}
			
			
			
			int confirmado = JOptionPane.showConfirmDialog(null,"ŋAņadir otro producto a la cesta?");
			aņadirCompra(producto, cantidad);
			
			if (JOptionPane.OK_OPTION == confirmado) {
				productoAAņadir();
				
			} else {
				generarTicket();
			}
			
		} else {
			JOptionPane.showConfirmDialog(null, "El producto no existe");
			productoAAņadir();
		}
	}
	
	//Comprovar si el producto existe
	public static boolean productoExiste(String producto) {
		for(String id : almacen.keySet()) {
			if (id.equals(producto)) {
				return true;
			}
		}
		return false;
	}
	
	//Miramos si tiene stock
	public static boolean tieneStock(String producto) {
		if (almacen.get(producto).get(CANTIDAD) > 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//Restamos la cantidad al stock
	
	public static void retirarCantidad(int cantidad, String producto) {
		
	}
}
