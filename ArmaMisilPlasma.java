/**
 * ArmaMisilPlasma
 */
public class ArmaMisilPlasma implements Armas{
String tipo = "";
	@Override
	public void crearArmas() {
		tipo = "Arma misil de plasma";
	}

	@Override
	public void getTipo() {
		System.out.println("-" + tipo);
	}

	
}