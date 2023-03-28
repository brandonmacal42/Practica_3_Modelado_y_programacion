import java.util.LinkedList;

import javax.sound.midi.VoiceStatus;

public abstract class ArmadoBuilder{
    protected LinkedList<Componentes> componentes = new LinkedList<Componentes>();

    public double CostoFinal(){
        float costototal = 0;

        for(Componentes componentes : componentes){
            costototal += componentes.getPrecio();
        }
        return costototal;
    }

    public void getArmado(){
   
        for (Componentes componentes : componentes) {
           System.out.print("Componente : " + componentes.getNombre());
           System.out.println(", Precio : " + componentes.getPrecio());
        }		
     }

     public int getPesoT(){
        int pesototal = 0;
        for (Componentes componentes : componentes) {
            pesototal += componentes.getPeso();
        }
        return pesototal;
     }

    public abstract void agregarArma();

    public abstract void agregarBlindaje();

    public abstract void agregarSistemaPropulsion();
    
    public abstract void agregarCabina();

}