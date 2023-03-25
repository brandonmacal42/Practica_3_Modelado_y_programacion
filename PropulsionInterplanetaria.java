public class PropulsionInterplanetaria implements SistemaPropulsion{
	
	String tipo = "";

	@Override
	public void crearSistemaPropulsion(){
		tipo = "Sistema de proulsion interplanetario";
	}

	@Override
	public void getTipo(){
		System.out.println("-" + tipo);
	}
}