import java.util.ArrayList;

public class Lista {
	
	/**
	 * @author Sergio Ballesteros Morante
	 * @version 1.0
	 */
	
	private ArrayList<Cancion> misCanciones= new ArrayList<Cancion>(); 
	private String nombreLista; 
	private String categoria;
	
	public Lista() {
		super();
	}

	public Lista(String nombreLista, String categoria) {
		super();
		this.nombreLista = nombreLista;
		this.categoria = categoria;
	}

	public ArrayList<Cancion> getMisCanciones() {
		return misCanciones;
	}

	public void setMisCanciones(ArrayList<Cancion> misCanciones) {
		this.misCanciones = misCanciones;
	}

	public String getNombreLista() {
		return nombreLista;
	}

	public void setNombreLista(String nombreLista) {
		this.nombreLista = nombreLista;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Lista [misCanciones=" + misCanciones + ", nombreLista=" + nombreLista + ", categoria=" + categoria
				+ "]";
	} 
	
	/**
	 * Método que añade canciones a una lista
	 * @param cancion
	 */
	public void addCancion(Cancion cancion) { 
		misCanciones.add(cancion); 
	}
	
	/**
	 * 
	 *Método para conocer el número de canciones en la lista
	 * @return el número de canciones
	 */
	public int numeroCanciones() { 
		
		return misCanciones.size();
		
	}
	
	/**
	 * Método para conocer el tiempo total de la lista
	 * @return tiempo total de canciones
	 */
	
	public int tiempoTotal() { 
		
		int duracionTotal = 0; 
		
		for(int i=0; i<misCanciones.size(); i++) {
			duracionTotal=duracionTotal+misCanciones.get(i).getDuracion(); 
			
		}
		
		System.out.println(duracionTotal);
		
		return duracionTotal; 
		
	}
	
	/**
	 * Método para reproducir las canciones de la lista
	 * 
	 */
	public void playListas() { 
		
		System.out.println("Reproduciendo lista..." +nombreLista);
	}
	
	/**
	 * Método para conocer el nombre de las canciones de la lista
	 * 
	 * @return el titulo de las canciones de la lista
	 */
	public String nombreCanciones() { 
		
		String nombreCancion=""; 
		
		for(int i=0; i<misCanciones.size(); i++) { 
			nombreCancion=misCanciones.get(i).getTitulo(); 
			System.out.println(nombreCancion);
		}
		
		return nombreCancion; 

	}

}
