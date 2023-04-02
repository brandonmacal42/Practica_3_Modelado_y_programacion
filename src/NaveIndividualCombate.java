/* 
 * Clase que crea una de las naves predeterminadas a elegir(Nave Individual de Combate, esta extiende de armado builder
 */
public class NaveIndividualCombate extends ArmadoBuilder {

    /**
     * Metodo que le agrega a la lista componetes el arma(arma laser simple)
     */
    public void agregarArma() {
        componentes.add(new ArmaLaserSimple());
    }

    /**
     * Metodo que le agrega a la lista componetes la cabina(cabina de un piloto)
     */
    public void agregarCabina() {
        componentes.add(new CabinaUnPiloto());

    }

    /**
     * Metodo que le agrega a la lista componetes el blindaje(blindaje simple)
     */
    public void agregarBlindaje() {
        componentes.add(new BlindajeSimple());
    }

    /**
     * Metodo que le agrega a la lista componetes el sistema de
     * propulsion(propulsion intercontinental)
     */
    public void agregarSistemaPropulsion() {
        componentes.add(new PropulsionIntercontinental());
    }

}