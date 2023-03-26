import java.util.LinkedList;

public class NaveMilitarTransporte extends Nave{

   @Override
   public void agregarBlindaje(){
      componentes.add(new BlindajeReforzado());
   }

   @Override
   public void agregarArma(){
      componentes.add(new ArmaMisilPlasma());
   }

   @Override
   public void agregarCabina(){
      componentes.add(new CabinaPequeña());
   }

   @Override
   public void agregarPropulsion() {
      componentes.add(new PropulsionInterplanetaria());
   }

}