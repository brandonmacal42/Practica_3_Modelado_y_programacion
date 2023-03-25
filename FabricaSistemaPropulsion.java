public class FabricaSistemaPropulsion extends AbstractFactory {

	@Override
	public Object getComponente(String tipoComponente) {
		return getSistemaPropulsion(tipoComponente);
	}

	public SistemaPropulsion getSistemaPropulsion(String SistemaPropulsion) {
		if (SistemaPropulsion == null) {
			return null;
		} else if (SistemaPropulsion.equalsIgnoreCase("interplanetario")) {
			return new PropulsionInterplanetaria();
		} else if (SistemaPropulsion.equalsIgnoreCase("intergalactico")) {
			return new PropulsionIntergalactica();
		} else if (SistemaPropulsion.equalsIgnoreCase("intercontinental")) {
			return new PropulsionIntercontinental();
		}
		return null;
	}
}