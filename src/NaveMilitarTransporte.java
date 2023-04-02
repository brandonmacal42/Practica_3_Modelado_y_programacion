/* 
 * Clase que crea una de las naves predeterminadas a elegir(nave militar de transporte, esta extiende de armado builder
 */
public class NaveMilitarTransporte extends ArmadoBuilder {

    /**
     * Metodo que le agrega a la lista componetes el arma(arma misil de plasma)
     */
    public void agregarArma() {
        componentes.add(new ArmaMisilPlasma());
    }

    /**
     * Metodo que le agrega a la lista componetes la cabina(cabina pequeña)
     */
    public void agregarCabina() {
        componentes.add(new CabinaPequena());
    }

       /**
 * Metodo que le agrega a la lista componetes el blindaje(blindaje reforzado)
 */
    public void agregarBlindaje() {
        componentes.add(new BlindajeReforzado());
    }

      /**
 * Metodo que le agrega a la lista componetes el sistema de propulsion(propulsion interplanetario)
 */
    public void agregarSistemaPropulsion() {
        componentes.add(new PropulsionInterplanetaria());
    }

}