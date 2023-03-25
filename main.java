public class Main{
	public static void main(String[] args){

		//Fabrica productora.
		CheemsMecanico cheems = new CheemsMecanico();

		//Fabricas para cada parte del auto.
		AbstractFactory fabricaLLantas = 
							cheems.getFactory("LLANTA");
		AbstractFactory fabricaCarrocerias = 
							cheems.getFactory("CARROCERIA");
		AbstractFactory fabricaMotores = 
							cheems.getFactory("MOTOR");

		System.out.println("***EL AUTO 1 PARA EL CLIENTE 1 ES EL SIGUIENTE:***");
		//Se crean las llantas.
		Cabina llantasNuevas1 = 
					(Cabina)fabricaLLantas.getComponente("monstruo");
		llantasNuevas1.crearLLanta();

		//Se crea la carroceria.
		Carroceria carroceriaNueva1 = 
					(Carroceria)fabricaCarrocerias.getComponente("deportiva");
		carroceriaNueva1.crearCarroceria();

		//Se crea el motor.
		SistemPropulsion motorNuevo1 = 
					(SistemPropulsion)fabricaMotores.getComponente("monstruo");
		motorNuevo1.crearMotor();

		//Se crea el auto nuevo con esas partes.
		Nave autoNuevo1 = 
					new Nave(llantasNuevas1, carroceriaNueva1, motorNuevo1);
		autoNuevo1.muestraAuto();

		System.out.println("\n***EL AUTO 2 PARA EL CLIENTE 2 ES EL SIGUIENTE:***");
		//Se crean las llantas.
		Cabina llantasNuevas2 = 
					(Cabina)fabricaLLantas.getComponente("deportiva");
		llantasNuevas2.crearLLanta();

		//Se crea la carroceria.
		Carroceria carroceriaNueva2 = 
					(Carroceria)fabricaCarrocerias.getComponente("deportiva");
		carroceriaNueva2.crearCarroceria();

		//Se crea el motor.
		SistemPropulsion motorNuevo2 = 
					(SistemPropulsion)fabricaMotores.getComponente("deportivo");
		motorNuevo2.crearMotor();

		//Se crea el auto nuevo con esas partes.
		Nave autoNuevo2 = 
					new Nave(llantasNuevas2, carroceriaNueva2, motorNuevo2);
		autoNuevo2.muestraAuto();

	}
}