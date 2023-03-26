import java.util.LinkedList;

public class Combo2 extends Comida{

   @Override
   public void agregarHamburguesa(){
      componentes.add(new BlindajeReforzado());
   }

   @Override
   public void agregarBebida(){
      componentes.add(new ArmaLaserSimple());
   }

   @Override
   public void agregarPapas(){
      componentes.add(new CabinaEjercito());
   }
}