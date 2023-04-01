import java.util.InputMismatchException;
import java.util.Scanner;

public class Submenu {

    Proceso p = new Proceso();
    NaveIndividualCombate NIC = new NaveIndividualCombate();
    NaveMilitarTransporte NMT = new NaveMilitarTransporte();
    BaseEspacialDeGuerra BEG = new BaseEspacialDeGuerra();
    NavePersonalizada NP[] = new NavePersonalizada[1];
    Scanner numeros = new Scanner(System.in);
    int opcion, Armaopcion, Blindajeopcion, Cabinaopcion, Sistemaopcion, Ataque, Defensa, Velocidad, nave;
    int Au [];
    int Bu [];
    int Cu [];
    int Su [];
    int presupuesto[];
    double Peso;
    boolean valido = false;

    public Submenu() {
        opcion = 0;
        presupuesto = new int[1];
        presupuesto[0] = 0;
        Armaopcion = 0;
        Blindajeopcion = 0;
        Cabinaopcion = 0;
        Sistemaopcion = 0;
        Ataque = 0;
        Defensa = 0;
        Velocidad = 0;
        Peso = 0.00;

        Au = new int[1];
        Au[0] = 0;
        Bu = new int[1];
        Bu[0] = 0;
        Cu = new int[1];
        Cu[0] = 0;
        Su = new int[1];
        Su[0] = 0;
    }


    public void setPresupuesto() {
        
        System.out.println("\n***BIENVENIDO A SPACESHIP FACTORY***" +  "\n Porfavor ingrese el presupuesto de la nave a cotizar para poder empezar a ayudarlo"); 
            
            try {

                presupuesto[0] = numeros.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("No puedes introducir letas intentalo de nuevo");
                numeros.nextLine();
                setPresupuesto();
            }

        menuS();
    }

    public void menuS() {
        do {
            System.out.println("***BIENVENIDO A SPACESHIP FACTORY***");
            System.out.println("1. ARMAS");
            System.out.println("2. BLINDAJE");
            System.out.println("3. CABINA");
            System.out.println("4. SISTEMA DE PROPULSION");
            System.out.println("5. Naves Prederteminadas");
            System.out.println("6. Terminar Orden");

            try {

                opcion = numeros.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("No puedes introducir letras intentalo de nuevo");
                numeros.nextLine();
            }

            switch (opcion) {
                case 1:
                    Armas();
                    break;
                case 2:
                    Blindaje();
                    break;
                case 3:
                    Cabina();
                    
                    break;
                case 4:
                    SistemaPropulsion();
                    break;
                case 5:
                Nave();
                    break;
                case 6:
                NP[0] = new NavePersonalizada(Au[0], Cu[0], Bu[0], Su[0]);
                System.out.println("\n" + "Nave" + "\n");
                p.NavePersonalizada(NP[0]);
                NP[0].getArmado();
                System.out.println("\n" + "Estadisticas Nave" + "\n");
                System.out.println("Ataque: " + NP[0].getAtaqueT());
                System.out.println("Defensa: " + NP[0].getDefensaT());
                System.out.println("Velocidad: " + NP[0].getVelocidadT());
                System.out.println("Peso: " + NP[0].getPesoT());
                System.out.println("\n" + "Total: $" + (float)NP[0].CostoFinal());
                System.out.println("\n" + "Pase a pagar en caja" + "\n");
                System.out.println("Un gusto haberlo atendido");
                    break;
                default:
                    System.out.println("Ingresa una opcion valida.");
                    break;
            }
        } while (opcion != 6);
    }

    public void Armas() {
        do {
            System.out.println("ARMAS");
            System.out.println("1. Arma Laser Simple | $1590 ");
            System.out.println("2. Arma Misil de Plasma | $1720");
            System.out.println("3. Arma Laser Destructor de Planetas | 4500");
            System.out.println("4. Salir");
            System.out.print("Ingresa opcion: ");

            try {

                Armaopcion = numeros.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("No puedes introducir letras intentalo de nuevo");
                numeros.nextLine();
            }
            
            if(Armaopcion == 4){
                System.out.println("\n" + "Regresando al Menu" + "\n");
            } else if(Armaopcion >= 5 || Armaopcion <= 0){
                System.out.println("\n" + "Opción invalida intentalo de nuevo" + "\n");
            } else if (Armaopcion >= 1 && Armaopcion <= 3){

                if(Armaopcion == 1 && presupuesto[0] < 9000 || Armaopcion == 2 && presupuesto[0] < 12000 || Armaopcion == 3 && presupuesto[0] < 20000){
                    System.out.println("\n" +"No tienes el suficiente presupuesto" +"\n");
                } else if (Armaopcion == 1){
                    Au[0] = Armaopcion;
                    presupuesto[0] = presupuesto[0] - 9000;    
                } else if(Armaopcion == 2){
                    Au[0] = Armaopcion;
                    presupuesto[0] = presupuesto[0] - 12000;    
                } else if(Armaopcion == 3){
                    Au[0] = Armaopcion;
                    presupuesto[0] = presupuesto[0] - 20000;    
                }
                
            }

        } while (Armaopcion != 4);
    }

    public void Blindaje() {
        do {
            System.out.println("BLINDAJE");
            System.out.println("1. Blindaje Simple | $2000");
            System.out.println("2. Blindaje Reforzado | 2550");
            System.out.println("3. Blindaje Fortaleza | 3450");
            System.out.println("4. Salir");
            System.out.print("Ingresa opcion: ");

            try {

                Blindajeopcion = numeros.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("No puedes introducir letras intentalo de nuevo");
                numeros.nextLine();
            }

            if(Blindajeopcion == 4){
                System.out.println("\n" + "Regresando al Menu" + "\n");
            } else if(Blindajeopcion >= 5 || Blindajeopcion <= 0){
                System.out.println("\n" + "Opción invalida intentalo de nuevo" + "\n");
            } else if (Blindajeopcion >= 1 && Blindajeopcion <= 3){

                if(Blindajeopcion == 1 && presupuesto[0] < 10000 || Blindajeopcion == 2 && presupuesto[0] < 60000 || Blindajeopcion == 3 && presupuesto[0] < 25000){
                    System.out.println("\n" +"No tienes el suficiente presupuesto" +"\n");
                } else if (Blindajeopcion == 1){
                    Bu[0] = Blindajeopcion;
                    presupuesto[0] = presupuesto[0] - 10000;    
                } else if(Blindajeopcion == 2){
                    Bu[0] = Blindajeopcion;
                    presupuesto[0] = presupuesto[0] - 60000;    
                } else if(Blindajeopcion == 3){
                    Bu[0] = Blindajeopcion;
                    presupuesto[0] = presupuesto[0] - 25000;    
                }
                
            }

        } while (Blindajeopcion != 4);
    }

    public void Cabina() {
        do {
            System.out.println("CABINA");
            System.out.println("1. Cabina para un piloto | $1200");
            System.out.println("2. Cabina Tripulación pequeña | $1550");
            System.out.println("3. Cabina Ejercito | $3800");
            System.out.println("4. Salir");
            System.out.print("Ingresa opcion: ");

            try {

                Cabinaopcion = numeros.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("No puedes introducir letras intentalo de nuevo");
                numeros.nextLine();
            }

            if(Cabinaopcion == 4){
                System.out.println("\n" + "Regresando al Menu" + "\n");
            } else if(Cabinaopcion >= 5 || Cabinaopcion <= 0){
                System.out.println("\n" + "Opción invalida intentalo de nuevo" + "\n");
            } else if (Cabinaopcion >= 1 && Cabinaopcion <= 3){

                if(Cabinaopcion == 1 && presupuesto[0] < 5000 || Cabinaopcion == 2 && presupuesto[0] < 8000 || Cabinaopcion == 3 && presupuesto[0] < 20000){
                    System.out.println("\n" +"No tienes el suficiente presupuesto" +"\n");
                } else if (Cabinaopcion == 1){
                    Cu[0] = Cabinaopcion;
                    presupuesto[0] = presupuesto[0] - 5000;    
                } else if(Cabinaopcion == 2){
                    Cu[0] = Cabinaopcion;
                    presupuesto[0] = presupuesto[0] - 8000;    
                } else if(Cabinaopcion == 3){
                    Cu[0] = Cabinaopcion;
                    presupuesto[0] = presupuesto[0] - 20000;    
                }
                
            }

        } while (Cabinaopcion != 4);
    }

    public void SistemaPropulsion() {
        do {
            System.out.println("SISTEMA DE PROPULSION");
            System.out.println("1. Sistema de propulsion intercontinental | $2000");
            System.out.println("2. Sistema de propulsion interplanetario | $3000");
            System.out.println("3. Sistema de propulsion intergalactico | $5000");
            System.out.println("4. Salir");
            System.out.print("Ingresa opcion: ");

            try {

                Sistemaopcion = numeros.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("No puedes introducir letras intentalo de nuevo");
                numeros.nextLine();
            }

            if(Sistemaopcion == 4){
                System.out.println("\n" + "Regresando al Menu" + "\n");
            } else if(Sistemaopcion >= 5 || Sistemaopcion <= 0){
                System.out.println("\n" + "Opción invalida intentalo de nuevo" + "\n");
            } else if (Sistemaopcion >= 1 && Sistemaopcion <= 3){

                if(Sistemaopcion == 1 && presupuesto[0] < 20000 || Sistemaopcion == 2 && presupuesto[0] < 10000 || Sistemaopcion == 3 && presupuesto[0] < 50000){
                    System.out.println("\n" +"No tienes el suficiente presupuesto" +"\n");
                } else if (Sistemaopcion == 1){
                    Su[0] = Sistemaopcion;
                    presupuesto[0] = presupuesto[0] - 20000;    
                } else if(Sistemaopcion == 2){
                    Su[0] = Sistemaopcion;
                    presupuesto[0] = presupuesto[0] - 10000;    
                } else if(Sistemaopcion == 3){
                    Su[0] = Sistemaopcion;
                    presupuesto[0] = presupuesto[0] - 50000;    
                }
                
            }

        } while (Sistemaopcion != 4);
    }

   public void Nave(){

        do {
            
            System.out.println("Naves por prederteminado, seleccione la suya");
            System.out.println("1. Nave individual de combate");
            System.out.println("2. Nave Militar de transporte");
            System.out.println("3. Base Espacial de guerra");
            System.out.println("4. Salir o  Confirmar Orden");

            try {
                nave = numeros.nextInt();
            } catch (Exception e) {
                System.out.println("No puedes introducir letras intentalo de nuevo");
                numeros.nextLine();
            }

            switch(nave){
                case 1:
                System.out.println("\n" + "Nave Individual de Combate" + "\n");
                p.NaveSencilla(NIC);
                NIC.getArmado();
                System.out.println("\n" + "Estadisticas Nave" + "\n");
                System.out.println("Ataque: " + NIC.getAtaqueT());
                System.out.println("Defensa: " + NIC.getDefensaT());
                System.out.println("Velocidad: " + NIC.getVelocidadT());
                System.out.println("Peso: " + NIC.getPesoT());
                System.out.println("\n" + "Total: $" + (float)NIC.CostoFinal());

                if(presupuesto[0] < NIC.CostoFinal())
                System.out.println("\n" + "No se puede hacer el pago no le alcanza el presopuesto" + "\n");

                break;
                case 2:
                System.out.println("\n" + "Nave Militar de Transporte" + "\n");
                p.NaveTransporteMilitar(NMT);
                NMT.getArmado();
                System.out.println("\n" + "Estadisticas Nave" + "\n");
                System.out.println("Ataque: " + NMT.getAtaqueT());
                System.out.println("Defensa: " + NMT.getDefensaT());
                System.out.println("Velocidad: " + NMT.getVelocidadT());
                System.out.println("Peso: " + NMT.getPesoT());
                System.out.println("\n" + "Total: $" + (float)NMT.CostoFinal());

                if(presupuesto[0] < NMT.CostoFinal())
                System.out.println("\n" + "No se puede hacer el pago no le alcanza el presopuesto" + "\n");

                break;
                case 3:
                System.out.println("\n" + "Base de Guerra Espacial" + "\n");
                p.BaseGuerra(BEG);
                BEG.getArmado();
                System.out.println("\n" + "Estadisticas Nave" + "\n");
                System.out.println("Ataque: " + BEG.getAtaqueT());
                System.out.println("Defensa: " + BEG.getDefensaT());
                System.out.println("Velocidad: " + BEG.getVelocidadT());
                System.out.println("Peso: " + BEG.getPesoT());
                System.out.println("\n" + "Total: $" + (float)BEG.CostoFinal());

                if(presupuesto[0] < BEG.CostoFinal())
                System.out.println("\n" + "No se puede hacer el pago no le alcanza el presopuesto" + "\n");

                break;
                case 4:
                System.out.println("\n" + "Regrese pronto" + "\n");
                break;
                default:
                System.out.println("Ingresa una opcion valida.");
                break;
            }
        } while (nave != 4);
    }
}
