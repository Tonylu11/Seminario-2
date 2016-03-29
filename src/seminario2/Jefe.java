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
