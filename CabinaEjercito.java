public class CabinaEjercito implements Cabina{
	
	String tipo = "";

	@Override
	public void crearCabina(){
		tipo = "Cabina ejercito";
	}

	@Override
	public void getTipo(){
		System.out.println(tipo);
	}
}