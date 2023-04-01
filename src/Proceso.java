/**
 * Clase Proceso
 * Contiene el Armado de las naves
 * @author Moisés Corpus García
 * @author Etni Sarai Castro Sierra
 * @author Brandon Brayan Macal Cruz
 * @version 1.0 Marzo 2023
 */

import java.security.PublicKey;

public class Proceso{

    /**
    * Metodo que coloca las piezas de una Nave Sencilla
    */
    public void NaveSencilla(ArmadoBuilder com){
        com.agregarArma();
        com.agregarCabina();
        com.agregarBlindaje();
        com.agregarSistemaPropulsion();
    }

    /**
    * Metodo que coloca las piezas de una Nave de Transporte Militar
    */
    public void NaveTransporteMilitar(ArmadoBuilder com){
        com.agregarArma();
        com.agregarCabina();
        com.agregarBlindaje();
        com.agregarSistemaPropulsion();
    }
   
    /**
    * Metodo que coloca las piezas de una Base de Guerra
    */
    public void BaseGuerra(ArmadoBuilder com){
        com.agregarArma();
        com.agregarCabina();
        com.agregarBlindaje();
        com.agregarSistemaPropulsion();
    }

    /**
    * Metodo que coloca las piezas de una Nave Personalizada
    */
    public void NavePersonalizada(ArmadoBuilder com){
        com.agregarArma();
        com.agregarCabina();
        com.agregarBlindaje();
        com.agregarSistemaPropulsion();
    }
}
