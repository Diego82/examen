package examen;

/**
 * @author Diego Jesus Torres Peinado
 * @version 1.0
 *
 */

public class CasaRural extends Apartamento {
	//Atributo
	protected boolean hayPiscina;

	/**
	 * @param nombre
	 * @param tiempoEstancia
	 * @param numeroPersonasHabitacion
	 * @param tipoPension
	 * @param numeroHabitaciones
	 * @param hayPiscina
	 * @throws NoInstanciaMinimaException 
	 */
	public CasaRural(String nombre, int tiempoEstancia,
			int numeroPersonasHabitacion, Pension tipoPension,
			int numeroHabitaciones, boolean hayPiscina) throws NoInstanciaMinimaException {
		super(nombre, tiempoEstancia, numeroPersonasHabitacion, tipoPension,
				numeroHabitaciones);
		this.hayPiscina = hayPiscina;
	}

	@Override
	public String toString() {
		return "CasaRural [hayPiscina=" + hayPiscina + ", "
				+ super.toString() + "]\n";
	}
	
	
}
