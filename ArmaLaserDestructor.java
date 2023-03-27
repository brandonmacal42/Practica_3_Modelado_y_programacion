public class ArmaLaserDestructor extends Armas{
	@Override
	public double precio(){
		return 4500;
	}

	@Override
	public String nombre(){
		return "Arma laser destructor de planetas";
	}

	@Override
	public String descripcion() {
		return "Arma laser con un poder inmenso capas de destruir un planeta";
	}

	@Override 
	public int ataque(){
		return 120;
	}
}