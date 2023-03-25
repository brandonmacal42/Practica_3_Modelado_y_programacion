public class BlindajeFortaleza implements Blindaje{
	String tipo = "";
	@Override
	public void crearBlindaje() {
		tipo = "Blindaje Fortaleza";
	}

	@Override
	public void getTipo() {
		System.out.println(tipo);
	}
	
}
