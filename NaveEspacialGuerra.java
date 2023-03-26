import java.util.LinkedList;

public class NaveEspacialGuerra extends Nave{

   @Override
   public void agregarBlindaje(){
      componentes.add(new BlindajeFortaleza());
   }

   @Override
   public void agregarArma(){
      componentes.add(new ArmaLaserDestructor());
   }

   @Override
   public void agregarCabina(){
      componentes.add(new CabinaEjercito());
   }

   @Override
   public void agregarPropulsion() {
      componentes.add(new PropulsionIntergalactica());
   }

   
}