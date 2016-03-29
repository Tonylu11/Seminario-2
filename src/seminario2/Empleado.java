package seminario2;

public class Empleado {
	/**
	 * Nombre del empleado.
	 */
	protected String nombre;
	/**
	 * Salario del empleado.
	 */
	private float salario;
	/**
	 * A&ntilde;o de alta del empleado.
	 */
	private int anyoAlta;

	/**
	 * Constructor de la clase Empleado.
	 * 
	 * @param nombre
	 *            Nombre del empleado.
	 * @param salario
	 *            Salario del empleado.
	 * @param anyoAlta
	 *            A&ntilde;o de alta del empleado.
	 */
	public Empleado(String nombre, float salario, int anyoAlta) {
		setNombre(nombre);
		setAnyoAlta(anyoAlta);
		setSalario(salario);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getAnyoAlta() {
		return anyoAlta;
	}

	public void setAnyoAlta(int anyoAlta) {
		this.anyoAlta = anyoAlta;
	}

	/**
	 * Incrementa el salario con una subida.
	 * 
	 * @param subida
	 *            Incremento en el saldo.
	 */
	public void incSalario(float subida) {
		salario += subida;
	}
}
