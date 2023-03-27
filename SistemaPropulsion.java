public abstract class SistemaPropulsion implements Componente{

	@Override
	public abstract double precio();
	
	@Override 
	public String toString(){
		return nombre() +  " |  $" + precio() + " | " + descripcion();
	}
	public abstract int velocidad();

}
