public class CabinaPequña implements Cabina{
	
	String tipo = "";

	@Override
	public void crearCabina(){
		tipo = "LLanta monstruo";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}