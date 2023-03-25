public class BlindajeReforzado implements Blindaje{
	
	String tipo = "";

	@Override
	public void crearBlindaje(){
		tipo = "Carroceria monstruo";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}