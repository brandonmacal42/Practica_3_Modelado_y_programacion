public class FabricaCabina extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getLLanta(tipoComponente);
	}

	public Cabina getLLanta(String tipoLLanta){
		if(tipoLLanta == null){
			return null;
		} else if(tipoLLanta.equalsIgnoreCase("deportiva")){
			return new Cabina1piloto();
		} else if(tipoLLanta.equalsIgnoreCase("monstruo")){
			return new CabinaPequña();
		}
		return null;
	}	
}