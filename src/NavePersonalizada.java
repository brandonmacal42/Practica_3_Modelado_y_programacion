import java.util.*;

public class NavePersonalizada extends ArmadoBuilder{

    int ArmaU, CabinaU, BlindajeU, SistemaU;

    public NavePersonalizada(int ArmaU, int CabinaU, int BlindajeU, int SistemaU){
        this.ArmaU = ArmaU;
        this.CabinaU = CabinaU;
        this.BlindajeU = BlindajeU;
        this.SistemaU = SistemaU;
    }

    

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