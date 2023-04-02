/*
 * Clase que con la que se construye el componente arma laser destructor, esta extiende de Armas
 */
public class ArmaLaserDestructor extends Armas{

/**
 * Metodo constructor
 */
	public ArmaLaserDestructor(){
		nombreArma = "Laser Destructor";
		AtaqueArma = 1500;
		defensaArma = 0;
		velocidadArma = 0;
		pesoArma = 350; 
		PrecioArma = 20000.00;
		descripcionArma = nombreArma + ", Ataque: " + AtaqueArma + ", \n Defensa: " + defensaArma + ", \n Velocidad: " + velocidadArma + ", \n Peso: " + pesoArma + ", \n Precio: $" + PrecioArma;
	}
}