public class Cancion {
	
	/**
	@author Sergio Ballesteros Morante
	@version 1.0
	
	*/
	
	private int duracion; 
	private String titulo;
	private String nombreArtista ; 
	private int fecha;
	
	
	
	public Cancion() {
		super();
	}

	public Cancion(int duracion, String titulo, String nombreArtista, int fecha) {
		super();
		this.duracion = duracion;
		this.titulo = titulo;
		this.nombreArtista = nombreArtista;
		this.fecha = fecha;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Cancion [duracion=" + duracion + ", titulo=" + titulo + ", nombreArtista=" + nombreArtista + ", fecha="
				+ fecha + "]";
	} 
	
	/**
	 * Método para reproducir la canción
	 * 
	 * @return titulo de la cancion
	 */
	public String play() { 
		
		System.out.println("Reproduciendo la cancion..." +titulo);
		
		return titulo; 
		
	}
	
	/**
	 * Método para parar la canción
	 * 
	 */
	public void stop() { 
		
		System.out.println("Parando la cancion..." +titulo);
		
	}
}
