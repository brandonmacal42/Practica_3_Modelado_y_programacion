/**
 * Clase ArmadoBuilder
 * Contiene el patron de disenio Builder
 * @author Moisés Corpus García
 * @author Etni Sarai Castro Sierra
 * @author Brandon Brayan Macal Cruz
 * @version 1.0 Marzo 2023
 */

import java.util.LinkedList;
/*
 * Clase object builer, esta va a construir la nave espacial
 */
public abstract class ArmadoBuilder{
    protected LinkedList<Componentes> componentes = new LinkedList<Componentes>();

    /**
    * Metodo que regresa el costo total de una nave
    * @param costotal cantidad de dinero a pagar de la nave
    * @return costotal Cantidad de dinero a pagar de la nave
    */
    public double CostoFinal(){
        float costototal = 0;

        for(Componentes com : componentes){
            costototal += com.getPrecio();
        }
        return costototal;
    }

    /**
    * Metodo que imprime las piezas que lleva la nave
    */
    public void getArmado(){
   
        for (Componentes com : componentes) {
           System.out.print("Componente : " + com.getNombre());
           System.out.println(", Precio : " + com.getPrecio());
        }		
     }

    /**
    * Metodo que regresa el peso total de una nave
    * @param pesototal peso de la nave
    * @return pesototal peso final de la nave
    */
     public int getPesoT(){
        int pesototal = 0;
        for (Componentes com : componentes) {
            pesototal += com.getPeso();
        }
        return pesototal;
     }
    
    /**
    * Metodo que regresa el ataque total de una nave
    * @param ataquetotal ataque de la nave
    * @return ataquetotal ataque final de la nave
    */
    public int getAtaqueT(){
        int ataquetotal = 0;
        for (Componentes com : componentes) {
            ataquetotal += com.getAtaque();
        }
        return ataquetotal;
     }

    /**
    * Metodo que regresa la Defensa total de una nave
    * @param defensatotal defensa de la nave
    * @return defensatotal defensa final de la nave
    */
     public int getDefensaT(){
        int defensatotal = 0;
        for (Componentes com : componentes) {
            defensatotal += com.getDefensa();
        }
        return defensatotal;
     }

    /**
    * Metodo que regresa la velocidad total de una nave
    * @param velocidadtotal velocidad de la nave
    * @return velocidadtotal velocidad final de la nave
    */
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
