public class BlindajeSimple implements Blindaje{
	
	String tipo = "";

	@Override
	public void crearBlindaje(){
		tipo = "Blindaje simple";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}