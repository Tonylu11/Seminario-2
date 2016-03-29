package seminario2;

/**
 * Realiza el siguiente seminario y entrega el código generado. Tratarás los
 * siguientes temas:
 * 
 * Herencia: Superclase o clase padre y subclase o clase hija: Empleado, Jefe,
 * Administrativo. Reutilización de: Atributos y métodos: getSalario()
 * Constructores no se heredan, se reutilizan Uso del constructor del padre:
 * super(); Redefinición de métodos Uso de la versión del padre:
 * super.getSalario(), super.toString() Igual o mayor visibilidad Visibilidad
 * protected: accesible en la misma clase, paquete y clase que lo hereda (a
 * través de la herencia) Polimorfismo Compatibilidad de tipos Tipo estático (el
 * de la referencia) Tipo dinámico (el del objeto al que apunta) Clase Object
 * Método getClass (tipo dinámico Class) Método toString (public,
 * super.toString(), redefinición, getClass()) Método Equals (public, patrón de
 * implementación, tipo de igualdad superficial con ==, en profundidad con
 * equals, ó mixta, Método Clone (protected, constructor de copia, Cloneable,
 * copia superficial o profunda)
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class PruebaEmpleados {
	public static void main(String[] args) {
		Empleado empleado = new Empleado("Juan", 1000, 2001);// Crea objeto
																// empleado.
		if (empleado instanceof Jefe) {// Comprueba si el empleado pertenece a
										// la clase Jefe.
			Jefe jefe = (Jefe) empleado;// casting para empleado del objeto
										// jefe.
			jefe.setBonificacion(0.7f);// modifica la bonificacion de jefe.
			System.out.println(jefe.getNombre());// Muestra el nombre del jefe
													// si lo hubiera.
		} else
			System.out.println("El empleado no es un jefe");
		if (empleado.getClass() == Jefe.class) {// Comprueba si la clase de
												// empleado pertenece a la de
												// Jefe.
			Jefe jefe4 = (Jefe) empleado;// casting para empleado del objeto
											// jefe.
			jefe4.setBonificacion(0.7f);// modifica la bonificacion de jefe.
			System.out.println(jefe4.getNombre());// Muestra el nombre del jefe
													// si lo hubiera.
		} else
			System.out.println("El empleado no es un jefe");
		System.out.println("Empleado: " + empleado.getNombre());
		Jefe jefe = new Jefe("Pedro", 1200, 1999, 0.5f);
		System.out.println("Jefe: " + jefe.getNombre());
		System.out.println(jefe.getDescripcion());
		empleado.nombre = "Enrique";
		Administrativo admin = new Administrativo("Pedro", 900, 2003, jefe);
		System.out.println("Administrativo: " + admin.getNombre());
		System.out.println("Gana: " + admin.getSalario());
		System.out.println(empleado.getClass());
		empleado = new Jefe("Pedro", 1200, 1999, 0.5f);
		if (empleado instanceof Jefe) {// Comprueba si el empleado pertenece a
										// la clase Jefe.
			Jefe jefe3 = (Jefe) empleado;// casting para empleado del objeto
											// jefe.
			jefe3.setBonificacion(0.7f);// modifica la bonificacion de jefe.
			System.out.println(jefe3.getNombre() + " Jefe 3");// Muestra el
																// nombre del
																// jefe
																// si lo
																// hubiera.
		} else
			System.out.println("El empleado no es un jefe");
		if (empleado.getClass() == Jefe.class) {
			Jefe jefe4 = (Jefe) empleado;
			jefe4.setBonificacion(0.7f);
			System.out.println(jefe4.getNombre());
		} else
			System.out.println("El empleado no es un jefe");
		System.out.println(empleado.getClass());
		Jefe jefe2 = (Jefe) empleado;
		jefe2.setBonificacion(0.7f);
		System.out.println(jefe2.getNombre());
		Object obj = new Empleado("Juan", 1000, 2001);
		Empleado empleado2 = (Empleado) obj;
		empleado.getNombre();
		arrayEmpleados();
	}

	private static void arrayEmpleados() {
		Empleado[] empleados = new Empleado[3];
		empleados[0] = new Empleado("Juan", 1000, 2001);
		Jefe jefe = new Jefe("Pedro", 1200, 1999, 0.5f);
		empleados[1] = jefe;
		empleados[2] = new Administrativo("Enrique", 900, 2003, jefe);
		for (Empleado empleado : empleados) {
			System.out.println("Soy " + empleado.getNombre() + " y gano " + empleado.getSalario());
		}
		for (Empleado empleado : empleados) {
			if (empleado instanceof Jefe) {
				Jefe jefe2 = (Jefe) jefe;
				jefe.setBonificacion(0.8f);
				System.out.println("Bonificación para: " + jefe.getNombre());
			}
		}
	}
}
