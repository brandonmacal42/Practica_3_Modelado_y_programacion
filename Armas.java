public abstract class Armas implements Componente{

	@Override
	public abstract double precio();
	
	@Override
	public String toString() {
		return nombre() +  " |  $" + precio() + " | " + descripcion();
	}
}