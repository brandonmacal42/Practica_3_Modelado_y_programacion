public class BlindajeReforzado implements Blindaje{
	
	String tipo = "";

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje Reforzado";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}