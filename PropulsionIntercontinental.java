public class PropulsionIntercontinental implements SistemaPropulsion{
	
	String tipo = "";

	@Override
	public void crearSistemaPropulsion(){
		tipo = "Sistema de propulsion intercontinental";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}