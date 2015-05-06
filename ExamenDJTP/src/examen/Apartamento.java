package examen;

/**
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 *
 */

public class Apartamento extends Reserva {
	//Atributos
	protected int numeroHabitaciones;

	/**
	 * @param nombre
	 * @param tiempoEstancia
	 * @param numeroPersonasHabitacion
	 * @param tipoPension
	 * @param numeroHabitaciones
	 * @throws NoInstanciaMinimaException 
	 */
	public Apartamento(String nombre, int tiempoEstancia,
			int numeroPersonasHabitacion, Pension tipoPension,
			int numeroHabitaciones) throws NoInstanciaMinimaException {
		super(nombre, tiempoEstancia, numeroPersonasHabitacion, tipoPension);
		this.numeroHabitaciones = numeroHabitaciones;
	}

	@Override
	public String toString() {
		return "Apartamento [numeroHabitaciones=" + numeroHabitaciones
				+ ", " + super.toString() + "]\n";
	}
	
	
}
