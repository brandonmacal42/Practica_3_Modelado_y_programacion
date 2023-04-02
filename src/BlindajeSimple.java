/*
 * Clase que con la que se construye el componente blindaje simple, esta extiende de Blindaje
 */
public class BlindajeSimple extends Blindaje{

	/**
	 * Metodo constructor
	 */
	public BlindajeSimple(){
		nombreBlindaje = "Blindaje Simple";
		AtaqueBlindaje = 0;
		defensaBlindaje = 10000;
		velocidadBlindaje = 0;
		pesoBlindaje = 5000; 
		PrecioBlindaje = 10000.00;
		descripcionBlindaje = nombreBlindaje + ", Ataque: " + AtaqueBlindaje + ", \n Defensa: " + defensaBlindaje + ", \n Velocidad: " + velocidadBlindaje + ", \n Peso: " + pesoBlindaje + ", \n Precio: $" + PrecioBlindaje;
	}

}
