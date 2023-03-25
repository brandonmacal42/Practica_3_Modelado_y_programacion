public class FabricaSistemaPropulsion extends AbstractFactory{
	
	@Override
	public Object getComponente(String tipoComponente){
		return getSistemaPropulsion(tipoComponente);
	}

	public SistemaPropulsion getSistemaPropulsion(String tipoMotor){
		if(tipoMotor == null){
			return null;
		} else if(tipoMotor.equalsIgnoreCase("deportivo")){
			return new PropulsionInterplanetaria();
		} else if(tipoMotor.equalsIgnoreCase("monstruo")){
			return new PropulsionIntergalactica();
		}
		return null;
	}	
}