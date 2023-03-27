public class CabinaUnPiloto extends Cabina{
	@Override
	public double precio(){
		return 15.5;
	}

	@Override
	public String nombre(){
		return "Cabina de un piloto";
	}

	@Override
	public String descripcion() {
		return "Cabina para un solo piloto";
	}
	
	@Override
	public int peso(){
		return 100;
	}
}