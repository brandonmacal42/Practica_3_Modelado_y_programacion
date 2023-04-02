/*
 * Interfaz que se usa para crear todos los componentes(armas, cabina, blindaje, sistema de propulsion, )
 */
public interface Componentes{

    public String getNombre();

    public int getAtaque();

    public int getDefensa();

    public int getVelocidad();

    public int getPeso();

    public double getPrecio();

    public String toString();

}