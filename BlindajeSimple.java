public class BlindajeSimple implements Blindaje{
	
	String tipo = "";

	@Override
	public void crearBlindaje(){
		tipo = "Carroceria deportiva";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}