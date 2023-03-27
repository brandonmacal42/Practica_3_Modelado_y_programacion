public abstract class Cabina implements Componente{

	@Override
	public abstract double precio();

	@Override 
	public String toString(){
		return nombre() +  " |  $" + precio() + " | " + descripcion();
	}

	public abstract int peso();
}