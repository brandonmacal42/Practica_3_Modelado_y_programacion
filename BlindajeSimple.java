public class BlindajeSimple extends Blindaje{
	@Override
	public double precio(){
		return 2000;
	}

	@Override
	public String nombre(){
		return "Blindaje simple";
	}

	@Override
	public String descripcion() {
		return "Blindaje que solo resiste disparos de laseres simples";
	}
	
	@Override
	public int defensa(){
		return 500;
	}
}
