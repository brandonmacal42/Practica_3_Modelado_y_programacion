import java.util.LinkedList;

public class NaveIndividualCombate extends Nave{

   @Override
   public void agregarBlindaje(){
      componentes.add(new BlindajeSimple());
   }

   @Override
   public void agregarArma(){
      componentes.add(new ArmaLaserSimple());
   }

   @Override
   public void agregarCabina(){
      componentes.add(new CabinaUnPiloto());
   }

   @Override
   public void agregarPropulsion() {
      componentes.add(new PropulsionIntercontinental());
   }

}