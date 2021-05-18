import java.util.ArrayList;

public class Reproductor {
	
	/**
	 * @author Sergio Ballesteros Morante
	 * @version 1.0
	 */
	
	private String propietario; 
	private String marca; 
	private String modelo; 
	private int f_fabricacion; 
	private ArrayList<Lista> misListas= new ArrayList<Lista>();
	
	public Reproductor() {
		super();
	}
	
	public Reproductor(String propietario, String marca, String modelo, int f_fabricacion) {
		super();
		this.propietario = propietario;
		this.marca = marca;
		this.modelo = modelo;
		this.f_fabricacion = f_fabricacion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getF_fabricacion() {
		return f_fabricacion;
	}

	public void setF_fabricacion(int f_fabricacion) {
		this.f_fabricacion = f_fabricacion;
	}

	public ArrayList<Lista> getMisListas() {
		return misListas;
	}

	public void setMisListas(ArrayList<Lista> misListas) {
		this.misListas = misListas;
	}

	@Override
	public String toString() {
		return "Reproductor [propietario=" + propietario + ", marca=" + marca + ", modelo=" + modelo
				+ ", f_fabricacion=" + f_fabricacion + ", misListas=" + misListas + "]";
	} 
	
	/**
	 * Método para añadir listas al reproductor
	 * @param lista
	 */
	public void addLista(Lista lista) { 
		misListas.add(lista); 
	}
	
	/**
	 * Método para saberl el número de listas que hay en el reproductor
	 * 
	 * @return numero de listas
	 */
	
	public int numeroListas() { 
		
		return misListas.size(); 
	}
	
	/**
	 * Metodo para reproducir todas las listas
	 */
	
	public void playTodasListas() { 
		
		System.out.println("Reproducción en curso...");
	}
	
	/**
	 * Método para conocer el nombre de las listas
	 * 
	 * @return nombre de las listas
	 */
	public String nombreListas() { 
		
		String nombreLista=""; 
		
		for(int i=0; i<misListas.size(); i++) { 
			nombreLista=misListas.get(i).getNombreLista(); 
			System.out.println(nombreLista);
		}
		
		return nombreLista; 
	}

}
