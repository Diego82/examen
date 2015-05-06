package examen;

/**
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 *
 */

import java.time.LocalDate;

public class Reserva {
	/*nombre, tiempo de instancia, es decir el numero de noches, la fecha de reserva,
	 *  numero m ́aximo de personas y si queremos media pension, 
	 *  pension completa o no queremos pensi ́on alguna. 
	 *  La fecha de reserva sera la de creaccion del objeto.*/
	protected String nombre;
	protected int tiempoEstancia;
	protected LocalDate fechaReserva;
	protected int numeroPersonasHabitacion;
	protected Pension tipoPension;
	/**
	 * @param nombre
	 * @param tiempoEstancia
	 * @param numeroPersonasHabitacion
	 * @param tipoPension
	 * @throws NoInstanciaMinimaException 
	 */
	public Reserva(String nombre, int tiempoEstancia,
			int numeroPersonasHabitacion, Pension tipoPension) throws NoInstanciaMinimaException {
		if (tiempoEstancia<2) {
			throw new NoInstanciaMinimaException();
		}
		this.nombre = nombre;
		this.tiempoEstancia = tiempoEstancia;
		this.fechaReserva = LocalDate.now();
		this.numeroPersonasHabitacion = numeroPersonasHabitacion;
		this.tipoPension = tipoPension;
	}
	@Override
	public String toString() {
		return "Reserva [nombre=" + nombre + ", tiempoEstancia="
				+ tiempoEstancia + ", fechaReserva=" + fechaReserva
				+ ", numeroPersonasHabitacion=" + numeroPersonasHabitacion
				+ ", tipoPension=" + tipoPension + "]";
	}
	
}
