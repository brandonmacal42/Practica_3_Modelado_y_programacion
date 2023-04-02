/*
 * Clase que permite construir todos los componentes de tipo Arma , esta implementa la clase componentes
 */
public abstract class Armas implements Componentes {
	public String nombreArma, descripcionArma;
	public int AtaqueArma, defensaArma, velocidadArma, pesoArma;
	public double PrecioArma;

	/**
	 * Funcion que regresa el nombre del arma
	 * 
	 * @return nombreArma (String)
	 */
	public String getNombre() {
		return nombreArma;
	}

	/**
	 * Funcion que regresa el ataque del arma
	 * 
	 * @return ataqueArma (int)
	 */
	public int getAtaque() {
		return AtaqueArma;
	}

	/**
	 * Funcion que regresa la defensa del arma
	 * 
	 * @return defensaArma (int)
	 */
	public int getDefensa() {
		return defensaArma;
	}

	/**
	 * Funcion que regresa la velocidad del arma
	 * 
	 * @return velocidadArma (int)
	 */
	public int getVelocidad() {
		return velocidadArma;
	}

	/**
	 * Funcion que regresa el peso del arma
	 * 
	 * @return pesoArma (int)
	 */
	public int getPeso() {
		return pesoArma;
	}

	/**
	 * Funcion que regresa el precio del arma
	 * 
	 * @return precioArma (double)
	 */
	public double getPrecio() {
		return PrecioArma;
	}

	/**
	 * Funcion que regresa la descripcion del arma
	 * 
	 * @return descripcionArma (String)
	 */
	public String toString() {
		return descripcionArma;
	}
}
