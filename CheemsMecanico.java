public class CheemsMecanico{
	
	public static AbstractFactory getFactory(String opcion){
		if(opcion.equalsIgnoreCase("llanta")){
			return new FabricaCabina();
		} else if(opcion.equalsIgnoreCase("carroceria")){
			return new FabricaBlindaje();
		} else if(opcion.equalsIgnoreCase("motor")){
			return new FabricaMotores();
		}
		return null;
	}
}