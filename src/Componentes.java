/*
 * Interfaz que se usa para crear todos los componentes(armas, cabina, blindaje, sistema de propulsion, )
 */
public interface Componentes {
    /**
     * Funcion que regresa el nombre del componente
     * 
     * @return nombre (String)
     */
    public String getNombre();

    /**
     * Funcion que regresa el ataque del componente
     * 
     * @return ataque (int)
     */
    public int getAtaque();

    /**
     * Funcion que regresa la defensa del componente
     * 
     * @return defensa (int)
     */
    public int getDefensa();

    /**
     * Funcion que regresa la velocidad del componente
     * 
     * @return velocidad (int)
     */
    public int getVelocidad();

    /**
     * Funcion que regresa el peso del componente
     * 
     * @return peso (int)
     */
    public int getPeso();

    /**
     * Funcion que regresa el precio del componente
     * 
     * @return precio (double)
     */
    public double getPrecio();

    /**
     * Funcion que regresa la descripcion del componente
     * 
     * @return descripcion (String)
     */
    public String toString();

}