import java.util.LinkedList;

public class NaveIndividualCombate extends Nave{

   @Override
   public void agregarHamburguesa(){
      componentes.add(new BlindajeFortaleza());
   }

   @Override
   public void agregarBebida(){
      componentes.add(new ArmaLaserDestructor());
   }

   @Override
   public void agregarPapas(){
      componentes.add(new CabinaPequeña());
   }
}