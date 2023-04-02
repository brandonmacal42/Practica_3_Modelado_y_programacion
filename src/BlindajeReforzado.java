/*
 * Clase que con la que se construye el componente blindaje reforzado, esta extiende de Blindaje
 */
public class BlindajeReforzado extends Blindaje {

	/**
	 * Metodo constructor
	 */
	public BlindajeReforzado() {
		nombreBlindaje = "Blindaje Reforzado";
		AtaqueBlindaje = 0;
		defensaBlindaje = 80000;
		velocidadBlindaje = 0;
		pesoBlindaje = 30000;
		PrecioBlindaje = 60000.00;
		descripcionBlindaje = nombreBlindaje + ", Ataque: " + AtaqueBlindaje + ", \n Defensa: " + defensaBlindaje
				+ ", \n Velocidad: " + velocidadBlindaje + ", \n Peso: " + pesoBlindaje + ", \n Precio: $"
				+ PrecioBlindaje;
	}

}