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
public class Administrativo extends Empleado {
	/**
	 * Factor de la clase Administrativo.
	 */
	private static final float FACTOR = 0.1f;
	/**
	 * Jefe de el administrativo.
	 */
	private Jefe jefe;

	/**
	 * Constructor de la clase Administrativo
	 * 
	 * @param nombre
	 *            Nombre del empleado.
	 * @param salario
	 *            Salario de empleado.
	 * @param anyoAlta
	 *            A&ntilde;o de alta del empleado.
	 * @param jefe
	 *            Jefe del administrativo.
	 */
	public Administrativo(String nombre, float salario, int anyoAlta, Jefe jefe) {
		super(nombre, salario, anyoAlta);
		this.jefe = jefe;
	}

	public Jefe getJefe() {
		return jefe;
	}

	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}

	/**
	 * Calcula el salario del administrativo.
	 */
	public float getSalario() {
		return super.getSalario() + super.getSalario() * jefe.getBonificacion() * FACTOR;
	}

}
