public class CabinaEjercito extends Cabina{
	@Override
	public double precio(){
		return 17;
	}

	@Override
	public String nombre(){
		return "Cabina ejercito";
	}

	@Override
	public String descripcion() {
		return "Cabina hecha para poder transportar toda una gran flota o ejercito";
	}
}