package examen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestReserva {

	public static void main(String[] args) throws NoInstanciaMinimaException {
		// TODO Auto-generated method stub
		File inFile = new File("estancias.csv");
		File outFile = new File("outEstancia.txt");
		List<Reserva> lista1 = new ArrayList<Reserva>();
		List<Reserva> lista2 = new ArrayList<Reserva>();
		List<Reserva> lista3 = new ArrayList<Reserva>();
		
		
		try (Scanner in = new Scanner(inFile);
				BufferedWriter out = new BufferedWriter(new PrintWriter(outFile));){
			String[] listado = null;
			String lineaLeida = null;
			in.nextLine();
			while(in.hasNextLine()){

				//Recogemos las cada linea del archivo csv mediante un String
				//Después lo guardamos en un array de String para tratar los datos 
				lineaLeida = in.nextLine();
				listado = lineaLeida.split(",");
				
				//Rellenamos la primera lista: Estancia de 4 noches, para cinco personas, sin pensión de comida
				//Testeamos el numero de personas(listado[5]) y el tipo de pension (listado[9])  
				if(Integer.parseInt(listado[5])>=5 && Integer.parseInt(listado[9])<=0){
					
					//Para el caso de Hotel
					if(listado[0].equalsIgnoreCase("hotel")){
						if (listado[3].equalsIgnoreCase("true"))
							lista1.add(new Hotel("Hotel", 4, Integer.parseInt(listado[5]),
									Pension.SIN_PENSION, TipoHabitacion.SENCILLA, Integer.parseInt(listado[2])));
						else if (listado[4].equalsIgnoreCase("true"))
							lista1.add(new Hotel("Hotel", 4, Integer.parseInt(listado[5]),
									Pension.SIN_PENSION, TipoHabitacion.DOBLE, Integer.parseInt(listado[2])));
						else
							System.out.println();
					}
				
					//Para el caso de Casa Rural
					if(listado[0].equalsIgnoreCase("casa rural"))	
						lista1.add(new CasaRural("Casa Rural", 4, Integer.parseInt(listado[5]),
									Pension.SIN_PENSION, Integer.parseInt(listado[6]), Boolean.parseBoolean(listado[7])));
					
					//Para el caso del ApartaHotel
					if(listado[0].equalsIgnoreCase("apartahotel"))
						lista1.add(new ApartaHotel("Apartahotel", 4, Integer.parseInt(listado[5]),
									Pension.SIN_PENSION, Integer.parseInt(listado[6]), Boolean.parseBoolean(listado[8])));
				}
				
				//Rellenamos la segunda lista: Estancia de 2 noches, para 1 personas, media pensión de comida
				//Testeamos el numero de personas(listado[5]) y el tipo de pension (listado[9])  
				if(Integer.parseInt(listado[5])>=1 && Integer.parseInt(listado[9])<=1){
					
					//Para el caso de Hotel
					if(listado[0].equalsIgnoreCase("hotel")){
						if (listado[3].equalsIgnoreCase("true"))
							lista2.add(new Hotel("Hotel", 2, Integer.parseInt(listado[5]),
									Pension.MEDIA, TipoHabitacion.SENCILLA, Integer.parseInt(listado[2])));
						else if (listado[4].equalsIgnoreCase("true"))
							lista2.add(new Hotel("Hotel", 2, Integer.parseInt(listado[5]),
									Pension.MEDIA, TipoHabitacion.DOBLE, Integer.parseInt(listado[2])));
						else
							System.out.println();
					}
				
					//Para el caso de Casa Rural
					if(listado[0].equalsIgnoreCase("casa rural"))	
						lista2.add(new CasaRural("Casa Rural", 2, Integer.parseInt(listado[5]),
									Pension.MEDIA, Integer.parseInt(listado[6]), Boolean.parseBoolean(listado[7])));
					
					//Para el caso del ApartaHotel
					if(listado[0].equalsIgnoreCase("apartahotel"))
						lista2.add(new ApartaHotel("Apartahotel", 2, Integer.parseInt(listado[5]),
									Pension.MEDIA, Integer.parseInt(listado[6]), Boolean.parseBoolean(listado[8])));
				}
				
				//Rellenamos la tercera lista: Estancia de 2 noches, para 2 personas, pensión completa de comida
				//Testeamos el numero de personas(listado[5]) y el tipo de pension (listado[9])  
				if(Integer.parseInt(listado[5])>=2 && Integer.parseInt(listado[9])<=2){
					
					//Para el caso de Hotel
					if(listado[0].equalsIgnoreCase("hotel")){
						if (listado[3].equalsIgnoreCase("true"))
							lista3.add(new Hotel("Hotel", 2, Integer.parseInt(listado[5]),
									Pension.COMPLETA, TipoHabitacion.SENCILLA, Integer.parseInt(listado[2])));
						else if (listado[4].equalsIgnoreCase("true"))
							lista3.add(new Hotel("Hotel", 2, Integer.parseInt(listado[5]),
									Pension.COMPLETA, TipoHabitacion.DOBLE, Integer.parseInt(listado[2])));
						else
							System.out.println();
					}
				
					//Para el caso de Casa Rural
					if(listado[0].equalsIgnoreCase("casa rural"))	
						lista3.add(new CasaRural("Casa Rural", 2, Integer.parseInt(listado[5]),
									Pension.COMPLETA, Integer.parseInt(listado[6]), Boolean.parseBoolean(listado[7])));
					
					//Para el caso del ApartaHotel
					if(listado[0].equalsIgnoreCase("apartahotel"))
						lista3.add(new ApartaHotel("Apartahotel", 2, Integer.parseInt(listado[5]),
									Pension.COMPLETA, Integer.parseInt(listado[6]), Boolean.parseBoolean(listado[8])));
				}
			}
			
			//Copiamos las listas al archivo outEstancias.txt
			out.write(lista1.toString());
			out.write(lista2.toString());
			out.write(lista3.toString());
			out.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Imprimimos las listas creadas
		System.out.println("Imprimo la lista 1");
		System.out.println(lista1);
		System.out.println("Imprimo la lista 2");
		System.out.println(lista2);
		System.out.println("Imprimo la lista 3");
		System.out.println(lista3);
	}

}
@SuppressWarnings("serial")
class NoInstanciaMinimaException extends Exception {
	
}