public abstract class Blindaje implements Componentes{

	public String nombreBlindaje, descripcionBlindaje;
	public int AtaqueBlindaje, defensaBlindaje, velocidadBlindaje, pesoBlindaje;
	public double PrecioBlindaje;

	public String getNombre(){
		return nombreBlindaje;
	}

	public int Ataque(){
		return AtaqueBlindaje;
	}

    public int getDefensa(){
		return defensaBlindaje;
	}

    public int getVelocidad(){
		return velocidadBlindaje;
	}

    public int getPeso(){
		return pesoBlindaje;
	}

    public double getPrecio(){
		return PrecioBlindaje;
	}

	public String toString(){
		return descripcionBlindaje;
	}
}