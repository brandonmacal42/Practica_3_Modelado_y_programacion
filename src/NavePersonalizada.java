/*
 * Clase que permite construir una nave personalizada , esta extiende de la clase armado builder asi como las otras clases para construir las clases las naves predeterminadas
 */
public class NavePersonalizada extends ArmadoBuilder {

    int ArmaU, CabinaU, BlindajeU, SistemaU;

    /**
     * Metodo constructor que le asigna a los atributos los numeros que el usuario
     * haya seleccionado
     * 
     * @param ArmaU(int),CabinaU(int),BlindajeU(int),SistemaU(int)
     */
    public NavePersonalizada(int ArmaU, int CabinaU, int BlindajeU, int SistemaU) {
        this.ArmaU = ArmaU;
        this.CabinaU = CabinaU;
        this.BlindajeU = BlindajeU;
        this.SistemaU = SistemaU;
    }

    /**
     * Metodo que le agrega a la lista componetes el arma segun el numero que haya
     * selecccionado el usuario
     * 1. Arma laser simple
     * 2. Misil Plasma
     * 3. Arma Laser destructor
     */
    public void agregarArma() {

        if (this.ArmaU == 1)
            componentes.add(new ArmaLaserSimple());
        else if (this.ArmaU == 2)
            componentes.add(new ArmaMisilPlasma());
        else if (this.ArmaU == 3)
            componentes.add(new ArmaLaserDestructor());
    }

    /**
     * Metodo que le agrega a la lista componetes la cabina segun el numero que haya
     * selecccionado el usuario
     * 1. Cabina de un piloto
     * 2. Cabina pequeña
     * 3. Cabina para un ejercito
     */
    public void agregarCabina() {

        if (this.CabinaU == 1)
            componentes.add(new CabinaUnPiloto());
        else if (this.CabinaU == 2)
            componentes.add(new CabinaPequena());
        else if (this.CabinaU == 3)
            componentes.add(new CabinaEjercito());

    }

    /**
     * Metodo que le agrega a la lista componetes el blindaje segun el numero que
     * haya selecccionado el usuario
     * 1. Blindaje simple
     * 2. Blindaje reforzado
     * 3. Blindaje de fortaleza
     */
    public void agregarBlindaje() {

        if (this.BlindajeU == 1)
            componentes.add(new BlindajeSimple());
        else if (this.BlindajeU == 2)
            componentes.add(new BlindajeReforzado());
        else if (this.BlindajeU == 3)
            componentes.add(new BlindajeFortaleza());

    }

    /**
     * Metodo que le agrega a la lista componetes el sistema de propulsion segun el
     * numero que haya selecccionado el usuario
     * 1. Propulsion intercontinental
     * 2. Propulsion interplanetaria
     * 3. Propulsion intergalactica
     */
    public void agregarSistemaPropulsion() {

        if (this.SistemaU == 1)
            componentes.add(new PropulsionIntercontinental());
        else if (this.SistemaU == 2)
            componentes.add(new PropulsionInterplanetaria());
        else if (this.SistemaU == 3)
            componentes.add(new PropulsionIntergalactica());

    }

}