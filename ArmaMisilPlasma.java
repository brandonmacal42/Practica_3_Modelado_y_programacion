public class ArmaMisilPlasma extends Armas {
	@Override
	public double precio(){
		return 1720;
	}

	@Override
	public String nombre(){
		return "Arma misil de plasma";
	}

	@Override
	public String descripcion() {
		return "Arma misil capas de dañar un blindaje reforzado";
	}
	@Override 
	public int ataque(){
		return 550;
	}
}
