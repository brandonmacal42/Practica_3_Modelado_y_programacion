/* 
 * Clase que crea una de las naves predeterminadas a elegir(Base espacial de guerra, esta extiende de armado builder
 */
public class BaseEspacialDeGuerra extends ArmadoBuilder {

    /**
     * Metodo que le agrega a la lista componetes el arma(arma laser destructor)
     */
    public void agregarArma() {
        componentes.add(new ArmaLaserDestructor());
    }

    /**
     * Metodo que le agrega a la lista componetes la cabina(cabina ejercito)
     */
    public void agregarCabina() {
        componentes.add(new CabinaEjercito());
    }

    /**
     * Metodo que le agrega a la lista componetes el blindaje(blindaje fortaleza)
     */
    public void agregarBlindaje() {
        componentes.add(new BlindajeFortaleza());
    }

    /**
     * Metodo que le agrega a la lista componetes el sistema de
     * propulsion(propulsion intergalactica)
     */
    public void agregarSistemaPropulsion() {
        componentes.add(new PropulsionIntergalactica());
    }

}