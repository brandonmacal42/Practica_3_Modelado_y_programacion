/*
 * Clase que con la que se construye el componente cabina para un ejercito, esta extiende de cabina
 */
public class CabinaEjercito extends Cabina {

	/**
	 * Metodo constructor
	 */
	public CabinaEjercito() {
		nombreCabina = "Cabina Ejercito";
		AtaqueCabina = 0;
		defensaCabina = 0;
		velocidadCabina = 0;
		pesoCabina = 3500;
		PrecioCabina = 20000.00;
		descripcionCabina = nombreCabina + ", Ataque: " + AtaqueCabina + ", \n Defensa: " + defensaCabina
				+ ", \n Velocidad: " + velocidadCabina + ", \n Peso: " + pesoCabina + ", \n Precio: $" + PrecioCabina;
	}
}