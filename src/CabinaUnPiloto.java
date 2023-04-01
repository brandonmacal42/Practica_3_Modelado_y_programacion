public class CabinaUnPiloto extends Cabina{

	public CabinaUnPiloto(){
		nombreCabina = "Cabina de un Piloto";
		AtaqueCabina = 0;
		defensaCabina = 0;
		velocidadCabina = 0;
		pesoCabina = 1000; 
		PrecioCabina = 5000.00;
		descripcionCabina = nombreCabina + ", Ataque: " + AtaqueCabina + ", \n Defensa: " + defensaCabina + ", \n Velocidad: " + velocidadCabina + ", \n Peso: " + pesoCabina + ", \n Precio: $" + PrecioCabina;
	}
	
}