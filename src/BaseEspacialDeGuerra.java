public class BaseEspacialDeGuerra extends ArmadoBuilder{


    public void agregarArma(){
        componentes.add(new ArmaLaserDestructor());
    }

    public void agregarCabina(){
        componentes.add(new CabinaEjercito());

    }

    public void agregarBlindaje(){
        componentes.add(new BlindajeFortaleza());
    }

    public void agregarSistemaPropulsion(){
        componentes.add(new PropulsionIntergalactica());
    }

}