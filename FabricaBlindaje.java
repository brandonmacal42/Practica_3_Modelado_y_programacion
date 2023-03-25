public class FabricaBlindaje extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getBlindaje(tipoComponente);
	}

	public Blindaje getBlindaje(String tipoBlindaje){
		if(tipoBlindaje == null){
			return null;
		} else if(tipoBlindaje.equalsIgnoreCase("simple")){
			return new BlindajeSimple();
		} else if(tipoBlindaje.equalsIgnoreCase("reforzado")){
			return new BlindajeReforzado();
		}else if(tipoBlindaje.equalsIgnoreCase("fortaleza")){
			return new BlindajeFortaleza();
		}
		return null;
	}
}