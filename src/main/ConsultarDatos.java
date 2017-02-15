package main;

import java.util.Iterator;

import org.hibernate.Session;

import models.Ciclista;
import models.Equipo;
import models.Etapa;

public class ConsultarDatos {

	public static int menuConsulta() {

		int opcion = 0;

		do {
			System.out.println("OPCIONES:");
			System.out.println("--------------------");
			System.out.println("(1)Mostrar todos.");
			System.out.println("(2)Buscar por nombre.");
			opcion = Entrada.entero();

			// Controlamos con un bucle while que el usuario introduzca un
			// número de 1 a 2 por las opciones
			while (opcion <= 0 || opcion > 2) {
				System.out.println("El número introducido " + opcion
						+ " es erróneo vuelva a introducir un número que aparece en las opciones:");

				opcion = Entrada.entero();

			}
			return opcion;
		} while (opcion != 2);

	}

	public static void consultarEquipo() {

		switch (menuConsulta()) {

		case 1:
			System.out.println("Mostramos todos los equipos:");
			System.out.println("----------------------------");
			
			//Realizamos la consulta
			Iterator iter = InsertarDatos.conectarSesionFactory().createQuery("from Equipo").iterate();
			while (iter.hasNext()) {
				// instanciamos el objetoCiclista
				Equipo equ = (Equipo) iter.next(); 
				//Recogemos los datos de la consulta
				System.out.print("Equipo: ");
				System.out.println(equ.getNomequipo());
				System.out.print("Director: ");
				System.out.println(equ.getDirector());
				System.out.println("-------------------");
				
				
			}
			//Cerramos la sesion
			InsertarDatos.conectarSesionFactory().close();
			break;
		case 2:

			//Pedimos los datos al usuario
			System.out.println("Vas a elegir por nombre:");
			String nombreEquipo = "";
			System.out.println("Instroduzca el nombre del equipo.");
			nombreEquipo = Entrada.cadena();

			//Realizamos la consulta
			Iterator iter2 = InsertarDatos.conectarSesionFactory().createQuery("from Equipo where nomequipo like '" + nombreEquipo + "'").iterate();
			while (iter2.hasNext()) {
				// instanciamos el objeto Equipo
				Equipo equ = (Equipo) iter2.next();
				//Recogemos los datos de la consulta
				System.out.println(
						"----------------------\nEquipo: " + equ.getNomequipo() + "\nDirector: " + equ.getDirector());}
			//Cerramos la sesion
			InsertarDatos.conectarSesionFactory().close();
			break;

		default:

			break;
		}

	}

	public static void consultarCiclista() {

		switch (menuConsulta()) {

		case 1:
			System.out.println("Mostramos todos los ciclistas:");
			System.out.println("----------------------------");
			Iterator iter = InsertarDatos.conectarSesionFactory().createQuery("from Ciclista").iterate();
			
			while (iter.hasNext()) {
				// instanciamos el objetoCiclista
				Ciclista cicl = (Ciclista) iter.next(); 
				//Recogemos los datos de la consulta
				System.out.println("----------------------\nNombre: " + cicl.getNombre() + "\nEdad: " + cicl.getEdad()
						+ "\nNombre Equipo: " + cicl.getEquipo().getNomequipo() + "\nDorsal: " + cicl.getDorsal());}
			//Cerramos la sesion
			InsertarDatos.conectarSesionFactory().close();
			
			break;
		case 2:

			System.out.println("Vas a elegir por nombre:");
			
			String nombreCiclista = "";
			System.out.println("Instroduzca el nombre del ciclista.");
			nombreCiclista = Entrada.cadena();

			Iterator iter2 =InsertarDatos.conectarSesionFactory().createQuery("from Ciclista where nombre like '" + nombreCiclista + "'").iterate();
			while (iter2.hasNext()) {
				// instanciamos el objetoCiclista
				Ciclista cicl = (Ciclista) iter2.next();
				//Recogemos los datos de la consulta
				System.out.println("----------------------\nNombre: " + cicl.getNombre() + "\nEdad: " + cicl.getEdad()
						+ "\nNombre Equipo: " + cicl.getEquipo().getNomequipo() + "\nDorsal: " + cicl.getDorsal());
			}
			//Cerramos la sesion
			InsertarDatos.conectarSesionFactory().close();
			break;

		default:

			break;
		}

	}

	public static void consultarEtapa() {
		switch (menuConsulta()) {

		case 1:
			System.out.println("Mostramos todas las etapas:");
			System.out.println("----------------------------");
			Iterator iter =InsertarDatos.conectarSesionFactory().createQuery("from Etapa").iterate();
			int cont = 0;
			while (iter.hasNext()) {
				// instanciamos el objeto Etapa
				Etapa etapa1 = (Etapa) iter.next(); 
				//Recogemos los datos de la consulta
				System.out.println("----------------------\nNumero de la etapa: " + etapa1.getNumetapa() + "\nCiclista: " + etapa1.getCiclista().getNombre()
						+ "\nKilometros: " + etapa1.getKms() + "\nSalida: " + etapa1.getSalida() + "\nLlegada: " + etapa1.getLlegada());
			}
			//Cerramos la sesion
			InsertarDatos.conectarSesionFactory().close();
			break;
		case 2:

			System.out.println("Vas a elegir por número de etapa:");
			//preguntamos datos al usuario
			int numEtapa = 0;
			System.out.println("Instroduzca el numero de la etapa.");
			numEtapa = Entrada.entero();
			//Realizamos la consulta
			Iterator iter2 = InsertarDatos.conectarSesionFactory().createQuery("from Etapa where numetapa = '" + numEtapa + "'").iterate();
			while (iter2.hasNext()) {
				Etapa etapa1 = (Etapa) iter2.next();
				//Recogemos los datos de la consulta
				System.out.println("----------------------\nNumero de la etapa: " + etapa1.getNumetapa() + "\nCiclista: " + etapa1.getCiclista().getNombre()
						+ "\nKilometros: " + etapa1.getKms() + "\nSalida: " + etapa1.getSalida() + "\nLlegada: " + etapa1.getLlegada());
			}
			//Cerramos la sesion
			InsertarDatos.conectarSesionFactory().close();
			break;

		default:

			break;
		}
	}

}
