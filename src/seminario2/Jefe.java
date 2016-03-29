package seminario2;

/**
 * Realiza el siguiente seminario y entrega el c�digo generado. Tratar�s los
 * siguientes temas:
 * 
 * Herencia: Superclase o clase padre y subclase o clase hija: Empleado, Jefe,
 * Administrativo. Reutilizaci�n de: Atributos y m�todos: getSalario()
 * Constructores no se heredan, se reutilizan Uso del constructor del padre:
 * super(); Redefinici�n de m�todos Uso de la versi�n del padre:
 * super.getSalario(), super.toString() Igual o mayor visibilidad Visibilidad
 * protected: accesible en la misma clase, paquete y clase que lo hereda (a
 * trav�s de la herencia) Polimorfismo Compatibilidad de tipos Tipo est�tico (el
 * de la referencia) Tipo din�mico (el del objeto al que apunta) Clase Object
 * M�todo getClass (tipo din�mico Class) M�todo toString (public,
 * super.toString(), redefinici�n, getClass()) M�todo Equals (public, patr�n de
 * implementaci�n, tipo de igualdad superficial con ==, en profundidad con
 * equals, � mixta, M�todo Clone (protected, constructor de copia, Cloneable,
 * copia superficial o profunda)
 * 
 * @author Antonio Luque Bravo
 * @version 1.0
 *
 */
public class Jefe extends Empleado {
	/**
	 * Bonificaci&oacute;n del Jefe.
	 */
	private float bonificacion;

	/**
	 * Constructor de la clase Jefe.
	 * 
	 * @param nombre
	 *            Nombre del empleado.
	 * @param salario
	 *            Salario del empleado
	 * @param anyoAlta
	 *            a&ntilde;o de alta del empleado.
	 * @param bonificacion
	 *            Bonificaci&oacute;n del Jefe.
	 */
	public Jefe(String nombre, float salario, int anyoAlta, float bonificacion) {
		super(nombre, salario, anyoAlta);
		this.bonificacion = bonificacion;
		setNombre(nombre);
	}

	/**
	 * Muestra una descripci&oacute;n del jefe.
	 * 
	 * @return Devuelve una cadena con un mensaje.
	 */
	public String getDescripcion() {
		return "Soy " + getNombre() + " y gano " + getSalario();
	}

	public float getSalario() {
		return super.getSalario() + super.getSalario() * bonificacion;
	}

	public float getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(float bonificacion) {
		this.bonificacion = bonificacion;
	}
}
