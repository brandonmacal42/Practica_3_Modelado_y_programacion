import java.util.LinkedList;

import javax.sound.midi.VoiceStatus;

public abstract class ArmadoBuilder{
    protected LinkedList<Componentes> componentes = new LinkedList<Componentes>();

    public double CostoFinal(){
        float costototal = 0;

        for(Componentes com : componentes){
            costototal += com.getPrecio();
        }
        return costototal;
    }

    public void getArmado(){
   
        for (Componentes com : componentes) {
           System.out.print("Componente : " + com.getNombre());
           System.out.println(", Precio : " + com.getPrecio());
        }		
     }

     public int getPesoT(){
        int pesototal = 0;
        for (Componentes com : componentes) {
            pesototal += com.getPeso();
        }
        return pesototal;
     }
    
    public int getAtaqueT(){
        int ataquetotal = 0;
        for (Componentes com : componentes) {
            ataquetotal += com.getAtaque();
        }
        return ataquetotal;
     }

     public int getDefensaT(){
        int defensatotal = 0;
        for (Componentes com : componentes) {
            defensatotal += com.getDefensa();
        }
        return defensatotal;
     }

     public int getVelocidadT(){
        int velocidadtotal = 0;
        for (Componentes com : componentes) {
            velocidadtotal += com.getVelocidad();
        }
        return velocidadtotal;
     }
    

    public abstract void agregarArma();

    public abstract void agregarBlindaje();

    public abstract void agregarSistemaPropulsion();
    
    public abstract void agregarCabina();

}
