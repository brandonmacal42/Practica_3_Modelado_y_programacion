public class FabricaCabina extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getCabina(tipoComponente);
	}

	public Cabina getCabina(String tipoCabina){
		if(tipoCabina == null){
			return null;
		} else if(tipoCabina.equalsIgnoreCase("deportiva")){
			return new CabinaUnPiloto();
		} else if(tipoCabina.equalsIgnoreCase("monstruo")){
			return new CabinaPequeña();
		}
		return null;
	}	
}