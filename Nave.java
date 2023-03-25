public class Nave{
	private Cabina cabina;
	private Blindaje blindaje;
	private SistemaPropulsion sistemaPropulsion;
	private Armas armas;
	public Nave(Cabina cabina, Blindaje blindaje, SistemaPropulsion sistemaPropulsion, Armas armas){
		this.cabina = cabina;
		this.blindaje =blindaje;
		this.sistemaPropulsion = sistemaPropulsion;
		this.armas = armas;
	}

	public void muestraNave(){
		System.out.println("La nave construida es la siguiente: ");
		cabina.getTipo();
		blindaje.getTipo();
		sistemaPropulsion.getTipo();
		armas.getTipo();
	}
}