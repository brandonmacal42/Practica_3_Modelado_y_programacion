public class ArmaLaserDestructor extends Armas{

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