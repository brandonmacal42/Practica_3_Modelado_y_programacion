/*
 * Clase que con la que se construye el componente arma laser simple, esta extiende de Armas
 */
public class ArmaLaserSimple extends Armas {

	/**
	 * Metodo constructor
	 */
	public ArmaLaserSimple() {
		nombreArma = "Laser Simple";
		AtaqueArma = 250;
		defensaArma = 0;
		velocidadArma = 0;
		pesoArma = 20;
		PrecioArma = 9000.00;
		descripcionArma = nombreArma + ", Ataque: " + AtaqueArma + ", \n Defensa: " + defensaArma + ", \n Velocidad: "
				+ velocidadArma + ", \n Peso: " + pesoArma + ", \n Precio: $" + PrecioArma;
	}
}