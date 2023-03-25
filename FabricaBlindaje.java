public class FabricaBlindaje extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getBlindaje(tipoComponente);
	}

	public Blindaje getBlindaje(String tipoBlindaje){
		if(tipoBlindaje == null){
			return null;
		} else if(tipoBlindaje.equalsIgnoreCase("deportiva")){
			return new BlindajeSimple();
		} else if(tipoBlindaje.equalsIgnoreCase("monstruo")){
			return new BlindajeReforzado();
		}
		return null;
	}
}