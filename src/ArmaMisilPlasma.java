/*
 * Clase que con la que se construye el componente arma misil de plasma, esta extiende de Armas
 */
public class ArmaMisilPlasma extends Armas {
	/**
	 * Metodo constructor
	 */
	public ArmaMisilPlasma() {
		nombreArma = "Misil Plasma";
		AtaqueArma = 1000;
		defensaArma = 0;
		velocidadArma = 0;
		pesoArma = 70;
		PrecioArma = 12000.00;
		descripcionArma = nombreArma + ", Ataque: " + AtaqueArma + ", \n Defensa: " + defensaArma + ", \n Velocidad: "
				+ velocidadArma + ", \n Peso: " + pesoArma + ", \n Precio: $" + PrecioArma;
	}
}
