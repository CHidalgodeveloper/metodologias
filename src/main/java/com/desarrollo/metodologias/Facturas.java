package com.desarrollo.metodologias;

import java.util.Scanner;

/**
 *
 * @author stinky
 */
public class Facturas {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        String cedula;
        String telefono;
        char opP, op1, op2;
        int contP = 0;
        char salida;

        String producto[] = new String[20];
        int cantidad[] = new int[20];
        double valor[] = new double[20];
        double acum = 0;

        Scanner sc = new Scanner(System.in);
        //menu principal repetitivo con do-while
        do {
            System.out.println("--BIENVENIDO A MENU DE COMPRAS--");
            System.out.println("");
            System.out.println("1.- REALIZAR COMPRA");

            System.out.println("2.- REVIZAR CARRITO DE COMPRAS");
            System.out.println("3.- FINALIZAR COMPRA");
            opP = sc.next().charAt(0);
            //submenu opcion 1
            if (opP == '1') {
                do {
                    System.out.println("--PRODUCTOS DISPONIBLE--");
                    System.out.println("");
                    System.out.println("1.- zapatillas adidas       $100");
                    System.out.println("2.- zapatillas nike         $150");
                    System.out.println("3.- zapatillas umbro        $ 75");
                    System.out.println("4.- zapatillas fila         $ 90");
                    System.out.println("5.- zapatillas venus        $ 10");
                    System.out.println("6.- salir");
                    op1 = sc.next().charAt(0);
                    if (op1 == '1') {
                        System.out.println("ingrese la cantidad de zapatillas adidas que desea");
                        cantidad[contP] = sc.nextInt();
                        if (cantidad[contP] != 0) {
                            valor[contP] = cantidad[contP] * 100;
                            producto[contP] = "zapatillas adidas";
                            acum = acum + valor[contP];
                            contP = contP + 1;

                        }

                    } else if (op1 == '2') {
                        System.out.println("ingrese la cantidad de zapatillas nike que desea");
                        cantidad[contP] = sc.nextInt();
                        if (cantidad[contP] != 0) {
                            valor[contP] = cantidad[contP] * 150;
                            producto[contP] = "zapatillas nike";
                            acum = acum + valor[contP];
                            contP = contP + 1;

                        }

                    } else if (op1 == '3') {
                        System.out.println("ingrese la cantidad de zapatillas umbro que desea");
                        cantidad[contP] = sc.nextInt();
                        if (cantidad[contP] != 0) {
                            valor[contP] = cantidad[contP] * 75;
                            producto[contP] = "zapatillas umbro";
                            acum = acum + valor[contP];
                            contP = contP + 1;

                        }

                    } else if (op1 == '4') {
                        System.out.println("ingrese la cantidad de zapatillas fila que desea");
                        cantidad[contP] = sc.nextInt();
                        if (cantidad[contP] != 0) {
                            valor[contP] = cantidad[contP] * 90;
                            producto[contP] = "zapatillas fila";
                            acum = acum + valor[contP];
                            contP = contP + 1;

                        }

                    } else if (op1 == '5') {
                        System.out.println("ingrese la cantidad de zapatillas venus que desea");
                        cantidad[contP] = sc.nextInt();
                        if (cantidad[contP] != 0) {
                            valor[contP] = cantidad[contP] * 10;
                            producto[contP] = "zapatillas venus";
                            acum = acum + valor[contP];
                            contP = contP + 1;

                        }

                    } else if (op1 == '6') {

                        do {
                            System.out.println("desea salir  al menú principal S/N ");
                            salida = sc.next().charAt(0);
                            if (salida == 's' || salida == 'S') {
                                op1 = '6';
                            } else if (salida == 'n' || salida == 'N') {
                                op1 = '2';

                            } else {
                                System.out.println("opción invalida");
                                salida = 'd';

                            }
                        } while (salida == 'd');
                    } else {
                        System.out.println("opción ivalida intente de nuevo");
                        op1 = '2';
                    }
                } while (op1 == '1' || op1 == '2' || op1 == '3' || op1 == '4' || op1 == '5');

            } else if (opP == '2') {
                do {
                    if (contP != 0) {
                        System.out.println("--PRODUCTOS ESCOGIDOS--");
                        System.out.println("");
                        for (int i = 0; i < contP; i++) {
                            System.out.println(cantidad[i] + "\t" + producto[i] + "\t" + "\t" + "\t" + valor[i]);

                        }
                        System.out.println("desea salir al menu principal S/N");
                        op2 = sc.next().charAt(0);
                    } else {
                        System.out.println("no hay productos en el carrito");
                        op2 = 's';
                    }
                } while (op2 == 'n' || op2 == 'N');

            } else if (opP == '3') {
                if (contP == 0) {
                    do {
                        System.out.println("desea salir S/N ");
                        salida = sc.next().charAt(0);
                        if (salida == 's' || salida == 'S') {
                            opP = '3';
                        } else if (salida == 'n' || salida == 'N') {
                            opP = '2';

                        } else {
                            System.out.println("opción invalida");
                            salida = 'd';

                        }
                    } while (salida == 'd');
                } else {
                    do {
                        System.out.println("desea terminar la compra y generar la factura S/N ");
                        salida = sc.next().charAt(0);
                        if (salida == 's' || salida == 'S') {
                            opP = '3';
                        } else if (salida == 'n' || salida == 'N') {
                            opP = '2';

                        } else {
                            System.out.println("opción invalida");
                            salida = 'd';

                        }
                    } while (salida == 'd');
                }

            } else {

                System.out.println("opción ivalida intente de nuevo");
                opP = '2';

            }

        } while (opP == '1' || opP == '2');
        if (contP != 0) {
            System.out.println("--DATOS FACTURACIÓN--");
            System.out.println("");
            System.out.println("Ingrese su nombre:");
            nombre = sc.next();
            System.out.println("Ingrese su apellido:");
            apellido = sc.next();
            System.out.println("Ingrese su telefono:");
            telefono = sc.next();
            System.out.println("Ingrese su cédula:");
            cedula = sc.next();
            System.out.println("");
            System.out.println("    --FACTURA--");
            System.out.println("");
            System.out.println("Nombre: " + nombre + "\t" + apellido);
            System.out.println("");
            System.out.println("Cédula: " + cedula + "\t" + "Telefono: " + telefono);
            System.out.println("");
            System.out.println("cant" + "\t" + "Producto" + "\t" + "\t" + "\t" + "\t" + "valor");
            for (int i = 0; i < contP; i++) {
                System.out.println(cantidad[i] + "\t" + producto[i] + "\t" + "\t" + "\t" + valor[i]);
            }
            System.out.println("");
            System.out.println("Total: $" + acum);

        } else {
            System.out.println("gracias por su visita");
        }

    }
}
