/*
 * Clase que permite construir todos los componentes de tipo Blindaje , esta implementa la clase componentes
 */
public abstract class Blindaje implements Componentes {

	public String nombreBlindaje, descripcionBlindaje;
	public int AtaqueBlindaje, defensaBlindaje, velocidadBlindaje, pesoBlindaje;
	public double PrecioBlindaje;

	/**
	 * Funcion que regresa el nombre del blindaje
	 * 
	 * @return nombreBlindaje (String)
	 */
	public String getNombre() {
		return nombreBlindaje;
	}

	/**
	 * Funcion que regresa el ataque del blindaje
	 * 
	 * @return ataqueBlindaje (String)
	 */
	public int getAtaque() {
		return AtaqueBlindaje;
	}

	/**
	 * Funcion que regresa la defensa del Blindaje
	 * 
	 * @return defensaBlindaje (int)
	 */
	public int getDefensa() {
		return defensaBlindaje;
	}

	/**
	 * Funcion que regresa la velocidad del Blindaje
	 * 
	 * @return velocidadBlindaje (int)
	 */
	public int getVelocidad() {
		return velocidadBlindaje;
	}

	/**
	 * Funcion que regresa el peso del Blindaje
	 * 
	 * @return pesoBlindaje (int)
	 */
	public int getPeso() {
		return pesoBlindaje;
	}

	/**
	 * Funcion que regresa el precio del Blindaje
	 * 
	 * @return precioBlindaje (double)
	 */
	public double getPrecio() {
		return PrecioBlindaje;
	}

	/**
	 * Funcion que regresa la descripcion del Blindaje
	 * 
	 * @return descripcionBlindaje (String)
	 */
	public String toString() {
		return descripcionBlindaje;
	}
}