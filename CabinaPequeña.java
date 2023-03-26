public class CabinaPequeña extends Cabina{
	@Override
	public double precio(){
		return 15.5;
	}

	@Override
	public String nombre(){
		return "Cabina pequeña";
	}

	@Override
	public String descripcion() {
		return "Cabina pequeña capaz de transportar a un pequeño escuadron";
	}
}