package examen;

/**
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 *
 */

public class ApartaHotel extends Apartamento {
	/* donde controlamos el numero de habitaciones y si la limpieza
	 * esta incluida o no. En una habitacion puede haber
	 * un maximo de dos personas*/
	
	protected boolean limpiezaIncluida;

	/**
	 * @param nombre
	 * @param tiempoEstancia
	 * @param numeroPersonasHabitacion
	 * @param tipoPension
	 * @param numeroHabitaciones
	 * @param limpiezaIncluida
	 * @throws NoInstanciaMinimaException 
	 */
	public ApartaHotel(String nombre, int tiempoEstancia,
			int numeroPersonasHabitacion, Pension tipoPension,
			int numeroHabitaciones, boolean limpiezaIncluida) throws NoInstanciaMinimaException {
		super(nombre, tiempoEstancia, numeroPersonasHabitacion, tipoPension,
				numeroHabitaciones);
		this.limpiezaIncluida = limpiezaIncluida;
	}

	@Override
	public String toString() {
		return "ApartaHotel [limpiezaIncluida=" + limpiezaIncluida
				+ ", " + super.toString() + "]\n";
	}
	
	
	
	
}
