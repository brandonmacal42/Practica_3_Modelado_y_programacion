/**
 * ArmaLaserSimple
 */
public class ArmaLaserSimple implements Armas{
 String tipo = "";
	@Override
	public void crearArmas() {
		tipo ="Arma laser simple";
	}

	@Override
	public void getTipo() {
		System.out.println("-" + tipo);
	}

	
}