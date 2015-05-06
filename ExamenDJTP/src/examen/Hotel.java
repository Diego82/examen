/**
 * 
 */
package examen;

/**
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 *
 */
public class Hotel extends Reserva {
	//Atributos
	protected TipoHabitacion habitacion;
	protected int numeroEstrellas;
	/**
	 * @param nombre
	 * @param tiempoEstancia
	 * @param numeroPersonasHabitacion
	 * @param tipoPension
	 * @param habitacion
	 * @param numeroEstrellas
	 * @throws NoInstanciaMinimaException 
	 */
	public Hotel(String nombre, int tiempoEstancia,
			int numeroPersonasHabitacion, Pension tipoPension,
			TipoHabitacion habitacion, int numeroEstrellas) throws NoInstanciaMinimaException {
		super(nombre, tiempoEstancia, numeroPersonasHabitacion, tipoPension);
		this.habitacion = habitacion;
		this.numeroEstrellas = numeroEstrellas;
	}
	@Override
	public String toString() {
		return "Hotel [habitacion=" + habitacion + ", numeroEstrellas="
				+ numeroEstrellas + ", " + super.toString() + "]\n";
	}
	
		
		
}
