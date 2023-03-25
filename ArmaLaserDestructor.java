public class ArmaLaserDestructor implements Armas {
	String tipo ="";
	@Override
	public void crearArmas() {
		tipo = "Arma laser destructor de planetas";
	}

	@Override
	public void getTipo() {
		System.out.println("-" + tipo);
	}
	
}
