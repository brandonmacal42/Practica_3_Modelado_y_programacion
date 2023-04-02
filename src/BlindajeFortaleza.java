/*
 * Clase que con la que se construye el componente blindaje de fortaleza, esta extiende de Blindaje
 */
public class BlindajeFortaleza extends Blindaje{

/**
 * Metodo constructor
 */
	public BlindajeFortaleza(){
		nombreBlindaje = "Blindaje Fortaleza";
		AtaqueBlindaje = 0;
		defensaBlindaje = 40000;
		velocidadBlindaje = 0;
		pesoBlindaje = 15000; 
		PrecioBlindaje = 25000.00;
		descripcionBlindaje = nombreBlindaje + ", Ataque: " + AtaqueBlindaje + ", \n Defensa: " + defensaBlindaje + ", \n Velocidad: " + velocidadBlindaje + ", \n Peso: " + pesoBlindaje + ", \n Precio: $" + PrecioBlindaje;
	}

}