import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CheemsMecanico cheems = new CheemsMecanico();

        Scanner sc = new Scanner(System.in);
        int opcion;
        int presupuesto;
        Submenus eleccion = new Submenus();
        Componente laserSimple = new ArmaLaserSimple();
        Componente misilPlasma = new ArmaMisilPlasma();
        Componente laserDestructor = new ArmaLaserDestructor();
        Componente blindajeFortaleza = new BlindajeFortaleza();
        Componente blindajeReforzado = new BlindajeReforzado();
        Componente blindajeSimple = new BlindajeSimple();
        Componente cabinaEjercito = new CabinaEjercito();
        Componente cabinaPequeña = new CabinaPequeña();
        Componente cabinaUnPiloto = new CabinaUnPiloto();
        Componente PropulsionIntercontinental = new PropulsionIntercontinental();
        Componente PropulsionIntergalactica = new PropulsionIntergalactica();
        Componente PropulsionInterplanetaria = new PropulsionInterplanetaria();
        do {
            System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***"
                    + "\n Porfavor ingrese el presupuesto de la nave a cotizar para poder empezar a ayudarlo");
            try {
                String opcionUsuario = sc.nextLine();
                presupuesto = Integer.parseInt(opcionUsuario);
                break;

            } catch (NumberFormatException e) {
                System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***"
                        + "\n Porfavor ingrese el presupuesto de la nave a cotizar para poder empezar a ayudarlo");
            }
        } while (true);

        
        System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***"
                + "\n\n1. ARMAS: \n" + laserSimple.toString() + "\n" + misilPlasma.toString() + "\n"
                + laserDestructor.toString()
                + "\n\n2. BLINDAJE \n"
                + blindajeSimple.toString() + "\n" + blindajeReforzado.toString() + "\n" + blindajeFortaleza.toString()
                + "\n\n3. CABINA \n" + cabinaUnPiloto.toString() + "\n" + cabinaPequeña.toString() + "\n"
                + cabinaEjercito.toString()
                + "\n\n4. SISTEMA DE PROPULSION \n" + PropulsionIntercontinental.toString() + "\n"
                + PropulsionInterplanetaria.toString() + "\n" + PropulsionIntergalactica.toString());

        while (true) {
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Ingresa una opcion valida."
                        + "\n1.- Combo 1"
                        + "\n2.- Combo 2"
                        + "\n3.- Combo 3"
                        + "\n0.- Salir");
            }
        }
        do {
            System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***"
                    + "\n Porfavor ingrese el que tipo de arma desea incluir en su nave");
                    System.out.println( "\n\nARMAS: \n1." + laserSimple.toString() + "\n2." + misilPlasma.toString() + "\n3."
                    + laserDestructor.toString());
            try {
                String opcionUsuario = sc.nextLine();
                opcion = Integer.parseInt(opcionUsuario);
                break;

            } catch (NumberFormatException e) {
                System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***"
                + "\n Porfavor ingrese el que tipo de arma desea incluir en su nave");
                System.out.println( "\n\nARMAS: \n1." + laserSimple.toString() + "\n2." + misilPlasma.toString() + "\n3."
                + laserDestructor.toString());
            }
        } while (true);
        switch (opcion) {
            case 1:
                
                break;
        
            default:
                break;
        }

        switch (opcion) {
            case 1:
                Nave naveIndividual = new NaveIndividualCombate();
                System.out.println("\n Opción 1");
                cheems.armaNaveIndividual(naveIndividual);
                naveIndividual.muestraComponentes();
                System.out.println("Total: " + (float) naveIndividual.obtenCosto());
                break;
            case 2:
                Nave naveTransporte = new NaveMilitarTransporte();
                System.out.println("\n Opción 2");
                cheems.armaNaveTransporte(naveTransporte);
                naveTransporte.muestraComponentes();
                System.out.println("Total: " + (float) naveTransporte.obtenCosto());
                break;
            case 3:
                Nave naveGuerra = new NaveEspacialGuerra();
                System.out.println("\n Opcion 3");
                cheems.armaNaveGuerra(naveGuerra);
                naveGuerra.muestraComponentes();
                System.out.println("Total: " + (float) naveGuerra.obtenCosto());
                break;
            case 0:
                break;
            default:
                System.out.println("Ingresa una opcion valida.");
                break;

        }
        while (opcion != 0)
            ;
    }
}
