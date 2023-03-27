import java.util.Scanner;

public class Submenu{

    CheemsMecanico cheems = new CheemsMecanico();
    Scanner sc = new Scanner(System.in);
    int opcion;
    int presupuesto;

    public Submenu(){
        opcion = 0;
        presupuesto = 0;
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
        System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***"
        + "\n\n1. ARMAS" 
        + "\n\n2. BLINDAJE \nBlindaje Simple | $2000 \nBlindaje Reforzado | 2550 \nBlindaje Fortaleza | 3450"
        + "\n\n3. CABINA \nCabina para un piloto | $1200\nCabina Tripulación pequeña | $1550 \nCabina Ejercito | $3800 "
        + "\n\n4. SISTEMA DE PROPULSION \nSistema de propulsion intercontinental | $2000 \nSistema de propulsion interplanetario | $3000 \nSistema de propulsion intergalactico | $5000");
        do{
            
            while (true){
                try {
                    String opcionUsuario = sc.nextLine();
                    opcion = Integer.parseInt(opcionUsuario);
                    break;
                }catch (NumberFormatException ex){
                    System.out.println("Ingresa una opcion valida."
                        + "\n1.- Combo 1"
                        + "\n2.- Combo 2"
                        + "\n3.- Combo 3"
                        + "\n0.- Salir");
                }
            }

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
                case 0:
                    break;
                default:
                    System.out.println("Ingresa una opcion valida.");
                    break;
            }
        }while(opcion != 0);
    }

    public void Armas(){
        System.out.println("ARMAS: \nArma Laser Simple | $1590 \nArma Misil de Plasma | $1720 \nArma Laser Destructor de Planetas | 4500");
    }

    public void Blindaje(){

    }

    public void Cabina(){

    }

    public void SistemaPropulcion(){
        
    }
 } 