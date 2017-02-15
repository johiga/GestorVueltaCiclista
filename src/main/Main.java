package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		principal();
	}

	public static void principal() {
		int opcion = 0;
		// Creamos un menú para poder trabajar con la base de datos
		do {
			System.out.println("----------MENÚ----------");
			System.out.println("1-INSERTAR EQUIPO.");
			System.out.println("2-INSERTAR CICLISTAS.");
			System.out.println("3-INSERTAR ETAPAS.");
			System.out.println("4-CONSULTAR EQUIPOS.");
			System.out.println("5-CONSULTAR CICLISTAS.");
			System.out.println("6-CONSULTAR ETAPAS.");
			System.out.println("7-SALIR.");
			System.out.println("Introduzca el número de la opción del menú que desee.");
			opcion = Entrada.entero();
			while (opcion <= 0 || opcion > 7) {
				System.out.println("El número introducido " + opcion
						+ " es erróneo vuelva a introducir un número que aparece en el menú:");
				opcion = Entrada.entero();
			}
			switch (opcion) {
			case 1:
				InsertarDatos.insertarEquip();
				break;
			case 2:
				InsertarDatos.insertCiclista();

				break;
			case 3:
				InsertarDatos.insertEtapas();

				break;
			case 4:

				ConsultarDatos.consultarEquipo();

				break;
			case 5:

				break;
			case 6:

			case 7:
				// Salir
				JOptionPane.showMessageDialog(null, "Va a salir de la aplicación.");
				System.out.println("Ha cerrado la aplicación.");
				System.exit(0);
				break;

			default:

				break;
			}
		} while (opcion != 7);
	}

}
