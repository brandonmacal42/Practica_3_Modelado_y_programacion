public class CheemsMecanico{
	
	public static AbstractFactory getFactory(String opcion){
		if(opcion.equalsIgnoreCase("cabina")){
			return new FabricaCabina();
		} else if(opcion.equalsIgnoreCase("blindaje")){
			return new FabricaBlindaje();
		} else if(opcion.equalsIgnoreCase("motor")){
			return new FabricaSistemaPropulsion();
		}
		return null;
	}
}