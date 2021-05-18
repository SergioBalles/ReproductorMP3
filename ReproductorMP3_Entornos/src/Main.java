
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * @author Sergio Ballesteros Morante
		 * @version 1.0
		 */

		Cancion cancion1 = new Cancion(250, "Asere Je", "Las ketchup", 2003);
		Cancion cancion2 = new Cancion(100, "Bomba", "King África", 2006);
		Cancion cancion3 = new Cancion(150, "Opa", "Koala", 2005);

		Lista fiestas = new Lista("Fiestas pueblo", "Popular");

		fiestas.addCancion(cancion1);
		fiestas.addCancion(cancion2);
		fiestas.addCancion(cancion3);

		Reproductor miReproductor = new Reproductor("Pepe", "Sony", "200", 2010);

		miReproductor.addLista(fiestas);

		fiestas.nombreCanciones();

		miReproductor.nombreListas();

		// Numero total de listas en el reproductor.
		miReproductor.numeroListas();

		// Numero de canciones en la lista
		fiestas.numeroCanciones();

		// Tiempo total de las canciones en una lista.
		fiestas.tiempoTotal();

		// Play (simulado, manda un Sysout por terminal)
		cancion1.play();

		// Stop (simulado, manda un Sysout por terminal)
		cancion2.stop();
		
		// Reproducir todas las canciones de una lista. (simulado, manda un Sysout por
		// terminal)
		fiestas.playListas();
		
		// Reproducir canciones de todas las listas. (simulado, manda un Sysout por
		// terminal)
		miReproductor.playTodasListas();
		
		// Nombre de todas las listas que contiene el reproductor.
		miReproductor.nombreListas(); 
		
		// Nombre de todas las canciones que contiene una lista.
		fiestas.nombreCanciones(); 
		
	}

}
