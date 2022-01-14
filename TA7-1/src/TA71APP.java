import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class TA71APP {
	
	static private HashMap<String, ArrayList<Double>> alumnos = new HashMap<String, ArrayList<Double>>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anadirNotasAlumno();
	}
	
	public static void añadirAlumnos() {
		int confirmado = JOptionPane.showConfirmDialog(null,"¿Añadir otro alumno?");

			if (JOptionPane.OK_OPTION == confirmado)
					anadirNotasAlumno();
			else
				   mostrarAlumnos();
	}
	
	public static void anadirNotasAlumno() {
		String nombre;
		nombre = JOptionPane.showInputDialog("Nombre del alumno");
		ArrayList<Double> notasAlumno = new ArrayList<>();
		double notaAlumno = 0;
		String input;
		do {
			input = JOptionPane.showInputDialog("Nota de " + nombre);
			if (input != null) {
				notaAlumno = Double.valueOf(input);
				notasAlumno.add(notaAlumno);
			} else {
				JOptionPane.showMessageDialog(null, "Alumno guardado exitosamente");
				alumnos.put(nombre, notasAlumno);
			}
		} while (input != null);
		añadirAlumnos();
	}
	
	// Mostramos los alumnos
	
	public static void mostrarAlumnos() {
		for (String nombre : alumnos.keySet()) {
			System.out.println("Alumno " + nombre + " nota media " + calcularMedia(alumnos.get(nombre)));
		}
	}
	
	// calcular nota media
	
	public static double calcularMedia(ArrayList<Double> notas) {
		double media = 0;
		for (int i = 0; i < notas.size(); i++) {
			media += notas.get(i);
		}
		return media / notas.size();
	}

}
