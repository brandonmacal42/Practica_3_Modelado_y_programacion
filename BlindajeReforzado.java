public class BlindajeReforzado extends Blindaje{
	@Override
	public double precio(){
		return 2550;
	}

	@Override
	public String nombre(){
		return "Blindaje reforzado";
	}

	@Override
	public String descripcion() {
		return "Blindaje reforzado capaz de resistir algunos misiles de plasma";
	}
	
	@Override 
	public int defensa(){
		return 100;
	}
}