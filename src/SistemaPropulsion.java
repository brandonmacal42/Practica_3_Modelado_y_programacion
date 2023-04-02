/*
 * Clase que permite construir todos los componentes de tipo sistema de propulsion , esta implementa la clase componentes
 */
public abstract class SistemaPropulsion implements Componentes{

	public String nombrePropulsion, descripcionPropulsion;
	public int AtaquePropulsion, defensaPropulsion, velocidadPropulsion, pesoPropulsion;
	public double PrecioPropulsion;


	/**
	 * Funcion que regresa el nombre del sistema de propulsion
	 * 
	 * @return nombrePropulsion (String)
	 */
	public String getNombre(){
		return nombrePropulsion;
	}

/**
	 * Funcion que regresa el ataque del sistema de propulsion
	 * 
	 * @return ataquePropulsion (String)
	 */
	public int getAtaque(){
		return AtaquePropulsion;
	}

		/**
	 * Funcion que regresa la defensa del sistema de propulsion
	 * 
	 * @return defensaPropulsion (int)
	 */
    public int getDefensa(){
		return defensaPropulsion;
	}

		/**
	 * Funcion que regresa la velocidad del sistema de propulsion
	 * 
	 * @return velocidadPropulsion (int)
	 */
    public int getVelocidad(){
		return velocidadPropulsion;
	}

	/**
	 * Funcion que regresa el peso del sistema de propulsion
	 * 
	 * @return pesoPropulsion (int)
	 */
    public int getPeso(){
		return pesoPropulsion;
	}

		/**
	 * Funcion que regresa el precio del sistema de propulsion
	 * 
	 * @return precioPropulsion (double)
	 */
    public double getPrecio(){
		return PrecioPropulsion;
	}

	/**
	 * Funcion que regresa la descripcion del sistema de propulsion
	 * 
	 * @return descripcionPropulsion (String)
	 */
	public String toString(){
		return descripcionPropulsion;
	}

}
