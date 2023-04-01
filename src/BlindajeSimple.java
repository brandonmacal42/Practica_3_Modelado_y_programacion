public class BlindajeSimple extends Blindaje{

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
