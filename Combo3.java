import java.util.LinkedList;

public class Combo3 extends Comida{

   @Override
   public void agregarHamburguesa(){
      componentes.add(new BlindajeFortaleza());
      componentes.add(new BlindajeFortaleza());
   }

   @Override
   public void agregarBebida(){
      componentes.add(new ArmaLaserDestructor());
      componentes.add(new ArmaLaserSimple());
   }

   @Override
   public void agregarPapas(){
      componentes.add(new CabinaPequeña());
      componentes.add(new CabinaEjercito());
   }
}