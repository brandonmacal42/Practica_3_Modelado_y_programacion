/*
 * Clase que permite construir todos los componentes de tipo sistema de propulsion , esta implementa la clase componentes
 */
public abstract class SistemaPropulsion implements Componentes{

	public String nombrePropulsion, descripcionPropulsion;
	public int AtaquePropulsion, defensaPropulsion, velocidadPropulsion, pesoPropulsion;
	public double PrecioPropulsion;

	public String getNombre(){
		return nombrePropulsion;
	}

	public int getAtaque(){
		return AtaquePropulsion;
	}

    public int getDefensa(){
		return defensaPropulsion;
	}

    public int getVelocidad(){
		return velocidadPropulsion;
	}

    public int getPeso(){
		return pesoPropulsion;
	}

    public double getPrecio(){
		return PrecioPropulsion;
	}

	public String toString(){
		return descripcionPropulsion;
	}

}
