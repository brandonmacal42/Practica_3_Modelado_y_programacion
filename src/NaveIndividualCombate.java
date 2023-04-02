/* 
 * Clase que crea una de las naves predeterminadas a elegir(Nave Individual de Combate, esta extiende de armado builder
 */
public class NaveIndividualCombate extends ArmadoBuilder{


    public void agregarArma(){
        componentes.add(new ArmaLaserSimple());
    }

    public void agregarCabina(){
        componentes.add(new CabinaUnPiloto());

    }

    public void agregarBlindaje(){
        componentes.add(new BlindajeSimple());
    }

    public void agregarSistemaPropulsion(){
        componentes.add(new PropulsionIntercontinental());
    }

}