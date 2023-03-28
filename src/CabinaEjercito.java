public class CabinaEjercito extends Cabina{

	public CabinaPequeña(){
		nombreCabina = "Cabina Ejercito";
		AtaqueCabina = 0;
		defensaCabina = 0;
		velocidadCabina = 0;
		pesoCabina = 3500; 
		PrecioCabina = 20000.00;
		descripcionCabina = nombreCabina + ", Ataque: " + AtaqueCabina + ", \n Defensa: " + defensaCabina + ", \n Velocidad: " + velocidadCabina + ", \n Peso: " + pesoCabina + ", \n Precio: $" + PrecioCabina;
	}
}