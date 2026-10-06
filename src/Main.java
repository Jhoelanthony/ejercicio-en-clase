import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner jhoel = new Scanner(System.in);
        boolean[] asientos = new boolean[10];
        int opcion;
        do {
            System.out.println("--SISTEMA DE VENTA DE BOLETOS CIVA----");
            System.out.println("1. Mostrar los asientos del bus");
            System.out.println("2. Compar boletos");
            System.out.println("3. Mostrar resumen");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion a realizar:");
            opcion = jhoel.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--LISTA DE ASIENTOS");
                    for (int i = 0; i < asientos.length; i++) {
                        if (asientos[i] == false) {

                            System.out.println("----------------------------------");
                            System.out.println("Asiento " + (i + 1) + ":Disponible");
                            System.out.println("-----------------------------------");

                        } else {
                            System.out.println("---------------------------------");
                            System.out.println("Aisento " + (i + 1) + ":Ocupado");
                            System.out.println("------------------------------------");
                        }
                    }
                    break;
                case 2:
                    System.out.println("--LISTA DE ASIENTOS");
                    for (int i = 0; i < asientos.length; i++) {
                        if (asientos[i] == false) {

                            System.out.println("");
                            System.out.println("Asiento " + (i + 1) + ":Disponible");
                            System.out.println("Lista de asiento");

                        } else {
                            System.out.println("---------------------------------");
                            System.out.println("Aisento " + (i + 1) + ":Ocupado");
                            System.out.println("------------------------------------");
                        }
                    }
                    //iniciando la compra
                    System.out.println("Ingree el asiento de compra");
                    int asiento = jhoel.nextInt();
                    if (asiento < 1 && asiento > 10) {
                        System.out.println("El bus no cuenta con ese haciento");
                    }else {
                    int posicion=asiento-1;//convirtiendo el haciento
                        if(asientos[posicion]==false){
                            asientos[posicion]=true;
                            System.out.println("Asiento comprado correctamente");
                            System.out.println("Asiento aosgnado es el siguiente:"+asiento);
                        }else{
                            System.out.println("Asiento ya ocupado");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Resumen de asientos comprados y vendidos");

                    break;
                case 4:
                    System.out.println("Saliendo del sistema");
                    break;

            }

        } while (opcion != 4);
    }
}


