public class CabinaPequeña extends Cabina{
	@Override
	public double precio(){
		return 1550;
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