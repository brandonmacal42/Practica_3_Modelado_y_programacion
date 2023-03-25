public class Nave{
	private Cabina cabina;
	private Blindaje blindaje;
	private SistemaPropulsion sistemaPropulsion;

	public Nave(Cabina cabina, Blindaje blindaje, SistemaPropulsion sistemaPropulsion){
		this.cabina = cabina;
		this.blindaje =blindaje;
		this.sistemaPropulsion = sistemaPropulsion;
	}

	public void muestraNave(){
		System.out.println("La nave construido es el siguiente: ");
		cabina.getTipo();
		blindaje.getTipo();
		sistemaPropulsion.getTipo();
	}
}