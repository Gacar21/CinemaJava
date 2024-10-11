package cinemajava;

import Cine.Espectador;
import Cine.Peliculas;


import java.util.Scanner;

public class CinemaJava {
    private static final int fila = 9;
    private static final int columna = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Espectador espectador = new Espectador();
        Peliculas pelis = new Peliculas("Como programar y no morir 2", "Gabriel C", 60, 18,10000);


        boolean continuar = true;

        while (continuar) {
            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    if (!espectador.getPuestos()[i][j].equals("0")) {
                        String nombreUsuarioActual = espectador.getNom()[i][j];
                        int edadUsuarioActual = espectador.getEdades()[i][j];
                        int plataUsuarioActual = espectador.getPlata()[i][j];

                        System.out.println("Nombre = " + nombreUsuarioActual + ".");
                        System.out.println("Edad = " + edadUsuarioActual+ ".");
                        System.out.println("Plata = " + plataUsuarioActual+ ".");
                        System.out.println("PUESTO DISPONIBLE = " + espectador.getPuestos()[i][j]+ ".");

                        if (edadUsuarioActual < pelis.getEdadMin()) {
                            System.out.println("No tienes edad suficiente para ver esta película.");
                            System.out.println(" ");
                            continue;
                        }

                        if (plataUsuarioActual < pelis.getPrecio()) {
                            System.out.println("No tienes dinero suficiente para ver esta película.");
                            System.out.println(" ");
                            continue;
                        }

                        boolean asignarOtroPuesto = true;
                        while (asignarOtroPuesto) {
                            System.out.println("¿ACEPTAR PUESTO, " + espectador.getPuestos()[i][j] + "?");
                            System.out.println("1. SI.");
                            System.out.println("2. NO.");
                            System.out.println("3. SALIR.");

                            int opc = sc.nextInt();
                            switch (opc) {
                                case 1:
                                    espectador.getPuestos()[i][j] =
                                    espectador.getPuestos()[i][j] = "0";
                                    espectador.getPlata()[i][j] -= pelis.getPrecio();
                                    System.out.println("PUESTO ASIGNADO.");
                                    System.out.println("Dinero restante: " + espectador.getPlata()[i][j] + ".");
                                    if(espectador.getPlata()[i][j] < pelis.getPrecio()){
                                        System.out.println("No tienes suficiente dinero para asignar otro puesto.");
                                        System.out.println("3.Salir");
                                        System.out.println(" ");
                                        int seguirAsignando = sc.nextInt();
                                        if (seguirAsignando != 1) {
                                            System.out.println(" ");
                                            mostrarInfPeli(pelis);
                                            mostrarInfAsientos(espectador);
                                            System.out.println(" ");
                                            asignarOtroPuesto = false;

                                        }
                                        asignarOtroPuesto = false;
                                    }else {
                                        System.out.println("¿Desea asignar otro puesto, " + nombreUsuarioActual + "?");
                                        System.out.println("1. SI.");
                                        System.out.println("2. NO.");
                                        int seguirAsignando = sc.nextInt();
                                        if (seguirAsignando != 1) {
                                            asignarOtroPuesto = false;
                                        }
                                    }
                                    break;
                                case 2:
                                    asignarOtroPuesto = false;
                                    break;
                                case 3:

                                    mostrarInfPeli(pelis);
                                    mostrarInfAsientos(espectador);
                                    System.out.println(" ");
                                    continuar = false;
                                    return;
                                default:
                                    System.out.println("OPCION INVALIDA.");
                                    break;
                            }
                            j++;
                            if (j >= espectador.getPuestos()[i].length) {
                                i++;
                                j = 0;
                            }
                            if (i >= espectador.getPuestos().length) {
                                i = 0;
                                j = 0;
                            }

                        }


                    }

                }
                System.out.println("PUESTO ASIGNADO.");
            }
            System.out.println("NO HAY MAS PUESTOS DISPONIBLES.");
            continuar = false;
        }

    }



    private static void mostrarInfPeli(Peliculas pelis) {
        System.out.println("/// INFORMACIÓN DE LA PELÍCULA ///");
        System.out.println("PELÍCULA = " + pelis.getTitulo()+ ".");
        System.out.println("DURACION = " + pelis.getDuracion() + " Minutos.");
        System.out.println("AUTOR = " + pelis.getAutor()+ ".");
        System.out.println("Disfrute su película.");
        System.out.println();
    }

    private static void mostrarInfAsientos(Espectador espectador) {
        System.out.println("/// ESTADO DE LOS ASIENTOS DE LA SALA 1 ///");
        System.out.println("'0' Asiento seleccionado.");
        System.out.println("Diferentes de 0 - Asiento no seleccionados.");
        System.out.println(" ");
        for (int i = 0; i < espectador.getPuestos().length; i++) {
            for (int j = 0; j < espectador.getPuestos()[i].length; j++) {

                System.out.print(espectador.getPuestos()[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

    }

}