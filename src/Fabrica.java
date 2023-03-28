import java.util.*;

public class Fabrica extends ArmadoBuilder{

    int ArmaU, BlindajeU, CabinaU, SistemaU;

    public Fabrica(){
        ArmaU = 0;
        BlindajeU = 0;
        CabinaU = 0;
        SistemaU = 0;
    }

    public int ArmaUsuario(int ArmaU){
        return ArmaU;
    }

    public void agregarArma(){

        this.ArmaU = ArmaU;
        if(ArmaU = 1)
        componentes.add(new ArmaLaserSimple());
        else if(ArmaU = 2)
        componentes.add(new ArmaLaserDestructor());
        else if(ArmaU = 3)
        componentes.add(new ArmaMisilPlasma());
        
    }

    public void agregarCabina(){

    }

    public void agregarBlindaje(){

    }

    public void agregarSistemaPropulsion(){

    }
    
}
