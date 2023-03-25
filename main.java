public class Main{
	public static void main(String[] args){

		//Fabrica productora.
		CheemsMecanico cheems = new CheemsMecanico();

		//Fabricas para cada parte del auto.
		AbstractFactory fabricaBlindajes = 
							cheems.getFactory("BLINDAJE");
		AbstractFactory fabricaCabinas = 
							cheems.getFactory("CABINA");
		AbstractFactory fabricaSistemasPropulsion = 
							cheems.getFactory("PROPULSION");

		System.out.println("***EL AUTO 1 PARA EL CLIENTE 1 ES EL SIGUIENTE:***");
		//Se crean las llantas.
		Cabina CabinaNueva1 = 
					(Cabina)fabricaCabinas.getComponente("monstruo");
		CabinaNueva1.crearCabina();

		//Se crea la carroceria.
		Blindaje blindajeNuevo1 = 
					(Blindaje)fabricaBlindajes.getComponente("deportiva");
		blindajeNuevo1.crearBlindaje();

		//Se crea el motor.
		SistemaPropulsion propulsionNuevo1 = 
					(SistemaPropulsion)fabricaSistemasPropulsion.getComponente("monstruo");
		propulsionNuevo1.crearSistemaPropulsion();

		//Se crea el auto nuevo con esas partes.
		Nave naveNueva1 = 
					new Nave(CabinaNueva1, blindajeNuevo1, propulsionNuevo1);
		naveNueva1.muestraNave();

		System.out.println("\n***EL AUTO 2 PARA EL CLIENTE 2 ES EL SIGUIENTE:***");
		//Se crean las llantas.
		Cabina CabinaNueva2 = 
					(Cabina)fabricaCabinas.getComponente("deportiva");
		CabinaNueva2.crearCabina();

		//Se crea la carroceria.
		Blindaje blindajeNuevo2 = 
					(Blindaje)fabricaBlindajes.getComponente("deportiva");
		blindajeNuevo2.crearBlindaje();

		//Se crea el motor.
		SistemaPropulsion propulsionNuevo2 = 
					(SistemaPropulsion)fabricaSistemasPropulsion.getComponente("deportivo");
		propulsionNuevo2.crearSistemaPropulsion();

		//Se crea el auto nuevo con esas partes.
		Nave naveNueva2 = 
					new Nave(CabinaNueva2, blindajeNuevo2, propulsionNuevo2);
		naveNueva2.muestraNave();

	}
}