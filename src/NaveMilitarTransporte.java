/* 
 * Clase que crea una de las naves predeterminadas a elegir(nave militar de transporte, esta extiende de armado builder
 */
public class NaveMilitarTransporte extends ArmadoBuilder{


    public void agregarArma(){
        componentes.add(new ArmaMisilPlasma());
    }

    public void agregarCabina(){
        componentes.add(new CabinaPequena());

    }

    public void agregarBlindaje(){
        componentes.add(new BlindajeReforzado());
    }

    public void agregarSistemaPropulsion(){
        componentes.add(new PropulsionInterplanetaria());
    }

}