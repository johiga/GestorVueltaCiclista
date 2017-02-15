package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import models.Ciclista;
import models.Equipo;
import models.Etapa;
import models.SessionFactoryUtil;

import java.sql.DriverManager;
import java.sql.SQLException;
//
import java.util.Iterator;

//En esta clase intr oducimos los datos de un nuevo equipo
public class InsertarDatos {

	// Creamos este método para poder añadir la clase Session Factory
	public static Session conectarSesionFactory() {

		SessionFactory sesion = SessionFactoryUtil.getSessionFactory();
		Session session = sesion.openSession();

		return session;
	}

	public static void insertarEquip() {

		String denominacionEquipo;
		String directorEquipo;
		int numeroCiclistas;
		String nombreCiclista;
		int edadCiclista;

		// Haciendo uso de la clase Entrada introduciremos los datos de un
		// equipo
		System.out.println("Introduce el nombre del equipo:");
		denominacionEquipo = Entrada.cadena();

		System.out.println("Introduce el nombre del director del equipo:");
		directorEquipo = Entrada.cadena();

		/* Primero creamos un equipo */

		Equipo equipo1 = new Equipo();
		equipo1.setNomequipo(denominacionEquipo);
		equipo1.setDirector(directorEquipo);

		// haremos persistir a este objeto equipo.
		conectarSesionFactory().beginTransaction();
		conectarSesionFactory().persist(equipo1);

		do {

			// Preguntaremos el número de ciclistas que tiene el equipo (Valor
			// entre 1 y 3).
			System.out.println("¿Cuántos ciclistas tiene el equipo?(1/2/3)");
			numeroCiclistas = Entrada.entero();
			// Controlamos con un bucle while que el usuario introduzca un
			// número de 1 a 3 ciclistas
			while (numeroCiclistas <= 1 || numeroCiclistas > 3) {
				System.out.println("El número introducido " + numeroCiclistas
						+ " es erróneo vuelva a introducir un número que aparece en la pregunta:");

				numeroCiclistas = Entrada.entero();
			}
		} while (numeroCiclistas != 3);

		// Mediante un for solicitaremos los datos de los ciclistas, a los que
		// le asignaremos como equipo el objeto introducido anteriormente.
		for (int i = 0; i < numeroCiclistas; i++) {
			Ciclista ciclista1 = new Ciclista();

			System.out.println("Introduce el nombre del ciclista del equipo " + denominacionEquipo + ":");
			nombreCiclista = Entrada.cadena();
			System.out.println("Introduce la edad del ciclista del equipo " + denominacionEquipo + ":");
			edadCiclista = Entrada.entero();

			int dorsal = 123 + i;
			ciclista1.setDorsal(dorsal);
			ciclista1.setEdad(edadCiclista);
			ciclista1.setEquipo(equipo1);
			ciclista1.setNombre(nombreCiclista);
			conectarSesionFactory().persist(ciclista1);
		}
		conectarSesionFactory().getTransaction().commit();
		conectarSesionFactory().close();

	}

	// Creamos un método para insertar ciclistas
	public static void insertCiclista() {

		String nombreEquipo;
		String nombreCiclista;
		int edadCiclista;
		int dorsal;

		// Primero mostraremos los equipos que tenemos en la base de datos
		Iterator iter = conectarSesionFactory().createQuery("from Equipo").iterate();
		while (iter.hasNext()) {
			Equipo equ = (Equipo) iter.next(); // fetch the object
			// something we couldnt express in the query
			System.out.println("Datos" + equ.getNomequipo() + equ.getDirector());}
			System.out.println("Introduce el nombre exacto del equipo que quiere elegir.");
			nombreEquipo = Entrada.cadena();

			Equipo eq = (Equipo) conectarSesionFactory().get(Equipo.class, nombreEquipo);

			Ciclista ciclista1 = new Ciclista();

			System.out.println("Introduce el nombre del ciclista del equipo " + nombreEquipo + ":");
			nombreCiclista = Entrada.cadena();
			System.out.println("Introduce la edad del ciclista del equipo " + nombreEquipo + ":");
			edadCiclista = Entrada.entero();
			System.out.println("Introduce el dorsal del ciclista del equipo a partir del 150:");
			dorsal = Entrada.entero();

			ciclista1.setDorsal(dorsal);
			ciclista1.setEdad(edadCiclista);
			ciclista1.setEquipo(eq);
			ciclista1.setNombre(nombreCiclista);

			// haremos persistir a este objeto ciclista.
			conectarSesionFactory().beginTransaction();
			conectarSesionFactory().persist(ciclista1);
		
		// Realizamos commit y cerramos la clase Session Factory
		conectarSesionFactory().getTransaction().commit();
		conectarSesionFactory().close();

	}

	// Creamos un método para introducir las etapas

	public static void insertEtapas() {

		String nombreEquipo,nombreCiclista,salida,llegada;
		int edadCiclista,dorsal,numEtapa,numKm;
		
		Iterator iter = conectarSesionFactory().createQuery("from Ciclista").iterate();
		int cont = 0 ;
		 while ( iter.hasNext() & cont <10) {
		 Ciclista cicl = (Ciclista) iter.next(); // fetch the object
		 // something we couldnt express in the query
		 System.out.println("----------------------\nNombre: "+cicl.getNombre()+"\nDorsal: "+cicl.getDorsal());
		 cont ++;
		 }
		 System.out.println("Seleccione el numero de dorsal:");
		  dorsal = Entrada.entero();
		 Etapa etapa1 = new Etapa();
		 
		 System.out.println("Introduzca el numero de la etapa");
		 numEtapa=Entrada.entero();
		 etapa1.setNumetapa(numEtapa );
		 
		 Ciclista ciclista1 =  (Ciclista) conectarSesionFactory().get(Ciclista.class,dorsal);
		 etapa1.setCiclista(ciclista1);
		
		 System.out.println("Introduzca el numero kilómetros de la etapa:");
		 numKm=Entrada.entero();
		 etapa1.setKms(numKm);
		 
		 System.out.println("Introduzca la salida de la etapa");
		 salida=Entrada.cadena();
		 etapa1.setSalida(salida);
		 
		 System.out.println("Introduzca la llegada de la etapa");
		 llegada=Entrada.cadena();
		 etapa1.setLlegada(llegada);
		 
		 conectarSesionFactory().beginTransaction();
		 
		 conectarSesionFactory().persist(etapa1);
		 		 
		 conectarSesionFactory().getTransaction().commit();

		 conectarSesionFactory().close();
		 System.out.println("Etapa añadida.");

	}

}
