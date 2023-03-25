public class PropulsionIntergalactica implements SistemaPropulsion{
	
	String tipo = "";

	@Override
	public void crearSistemaPropulsion(){
		tipo = "Sistema de propulsion intergalactico";
	}

	@Override
	public void getTipo(){
		System.out.println("-" + tipo);
	}
}