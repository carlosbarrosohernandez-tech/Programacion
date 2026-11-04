import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Cajero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double saldo = 1000, cantidad;
        int opcion = 0, pin = 0, intentosPin = 0;
        int ingresos = 0, retiradas = 0, errores = 0;
        boolean correcto;

        // PIN: máximo 3 intentos (el PIN es 1234)
        do {
            System.out.println("Introduce el PIN:");
            try {
                pin = entrada.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: el PIN tiene que ser un numero.");
                errores++;
                entrada.nextLine(); // limpio el buffer
            }
            intentosPin++;
            if (pin != 1234) {
                System.out.println("PIN incorrecto.");
            }
        } while (pin != 1234 && intentosPin < 3);

        if (pin != 1234) {
            System.out.println("Tarjeta bloqueada.");
        } else {
            // Menú del cajero
            do {
                System.out.println("1. Consultar");
                System.out.println("2. Ingresar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                try {
                    opcion = entrada.nextInt();
                } catch (InputMismatchException e) {
                    entrada.nextLine();
                    opcion = 0; // así entra en el default
                }

                switch (opcion) {
                    case 1: {
                        System.out.println("Tu saldo es: " + saldo + " euros");
                        break;
                    }
                    case 2: {
                        correcto = false;
                        do {
                            System.out.println("Cuanto quieres ingresar:");
                            try {
                                cantidad = entrada.nextDouble();
                                if (cantidad > 0) {
                                    saldo = saldo + cantidad;
                                    ingresos++;
                                    correcto = true;
                                } else {
                                    System.out.println("Monto debe ser mayor que 0. Reintente.");
                                    errores++;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("¡Error! Debe ingresar un numero valido.");
                                errores++;
                                entrada.nextLine();
                            }
                        } while (!correcto);
                        break;
                    }
                    case 3: {
                        correcto = false;
                        do {
                            System.out.println("Cuanto quieres retirar (max 500):");
                            try {
                                cantidad = entrada.nextDouble();
                                if (cantidad <= 0) {
                                    System.out.println("Monto debe ser mayor que 0. Reintente.");
                                    errores++;
                                } else if (cantidad > 500) {
                                    System.out.println("No puedes sacar mas de 500 euros.");
                                    errores++;
                                } else if (cantidad > saldo) {
                                    System.out.println("No tienes saldo suficiente.");
                                    errores++;
                                } else {
                                    saldo = saldo - cantidad;
                                    retiradas++;
                                    correcto = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("¡Error! Debe ingresar un numero valido.");
                                errores++;
                                entrada.nextLine();
                            }
                        } while (!correcto);
                        break;
                    }
                    case 4: {
                        System.out.println("Adios, gracias por usar el cajero.");
                        break;
                    }
                    default: {
                        System.out.println("Opcion no valida.");
                        errores++;
                    }
                }
            } while (opcion != 4);

            // Resumen de la sesión
            System.out.println("===== RESUMEN DE LA SESION =====");
            System.out.println("Saldo final: " + saldo + " | Ingresos: " + ingresos + " | Retiradas: " + retiradas);
            System.out.println("Entradas erroneas interceptadas: " + errores);
            System.out.println("Operaciones validas: " + (ingresos + retiradas));
        }
    }
}