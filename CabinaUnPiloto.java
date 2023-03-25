public class CabinaUnPiloto implements Cabina {

	String tipo = "";

	@Override
	public void crearCabina() {
		tipo = "Cabina un piloto";
	}

	@Override
	public void getTipo() {
		System.out.println(tipo);
	}
}