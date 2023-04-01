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

        if(this.ArmaU == 1)
        componentes.add(new ArmaLaserSimple());
        else if(this.ArmaU == 2)
        componentes.add(new ArmaMisilPlasma());
        else if(this.ArmaU == 3)
        componentes.add(new ArmaLaserDestructor());

    }

    public void agregarCabina(){

        if(this.CabinaU == 1)
        componentes.add(new CabinaUnPiloto());
        else if (this.CabinaU == 2)
        componentes.add(new CabinaPequena());
        else if (this.CabinaU == 3)
        componentes.add(new CabinaEjercito());
        
    }

    public void agregarBlindaje(){

        if(this.BlindajeU == 1)
        componentes.add(new BlindajeSimple());
        else if (this.BlindajeU == 2)
        componentes.add(new BlindajeReforzado());
        else if (this.BlindajeU == 3)
        componentes.add(new BlindajeFortaleza());
        
    }

    public void agregarSistemaPropulsion(){

        if(this.SistemaU == 1)
        componentes.add(new PropulsionIntercontinental());
        else if(this.SistemaU == 2)
        componentes.add(new PropulsionInterplanetaria());
        else if(this.SistemaU == 3)
        componentes.add(new PropulsionIntergalactica());
        
    }

}
