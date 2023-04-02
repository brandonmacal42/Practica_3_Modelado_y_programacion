/*
 * Clase que permite construir todos los componentes de tipo Cabina , esta implementa la clase componentes
 */
public abstract class Cabina implements Componentes {

	public String nombreCabina, descripcionCabina;
	public int AtaqueCabina, defensaCabina, velocidadCabina, pesoCabina;
	public double PrecioCabina;

	/**
	 * Funcion que regresa el nombre del Cabina
	 * 
	 * @return nombreCabina (String)
	 */
	public String getNombre() {
		return nombreCabina;
	}

	/**
	 * Funcion que regresa el ataque del Cabina
	 * 
	 * @return ataqueCabina (String)
	 */
	public int getAtaque() {
		return AtaqueCabina;
	}

	/**
	 * Funcion que regresa la defensa del Cabina
	 * 
	 * @return defensaCabina (int)
	 */
	public int getDefensa() {
		return defensaCabina;
	}

	/**
	 * Funcion que regresa la velocidad del Cabina
	 * 
	 * @return velocidadCabina (int)
	 */
	public int getVelocidad() {
		return velocidadCabina;
	}

	/**
	 * Funcion que regresa el peso del Cabina
	 * 
	 * @return pesoCabina (int)
	 */
	public int getPeso() {
		return pesoCabina;
	}

	/**
	 * Funcion que regresa el precio del Cabina
	 * 
	 * @return precioCabina (double)
	 */
	public double getPrecio() {
		return PrecioCabina;
	}

	/**
	 * Funcion que regresa la descripcion del Cabina
	 * 
	 * @return descripcionCabina (String)
	 */
	public String toString() {
		return descripcionCabina;
	}
}