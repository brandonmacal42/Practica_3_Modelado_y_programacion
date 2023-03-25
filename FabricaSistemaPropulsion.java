public class FabricaSistemaPropulsion extends AbstractFactory {

	@Override
	public Object getComponente(String tipoComponente) {
		return getSistemaPropulsion(tipoComponente);
	}

	public SistemaPropulsion getSistemaPropulsion(String SistemaPropulsion) {
		if (SistemaPropulsion == null) {
			return null;
		} else if (SistemaPropulsion.equalsIgnoreCase("interplanetaria")) {
			return new PropulsionInterplanetaria();
		} else if (SistemaPropulsion.equalsIgnoreCase("intergalactica")) {
			return new PropulsionIntergalactica();
		} else if (SistemaPropulsion.equalsIgnoreCase("intercontinental")) {
			return new PropulsionIntercontinental();
		}
		return null;
	}
}