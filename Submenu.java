import java.util.Scanner;

public class Submenu{

    CheemsMecanico cheems = new CheemsMecanico();
    Scanner sc = new Scanner(System.in);
    int opcion, presupuesto, Armaopcion, Blindajeopcion, Cabinaopcion, Sistemaopcion;

    public Submenu(){
        opcion = 0;
        presupuesto = 0;
        Armaopcion = 0;
        Blindajeopcion = 0;
        Cabinaopcion = 0;
        Sistemaopcion = 0;
    }

   public void menuS(){
        do {
            System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***" +  "\n Porfavor ingrese el presupuesto de la nave a cotizar para poder empezar a ayudarlo"); 
            try {
                String opcionUsuario = sc.nextLine();
                    presupuesto = Integer.parseInt(opcionUsuario);
                    break;
                
            } catch (NumberFormatException e) {
                System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***" +  "\n Porfavor ingrese el presupuesto de la nave a cotizar para poder empezar a ayudarlo"); 
            }
        } while (true);
        do{
        System.out.println("***BIENVENIDO A SPACESHIP FACTORY***");
        System.out.println("1. ARMAS");
        System.out.println("2. BLINDAJE");
        System.out.println("3. CABINA");
        System.out.println("4. SISTEMA DE PROPULSION");
        System.out.println("5. Terminar Orden");
        

            switch(opcion){
                case 1:
                    Nave naveIndividual = new NaveIndividualCombate();
                    System.out.println("\nComida Combo 1");
                    cheems.armaNaveIndividual(naveIndividual);
                    naveIndividual.muestraComida();
                    System.out.println("Total: " + (float)naveIndividual.obtenCosto());
                    break;
                case 2:
                    Nave naveTransporte = new NaveMilitarTransporte();
                    System.out.println("\nComida Combo 2");
                    cheems.armaNaveTransporte(naveTransporte);
                    naveTransporte.muestraComida();
                    System.out.println("Total: " + (float)naveTransporte.obtenCosto());
                    break;
                case 3:
                    Nave naveGuerra = new NaveEspacialGuerra();
                    System.out.println("\nComida Combo 3");
                    cheems.armaNaveGuerra(naveGuerra);
                    naveGuerra.muestraComida();
                    System.out.println("Total: " + (float)naveGuerra.obtenCosto());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingresa una opcion valida.");
                    break;
            }
        }while(opcion != 5);
    }


    public void Armas(){
        do {
            System.out.println("ARMAS");
            System.out.println("1. Arma Laser Simple | $1590 ");
            System.out.println("2. Arma Misil de Plasma | $1720");
            System.out.println("3. Arma Laser Destructor de Planetas | 4500");
            System.out.println("4. Salir");
        } while (Armaopcion != 4);
    }

    public void Blindaje(){
        do {
            System.out.println("BLINDAJE");
            System.out.println("1. Blindaje Simple | $2000");
            System.out.println("2. Blindaje Reforzado | 2550");
            System.out.println("3. Blindaje Fortaleza | 3450");
            System.out.println("4. Salir");
        } while (Armaopcion != 4);
    }

    public void Cabina(){
        do {
            System.out.println("CABINA");
            System.out.println("1. Cabina para un piloto | $1200");
            System.out.println("2. Cabina Tripulación pequeña | $1550");
            System.out.println("3. Cabina Ejercito | $3800");
            System.out.println("4. Salir");
        } while (Armaopcion != 4);
    }

    public void SistemaPropulcion(){
        do {
            System.out.println("SISTEMA DE PROPULSION");
            System.out.println("1. Sistema de propulsion intercontinental | $2000");
            System.out.println("2. Sistema de propulsion interplanetario | $3000");
            System.out.println("3. Sistema de propulsion intergalactico | $5000");
            System.out.println("4. Salir");
        } while (Armaopcion != 4);
    }
 } 
