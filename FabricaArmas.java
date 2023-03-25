public class FabricaArmas extends AbstractFactory {

	@Override
	Object getComponente(String tipoComponente) {
		if(tipoComponente == null){
			return null;
		}else if(tipoComponente.equalsIgnoreCase("simple")){
			return new ArmaLaserSimple();
		}else if(tipoComponente.equalsIgnoreCase("plasma")){
			return new ArmaMisilPlasma();
		}else if(tipoComponente.equalsIgnoreCase("destructor")){
			return new ArmaLaserDestructor();
		}
		return null;
	}
	
}
