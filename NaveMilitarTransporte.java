import java.util.LinkedList;

public class NaveMilitarTransporte extends Nave{

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