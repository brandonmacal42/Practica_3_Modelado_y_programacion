public class FabricaCabina extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getCabina(tipoComponente);
	}

	public Cabina getCabina(String tipoCabina){
		if(tipoCabina == null){
			return null;
		} else if(tipoCabina.equalsIgnoreCase("piloto")){
			return new CabinaUnPiloto();
		} else if(tipoCabina.equalsIgnoreCase("pequeña")){
			return new CabinaPequeña();
		}else if(tipoCabina.equalsIgnoreCase("ejercito")){
			return new CabinaEjercito();
		}
		return null;
	}	
}