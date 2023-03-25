public class BlindajeReforzado implements Blindaje{
	
	String tipo = "";

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje reforzado";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}