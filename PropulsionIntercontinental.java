public class PropulsionIntercontinental extends SistemaPropulsion{
	@Override
	public double precio(){
		return 15.5;
	}

	@Override
	public String nombre(){
		return "Sistema de propulsion intercontinental";
	}

	@Override
	public String descripcion() {
		return "Sistema de propulsion para hacer viajes cortos sin poder viajer de planeta a planeta";
	}
}
