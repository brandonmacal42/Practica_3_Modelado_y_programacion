public class ArmaLaserSimple extends Armas{
	@Override
	public double precio(){
		return 1590;
	}

	@Override
	public String nombre(){
		return "Arma laser simple";
	}

	@Override
	public String descripcion() {
		return "Arma laser que solo sirve para dañar pequeñas naves";
	}
	@Override 
	public int ataque(){
		return 10;
	}
}