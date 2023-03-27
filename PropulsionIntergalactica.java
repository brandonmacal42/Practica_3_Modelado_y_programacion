public class PropulsionIntergalactica extends SistemaPropulsion{
	@Override
	public double precio(){
		return 15.5;
	}

	@Override
	public String nombre(){
		return "Sistema de propulsion intergalactico";
	}

	@Override
	public String descripcion() {
		return "Sistema de Propulsion intergalactico capaz de viajar a cualquier parte de la galaxia";
	}
	@Override
	public int velocidad(){
		return 12220;
	}
}
