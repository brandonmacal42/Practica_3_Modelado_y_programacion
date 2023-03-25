public class PropulsionIntergalactica implements SistemaPropulsion{
	
	String tipo = "";

	@Override
	public void crearSistemaPropulsion(){
		tipo = "Motor monstruo";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}