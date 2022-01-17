
public class Serie {
	
	private String titulo = "";
	private int numTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";
	
	public Serie() {
		
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	
}
