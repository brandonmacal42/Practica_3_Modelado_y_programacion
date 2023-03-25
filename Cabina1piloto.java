public class Cabina1piloto implements Cabina{
	
	String tipo = "";

	@Override
	public void crearCabina(){
		tipo = "LLanta deportiva";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}