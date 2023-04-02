/*
 * Clase que con la que se construye el componente sistema de propulsion intergalactica, esta extiende de SistemaPropulsion
 */
public class PropulsionIntergalactica extends SistemaPropulsion{
	
	public PropulsionIntergalactica(){
		nombrePropulsion = "Propulsor Intergalactico";
		AtaquePropulsion = 0;
		defensaPropulsion = 0;
		velocidadPropulsion = 5000;
		pesoPropulsion = 3000; 
		PrecioPropulsion = 50000.00;
		descripcionPropulsion = nombrePropulsion + ", Ataque: " + AtaquePropulsion + ", \n Defensa: " + defensaPropulsion + ", \n Velocidad: " + velocidadPropulsion + ", \n Peso: " + pesoPropulsion + ", \n Precio: $" + PrecioPropulsion;
	}

}
