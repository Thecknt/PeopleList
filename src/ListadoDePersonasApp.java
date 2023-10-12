import persona.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoDePersonasApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List<Persona> personas = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            showMenu();
            System.out.println();
           exit = ejecutarOperacion(input, personas);

        }
    }
        public static void showMenu() {
            System.out.println();
            System.out.println("""
                    ******* Listado Personas App ******
                    1) Agregar.
                    2) Listar Personas.
                    3) Salir.
                    """);

            System.out.print("Elija la opcion deseada");
        }

        public static void createPearson(Scanner input, List < Persona > personas){
            Persona pearson = new Persona();

            System.out.print("Indique el nombre por favor: ");
            String name = input.next();
            pearson.setName(name);
            System.out.print("Indique el telefono de contacto: ");
            String phone = input.next();
            pearson.setPhone(phone);
            System.out.print("Indique el email de contacto: ");
            String email = input.next();
            pearson.setEmail(email);
            System.out.println(pearson);
            personas.add(pearson);

        }

        public static boolean ejecutarOperacion(Scanner input, List < Persona > personas){
            boolean exit = false;
            int option = input.nextInt();
                switch (option) {
                    case 1 -> createPearson(input, personas);
                    case 2 -> {
            /*
                for (Persona p : personas) {
                    System.out.println(p);
                }
            */
                        if (personas.isEmpty()) {
                            System.out.println("No hay personas guardadas en el listado");
                        } else {
                            //otra manera con expresion lambda seria:
                            //personas.forEach((Persona -> System.out.println(personas)));
                            //otro por metodo de referencia
                            personas.forEach(System.out::println);
                        }
                    }
                    case 3 -> {
                        System.out.println("Gracias por utilizar nuestra App!!!");
                        exit = true;
                    }
                    default -> System.out.println("Ingrese una opcion valida");
                }
            return exit;
        }
    }

