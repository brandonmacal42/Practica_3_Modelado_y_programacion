import java.util.Scanner;

public class Submenus {
	/*Scanner numerosbaguette = new Scanner(System.in);
    Scanner numerospizza = new Scanner(System.in);
    Boolean esbaguette, espizza;
    int cantidad[];
    int opcionbaguettepan, opcionbaguetteingredientes, opcionpizza, confirmacionbaguette, confirmacionpizza;
    // private Baguette baguette_o_pizza;
    // private List<Baguette> pizzas;

    /**
     * Metodo que construye al menu de la clase main
     
    public Submenus() {
        opcionbaguettepan = 0;
        opcionbaguetteingredientes = 0;
        opcionpizza = 0;
        confirmacionbaguette = 0;
        confirmacionpizza = 0;
        baguette_o_pizza = null;
        esbaguette = false;
        espizza = false;

        cantidad = new int[10];

        pan = new ArrayList<>();
        ingredientes = new ArrayList<>();
        pizzas = new ArrayList<>();

        pan.add(new PanBlanco());
        pan.add(new PanCenteno());
        pan.add(new PanVegano());
        pan.add(new PanAjo());

        ingredientes.add(new Catsup(null));
        ingredientes.add(new Pollo(null));
        ingredientes.add(new Pepperoni(null));
        ingredientes.add(new Mostaza(null));
        ingredientes.add(new Mayonesa(null));
        ingredientes.add(new Lechuga(null));
        ingredientes.add(new Jitomate(null));
        ingredientes.add(new Jamon(null));
        ingredientes.add(new Cebolla(null));

        pizzas.add(new PizzaAdapter(new PizzaClasica()));
        pizzas.add(new PizzaAdapter(new PizzaExtrema()));
        pizzas.add(new PizzaAdapter(new PizzaPollo()));
        pizzas.add(new PizzaAdapter(new PizzaHawaiana()));
        pizzas.add(new PizzaAdapter(new PizzaSalchicha()));

    }

    /**
     * Metodo que contiene al los menus para el baguette
     
    public void menubaguette() {

        do {

            esbaguette = true;
            tipodepan();
            ingredientesbaguette();
            System.out.println("\n" + baguette_o_pizza.toString() + "\n");
            baguette_o_pizza.toString();
            System.out.println("\n" + "¿Desea confirmar la orden?");
            System.out.println("1. Si");
            System.out.println("2. No, volver a pedir");
            System.out.println("3. Cancelar orden, quiero otra cosa");

            try {

                confirmacionbaguette = numerosbaguette.nextInt();

            } catch (InputMismatchException e) {

                System.out
                        .println("\n" + "Intente de nuevo no se pueden ingresar letras o caracteres especiales" + "\n");
                numerosbaguette.nextLine();

            }

            switch (confirmacionbaguette) {
                case 1:
                    confirmacionbaguette = 3;
                    toStringTicketdeCompra();
                    break;
                case 2:
                    baguette_o_pizza = null;
                    menubaguette();
                    break;
                case 3:
                    confirmacionbaguette = 3;
                    System.out.println("\n" + "Regresando al menu principal. espere un momento" + "\n");
                    break;
                default:
                    if (confirmacionbaguette <= 0)
                        System.out.println("\n"
                                + "No se pueden ingresar numeros, menores a 1, solo numeros de 1-3 intentelo de nuevo"
                                + "\n");
                    break;
            }

        } while (confirmacionbaguette != 3);

    }

    /**
     * Metodo que contiene al menu para la pizza
     
    public void menupizza() {

        do {

            espizza = true;
            pizzas();

            System.out.println(baguette_o_pizza.toString());

            System.out.println("\n" + "¿Desea confirmar la orden?");
            System.out.println("1. Si");
            System.out.println("2. No, volver a pedir");
            System.out.println("3. Cancelar orden, quiero otra cosa");

            try {

                confirmacionpizza = numerospizza.nextInt();

            } catch (InputMismatchException e) {

                System.out
                        .println("\n" + "Intente de nuevo no se pueden ingresar letras o caracteres especiales" + "\n");
                numerospizza.nextLine();

            }

            switch (confirmacionpizza) {
                case 1:
                    confirmacionpizza = 3;
                    toStringTicketdeCompra();
                    break;
                case 2:
                    baguette_o_pizza = null;
                    menupizza();
                    break;
                case 3:
                    confirmacionpizza = 3;
                    System.out.println("\n" + "Regresando al menu principal. espere un momento" + "\n");
                    break;
                default:
                    if (confirmacionpizza <= 0)
                        System.out.println("\n"
                                + "No se pueden ingresar numeros, menores a 1, solo numeros de 1-3 intentelo de nuevo"
                                + "\n");
                    break;
            }

        } while (confirmacionpizza != 3);

    }

    /**
     * Metodo que preguinta que pan desea para construir el objeto sandwich a partir
     * del tipo de pan
    public void tipodepan() {

        do {

            System.out.println("\n" + "¿Que tipo de pan desea para su baguette?");
            System.out.println("1. Pan Blanco $30.00");
            System.out.println("2. Pan Centeno $40.00");
            System.out.println("3. Pan de Ajo $30.00");
            System.out.println("4. Pan Vegano");
            System.out.println("5. Salir");

            try {

                opcionbaguettepan = numerosbaguette.nextInt();

            } catch (InputMismatchException e) {

                System.out
                        .println("\n" + "Intente de nuevo no se pueden ingresar letras o caracteres especiales" + "\n");
                numerosbaguette.nextLine();

            }

            switch (opcionbaguettepan) {
                case 1:

                    baguette_o_pizza = new PanBlanco();
                    System.out.println("Dirigiendo al los ingredintes a elección ...");
                    opcionbaguettepan = 5;
                    for (int i = 0; i < 4; i++) {
                        System.out.println(". . .");
                    }

                    break;
                case 2:

                    baguette_o_pizza = new PanCenteno();
                    System.out.println("Dirigiendo al los ingredintes a elección ...");
                    opcionbaguettepan = 5;
                    for (int i = 0; i < 4; i++) {
                        System.out.println(". . .");
                    }

                    break;
                case 3:

                    baguette_o_pizza = new PanAjo();
                    System.out.println("Dirigiendo al los ingredintes a elección ...");
                    opcionbaguettepan = 5;
                    for (int i = 0; i < 4; i++) {
                        System.out.println(". . .");
                    }

                    break;
                case 4:

                    baguette_o_pizza = new PanVegano();
                    System.out.println("Dirigiendo al los ingredintes a elección ...");
                    opcionbaguettepan = 5;
                    for (int i = 0; i < 4; i++) {
                        System.out.println(". . .");
                    }

                    break;
                case 5:
                    ingredientesbaguette();
                    break;
                default:
                    if (opcionbaguettepan <= 0)
                        System.out.println("\n"
                                + "No se pueden ingresar numeros, menores a 1, solo numeros de 1-4 intentelo de nuevo"
                                + "\n");
                    break;
            }

        } while (opcionbaguettepan != 5);
    }

    /**
     * Metodo que toma los ingredientes que se van a añadir
    public void ingredientesbaguette() {

        do {

            System.out.println("¿Que ingredientes desea añadir?" + "\n");

            System.out.println("_______________________________");
            System.out.println("|   Verduras   |    Precio    |");
            System.out.println("|1. Jitomate   |    $5.00     |");
            System.out.println("|2. Lechuga    |    $3.50     |");
            System.out.println("|3. Cebolla    |    $2.30     |");
            System.out.println("-------------------------------");
            System.out.println("_______________________________");
            System.out.println("|    Carnes    |    Precio    |");
            System.out.println("|4. Pollo      |    $14.00    |");
            System.out.println("|5. Pepperoni  |    $15.50    |");
            System.out.println("|6. Jamon      |    $11.99    |");
            System.out.println("-------------------------------");
            System.out.println("_______________________________");
            System.out.println("| Condimetnos  |    Precio    |");
            System.out.println("|7. Catsup     |    $1.50     |");
            System.out.println("|8. Mayonesa   |    $1.50     |");
            System.out.println("|9. Moztaza    |    $1.50     |");
            System.out.println("-------------------------------");
            System.out.println("\n" + "10. Ordenar Baguette");
            System.out.print("Ingresa la opción: ");

            try {

                opcionbaguetteingredientes = numerosbaguette.nextInt();

            } catch (InputMismatchException e) {

                System.out
                        .println("\n" + "Intente de nuevo no se pueden ingresar letras o caracteres especiales" + "\n");
                numerosbaguette.nextLine();

            }

            switch (opcionbaguetteingredientes) {
                case 1:
                    if (cantidad[0] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Jitomate(baguette_o_pizza);
                    cantidad[0] = cantidad[0] + 1;
                    break;
                case 2:
                    if (cantidad[1] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Lechuga(baguette_o_pizza);
                    cantidad[1] = cantidad[1] + 1;
                    break;
                case 3:
                    if (cantidad[2] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Cebolla(baguette_o_pizza);
                    cantidad[2] = cantidad[2] + 1;
                    break;
                case 4:
                    if (cantidad[3] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Pollo(baguette_o_pizza);
                    cantidad[3] = cantidad[3] + 1;
                    break;
                case 5:
                    if (cantidad[4] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Pepperoni(baguette_o_pizza);
                    cantidad[4] = cantidad[4] + 1;
                    break;
                case 6:
                    if (cantidad[5] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Jamon(baguette_o_pizza);
                    cantidad[5] = cantidad[5] + 1;
                    break;
                case 7:
                    if (cantidad[6] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Catsup(baguette_o_pizza);
                    cantidad[6] = cantidad[6] + 1;
                    break;
                case 8:
                    if (cantidad[7] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Mayonesa(baguette_o_pizza);
                    cantidad[7] = cantidad[7] + 1;
                    break;
                case 9:
                    if (cantidad[8] >= 3)
                        System.out.println(
                                "\n" + "Como que eres muy tragon no, no puedes poner más de 3 ingredientes >:/" + "\n");
                    else
                        baguette_o_pizza = new Mostaza(baguette_o_pizza);
                    cantidad[8] = cantidad[8] + 1;
                    break;
                case 10:
                    System.out.println("\n" + "Cocinando ...");
                    break;
                default:
                    if (opcionbaguettepan <= 0)
                        System.out.println("\n"
                                + "No se pueden ingresar numeros, menores a 1, solo numeros de 1-4 intentelo de nuevo"
                                + "\n");
                    break;
            }

        } while (opcionbaguetteingredientes != 10);
    }

    /**
     * Metodo que contiene al menu para la pizza
    public void pizzas() {

        do {

            System.out.println("¿Que pizza deseas ordenar?" + "\n");

            System.out.println("____________________________________");
            System.out.println("|    Tipo  de Pizza   |    Precio   |");
            System.out.println("| 1. Pizza Clasica    |   $79.00    |");
            System.out.println("| 2. Pizza Hawaiana   |   $80.99    |");
            System.out.println("| 3. Pizza Pollo      |   $110.20   |");
            System.out.println("| 4. Pizza Salchicha  |   $120.00   |");
            System.out.println("| 5. Pizza Extrema    |   $219.99   |");
            System.out.println("-------------------------------------");

            System.out.println("\n" + "6. Salir");

            try {

                opcionpizza = numerospizza.nextInt();

            } catch (InputMismatchException e) {

                System.out
                        .println("\n" + "Intente de nuevo no se pueden ingresar letras o caracteres especiales" + "\n");
                numerospizza.nextLine();

            }

            switch (opcionpizza) {
                case 1:
                    baguette_o_pizza = new PizzaAdapter(new PizzaClasica());
                    opcionpizza = 6;
                    break;
                case 2:
                    baguette_o_pizza = new PizzaAdapter(new PizzaHawaiana());
                    opcionpizza = 6;
                    break;
                case 3:
                    baguette_o_pizza = new PizzaAdapter(new PizzaPollo());
                    opcionpizza = 6;
                    break;
                case 4:
                    baguette_o_pizza = new PizzaAdapter(new PizzaSalchicha());
                    opcionpizza = 6;
                    break;
                case 5:
                    baguette_o_pizza = new PizzaAdapter(new PizzaExtrema());
                    opcionpizza = 6;
                    break;
                case 6:
                    System.out.println("Cocinando espere");
                    break;
                default:
                    if (opcionpizza <= 0)
                        System.out.println("\n"
                                + "No se pueden ingresar numeros, menores a 1, solo numeros de 1-6 intentelo de nuevo"
                                + "\n");
                    break;
            }

        } while (opcionpizza != 6);

    }

    /**
     * Metodo que imprime el ticket de compra
    public void toStringTicketdeCompra() {
        if (baguette_o_pizza == null) {

            System.out.println("Usted no ha pedido aun, para imprimir un ticket necesita antes ordenar");

        } else {

            if (esbaguette == true) {

                System.out.println("\n" + "Ticket de  Compra: " + "\n");
                System.out.println(baguette_o_pizza.toString());
                System.out.println("\n" + "Precio Total baguette: $" + baguette_o_pizza.getPrecio() + " MXN " + "\n");
                System.out.println("Gracias por su compra, vuelva pronto :)" + "\n");

            } else if (espizza == true) {

                System.out.println("\n" + "Ticket de  Compra: " + "\n");
                System.out.println(baguette_o_pizza.toString());
                System.out.println("\n" + "Precio Total Pizza: $" + baguette_o_pizza.getPrecio() + " MXN " + "\n");
                System.out.println("Gracias por su compra, vuelva pronto :)" + "\n");

            }

        }
    }

}*/

}
