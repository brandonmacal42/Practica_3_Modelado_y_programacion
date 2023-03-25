public class Main {
	public static void main(String[] args) {

		// Fabrica productora.
		CheemsMecanico cheems = new CheemsMecanico();

		// Fabricas para cada parte del auto.
		AbstractFactory fabricaBlindajes = cheems.getFactory("BLINDAJE");
		AbstractFactory fabricaCabinas = cheems.getFactory("CABINA");
		AbstractFactory fabricaSistemasPropulsion = cheems.getFactory("PROPULSION");
		AbstractFactory fabricaArmas = cheems.getFactory("ARMAS");

		System.out.println("***NAVE INDIVIDUAL DE COMBATE:***");
		// Se crean las llantas.
		Cabina CabinaNueva1 = (Cabina) fabricaCabinas.getComponente("piloto");
		CabinaNueva1.crearCabina();

		// Se crea la carroceria.
		Blindaje blindajeNuevo1 = (Blindaje) fabricaBlindajes.getComponente("reforzado");
		blindajeNuevo1.crearBlindaje();

		// Se crea el motor.
		SistemaPropulsion propulsionNuevo1 = (SistemaPropulsion) fabricaSistemasPropulsion
				.getComponente("intercontinental");
		propulsionNuevo1.crearSistemaPropulsion();

		Armas armasNuevas1 = (Armas) fabricaArmas.getComponente("plasma");
		armasNuevas1.crearArmas();
		// Se crea el auto nuevo con esas partes.
		Nave naveNueva1 = new Nave(CabinaNueva1, blindajeNuevo1, propulsionNuevo1, armasNuevas1);
		naveNueva1.muestraNave();

		System.out.println("\n***NAVE MILITAR DE TRANSPORTE:***");
		// Se crean las llantas.
		Cabina CabinaNueva2 = (Cabina) fabricaCabinas.getComponente("pequeña");
		CabinaNueva2.crearCabina();

		// Se crea la carroceria.
		Blindaje blindajeNuevo2 = (Blindaje) fabricaBlindajes.getComponente("simple");
		blindajeNuevo2.crearBlindaje();

		// Se crea el motor.
		SistemaPropulsion propulsionNuevo2 = (SistemaPropulsion) fabricaSistemasPropulsion
				.getComponente("interplanetario");
		propulsionNuevo2.crearSistemaPropulsion();

		Armas armasNuevas2 = (Armas) fabricaArmas.getComponente("simple");
		armasNuevas2.crearArmas();

		// Se crea el auto nuevo con esas partes.
		Nave naveNueva2 = new Nave(CabinaNueva2, blindajeNuevo2, propulsionNuevo2, armasNuevas2);
		naveNueva2.muestraNave();

		System.out.println("\n***BASE ESPACIAL DE GUERRA:***");
		// Se crean las llantas.
		Cabina CabinaNueva3 = (Cabina) fabricaCabinas.getComponente("ejercito");
		CabinaNueva3.crearCabina();

		// Se crea la carroceria.
		Blindaje blindajeNuevo3 = (Blindaje) fabricaBlindajes.getComponente("fortaleza");
		blindajeNuevo3.crearBlindaje();

		// Se crea el motor.
		SistemaPropulsion propulsionNuevo3 = (SistemaPropulsion) fabricaSistemasPropulsion
				.getComponente("intergalactico");
		propulsionNuevo3.crearSistemaPropulsion();

		Armas armasNuevas3 = (Armas) fabricaArmas.getComponente("destructor");
		armasNuevas3.crearArmas();

		// Se crea el auto nuevo con esas partes.
		Nave naveNueva3 = new Nave(CabinaNueva3, blindajeNuevo3, propulsionNuevo3, armasNuevas3);
		naveNueva3.muestraNave();
	}
}