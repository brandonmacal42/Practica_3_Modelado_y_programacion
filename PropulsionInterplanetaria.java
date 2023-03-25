public class PropulsionInterplanetaria implements SistemaPropulsion{
	
	String tipo = "";

	@Override
	public void crearSistemaPropulsion(){
		tipo = "Motor deportivo";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}