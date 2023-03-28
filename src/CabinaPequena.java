public class CabinaPequena extends Cabina{

	public CabinaPequena(){
		nombreCabina = "Cabina Pequeña";
		AtaqueCabina = 0;
		defensaCabina = 0;
		velocidadCabina = 0;
		pesoCabina = 2000; 
		PrecioCabina = 8000.00;
		descripcionCabina = nombreCabina + ", Ataque: " + AtaqueCabina + ", \n Defensa: " + defensaCabina + ", \n Velocidad: " + velocidadCabina + ", \n Peso: " + pesoCabina + ", \n Precio: $" + PrecioCabina;
	}

}