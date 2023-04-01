public class ArmaMisilPlasma extends Armas{

	public ArmaMisilPlasma(){
		nombreArma = "Misil Plasma";
		AtaqueArma = 1000;
		defensaArma = 0;
		velocidadArma = 0;
		pesoArma = 70; 
		PrecioArma = 12000.00;
		descripcionArma = nombreArma + ", Ataque: " + AtaqueArma + ", \n Defensa: " + defensaArma + ", \n Velocidad: " + velocidadArma + ", \n Peso: " + pesoArma + ", \n Precio: $" + PrecioArma;
	}
}
