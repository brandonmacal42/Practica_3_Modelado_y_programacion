public class CabinaPequeña implements Cabina{
	
	String tipo = "";

	@Override
	public void crearCabina(){
		tipo = "Cabina pequeña";
	}

	@Override
	public void getTipo(){
		System.out.println("-" + tipo);
	}
}