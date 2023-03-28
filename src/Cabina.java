public abstract class Cabina implements Componentes{

	public String nombreCabina, descripcionCabina;
	public int AtaqueCabina, defensaCabina, velocidadCabina, pesoCabina;
	public double PrecioCabina;

	public String getNombre(){
		return nombreCabina;
	}

	public int Ataque(){
		return AtaqueCabina;
	}

    public int getDefensa(){
		return defensaCabina;
	}

    public int getVelocidad(){
		return velocidadCabina;
	}

    public int getPeso(){
		return pesoCabina;
	}

    public double getPrecio(){
		return PrecioCabina;
	}

	public String toString(){
		return descripcionCabina;
	}
}