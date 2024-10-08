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
        Peliculas pelis = new Peliculas("Como programar y no morir 2", "Gabriel C", 18, 10000);

        boolean continuar = true;

        mainLoop:
        while (continuar) {
            int i = (int) (Math.random() * fila);
            int j = (int) (Math.random() * columna);

            while (i < fila) {
                while (j < columna) {
                    String nombreUsuarioActual = espectador.getNom()[i][j];
                    System.out.println("nombre = " + nombreUsuarioActual);
                    System.out.println("edad = " + espectador.getEdades()[i][j]);
                    System.out.println("Plata = " + espectador.getPlata()[i][j]);

                    boolean usuarioActual = true;
                    while (usuarioActual) {
                        while (espectador.getPuestos()[i][j].equals("0")) {
                            j++;
                            if (j >= espectador.getPuestos()[i].length) {
                                i++;
                                j = 0;
                            }
                            if (i >= espectador.getPuestos().length) {
                                System.out.println("No hay más puestos disponibles.");
                                continuar = false;
                                break mainLoop;
                            }
                        }

                        System.out.println("PUESTO DISPONIBLE = " + espectador.getPuestos()[i][j]);

                        System.out.println("""
                                ¿ACEPTAR PUESTO?
                                1. SI
                                2. NO
                                3. SALIR""");

                        int opc = sc.nextInt();
                        switch (opc) {
                            case 1:
                                if (espectador.getEdades()[i][j] < 18 || espectador.getPlata()[i][j] < 10000) {
                                    if (espectador.getEdades()[i][j] < 18) {
                                        System.out.println("No tienes edad suficiente para ver esta película");
                                    }
                                    if (espectador.getPlata()[i][j] < 10000) {
                                        System.out.println("No tienes dinero suficiente para ver esta película");
                                    }
                                    System.out.println(" ");
                                    System.out.println("Pasando al siguiente Usuario...\n");
                                    usuarioActual = false;
                                    break;
                                }
                                espectador.getPuestos()[i][j] = " 0";
                                System.out.println("PUESTO ASIGNADO");

                                do {
                                    j++;
                                    if (j >= espectador.getPuestos()[i].length) {
                                        i++;
                                        j = 0;
                                    }
                                    if (i >= espectador.getPuestos().length) {
                                        i = 0;
                                    }
                                } while (espectador.getPuestos()[i][j].equals(" 0"));

                                System.out.println("¿Desea asignar otro puesto,  " + nombreUsuarioActual + "?");
                                System.out.println("SIGUIENTE PUESTO DISPONIBLE = " + espectador.getPuestos()[i][j]);
                                System.out.println("""
                                        1. SI
                                        2. NO""");
                                int seguirAsignando = sc.nextInt();
                                if (seguirAsignando != 1) {
                                    usuarioActual = false;
                                }
                                break;
                            case 2:
                                usuarioActual = false;
                                break;
                            case 3:
                                mostrarInfPeli(pelis);
                                mostrarInfAsientos(espectador);
                                System.out.println("PELÍCULA = " + pelis.getTitulo());
                                System.out.println("DURACION = " + pelis.getDuracion());
                                System.out.println("AUTOR = " + pelis.getAutor());
                                continuar = false;
                                int continuar0pc = sc.nextInt();
                                if (continuar0pc != 1) {
                                    continuar = false;
                                    break mainLoop;
                                }
                                break;
                            default:
                                System.out.println("OPCION INVALIDA");
                                break;
                        }
                    }
                }
            }
        }

    }



    private static void mostrarInfPeli(Peliculas pelis) {
        System.out.println("INFORMACIÓN DE LA PELÍCULA:");
        System.out.println("PELÍCULA = " + pelis.getTitulo());
        System.out.println("DURACION = " + pelis.getDuracion());
        System.out.println("AUTOR = " + pelis.getAutor());
        System.out.println("Disfrute su película.");
        System.out.println();
    }

    private static void mostrarInfAsientos(Espectador espectador) {
        System.out.println("ESTADO DE LOS ASIENTOS:");
        System.out.println("'0' asiento seleccionado.");
        System.out.println("Diferentes de 0 - asiento no seleccionados.");
        for (int i = 0; i < espectador.getPuestos().length; i++) {
            for (int j = 0; j < espectador.getPuestos()[i].length; j++) {
                System.out.print(espectador.getPuestos()[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    //me rindo con el aleatorio, vi videos, pero no me funciono e intente implementarle los códigos y ya
    //no me servía el mio:T (intente hacer que la matriz se viera aleatoria para no usar codigo, pero obviamente
    // si imprimía la matriz no se veria en orden
    //pense que si hacia dos matrices del cine, una que estuviera ordenada y otra desordenada, y que al llamar, mostrara la desordenada
    // para los asientos disponibles y convirtiera en cero la ordenada, pero eso no iba a funcionar, porque la matriz desordenada y la ordenada
    // en el mismo [][] tienen valores diferentes
    // entonces lo dejo asi, sin aleatorio en las salas
}