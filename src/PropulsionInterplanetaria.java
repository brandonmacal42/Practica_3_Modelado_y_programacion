/*
 * Clase que con la que se construye el componente sistema de propulsion interplanetaria, esta extiende de SistemaPropulsion
 */
public class PropulsionInterplanetaria extends SistemaPropulsion{

	public PropulsionInterplanetaria(){
		nombrePropulsion = "Propulsor Interplanetario";
		AtaquePropulsion = 0;
		defensaPropulsion = 0;
		velocidadPropulsion = 500;
		pesoPropulsion = 1000; 
		PrecioPropulsion = 10000.00;
		descripcionPropulsion = nombrePropulsion + ", Ataque: " + AtaquePropulsion + ", \n Defensa: " + defensaPropulsion + ", \n Velocidad: " + velocidadPropulsion + ", \n Peso: " + pesoPropulsion + ", \n Precio: $" + PrecioPropulsion;
	}
}
