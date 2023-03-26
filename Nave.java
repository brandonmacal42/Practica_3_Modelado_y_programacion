import java.util.LinkedList;

public abstract class Nave{
	protected LinkedList<Componente> componentes = 
					new LinkedList<Componente>();
   float costo = 0;
   int ataque = 0;
   int defensa =0;
   float velocidad;
   

   public double obtenCosto(){
      for (Componente com : componentes) {
         costo += com.precio();
      }		
      return costo;
   }

   public void muestraComponentes(){
   
      for (Componente com : componentes) {
         System.out.print("Componente : " + com.nombre());
         System.out.println(", Precio : " + com.precio());
      }		
   }

   public abstract void agregarBlindaje();

   public abstract void agregarArma();

   public abstract void agregarCabina();

   public abstract void agregarPropulsion();
}