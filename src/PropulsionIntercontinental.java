/*
 * Clase que con la que se construye el componente sistema de propulsion intercontinental, esta extiende de SistemaPropulsion
 */
public class PropulsionIntercontinental extends SistemaPropulsion{
	
	public PropulsionIntercontinental(){
		nombrePropulsion = "Propulsor Intercontinental";
		AtaquePropulsion = 0;
		defensaPropulsion = 0;
		velocidadPropulsion = 1000;
		pesoPropulsion = 2000; 
		PrecioPropulsion = 20000.00;
		descripcionPropulsion = nombrePropulsion + ", Ataque: " + AtaquePropulsion + ", \n Defensa: " + defensaPropulsion + ", \n Velocidad: " + velocidadPropulsion + ", \n Peso: " + pesoPropulsion + ", \n Precio: $" + PrecioPropulsion;
	}

}
