public abstract class Armas implements Componentes{
	
	public String nombreArma, descripcionArma;
	public int AtaqueArma, defensaArma, velocidadArma, pesoArma;
	public double PrecioArma;

	public String getNombre(){
		return nombreArma;
	}

	public int getAtaque(){
		return AtaqueArma;
	}

    public int getDefensa(){
		return defensaArma;
	}

    public int getVelocidad(){
		return velocidadArma;
	}

    public int getPeso(){
		return pesoArma;
	}

    public double getPrecio(){
		return PrecioArma;
	}

	public String toString(){
		return descripcionArma;
	}
}
