public class FabricaSistemaPropulsion extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getSistemaPropulsion(tipoComponente);
	}

	public SistemaPropulsion getSistemaPropulsion(String SistemaPropulsion){
		if(SistemaPropulsion == null){
			return null;
		} else if(SistemaPropulsion.equalsIgnoreCase("deportivo")){
			return new PropulsionInterplanetaria();
		} else if(SistemaPropulsion.equalsIgnoreCase("monstruo")){
			return new PropulsionIntergalactica();
		}
		return null;
	}	
}