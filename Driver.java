import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * La clase Driver es la clase principal del programa que gestiona los datos de porteros y extremos.
 */
public class Driver {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        ArrayList<Portero> myPorteros = new ArrayList<Portero>();
        ArrayList<Extremo> myExtremos = new ArrayList<Extremo>();
        boolean running = true;


        while(running){
            System.out.println("Menu principal");
            System.out.println("1. Ingresar Porteros");
            System.out.println("2. Ingresar Extremos");
            System.out.println("3. Mostrar jugadores");
            System.out.println("4. Top 3 porteros");
            System.out.println("5. Cantidad De Extremos Efectivos");
            System.out.println("6. Salir");
            System.out.println("Ingrese su opcion: ");
            int opt = myScanner.nextInt();
            
            switch (opt) {
                case 1:
                    System.out.println("CARGAR PORTEROS CSV");
                
                    try (Scanner scanner = new Scanner(new File("porteros.csv"))) {
                        int cont  = 0;
                        while (scanner.hasNextLine()) {
                            if(cont == 0){
                                scanner.nextLine();
                            }
                            String linea = scanner.nextLine();
                            String[] valores = linea.split("\\,");
                            myPorteros.add(new Portero(valores[0],valores[1],Integer.parseInt(valores[2]),Integer.parseInt(valores[3]),Integer.parseInt(valores[4]),Integer.parseInt(valores[5]),Integer.parseInt(valores[6])));
                            cont++;
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("CARGAR EXTREMOS CSV");
                
                    try (Scanner scanner = new Scanner(new File("extremos.csv"))) {
                        int cont  = 0;
                        while (scanner.hasNextLine()) {
                            if(cont == 0){
                                scanner.nextLine();
                            }
                            String linea = scanner.nextLine();
                            String[] valores = linea.split("\\,");
                            myExtremos.add(new Extremo(valores[0],valores[1],Integer.parseInt(valores[2]),Integer.parseInt(valores[3]),Integer.parseInt(valores[4]),Integer.parseInt(valores[5]),Integer.parseInt(valores[6])));
                            cont++;
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("-------EXTREMOS-------- ");
                    for (Extremo extremo : myExtremos) {
                        System.out.println(extremo);
                    }
                    System.out.println("");
                    System.out.println("---------PORTEROS---------");
                    for (Portero portero : myPorteros) {
                        System.out.println(portero);
                    }
                    break;
                case 4:
                    int[] porcetages = new int[myPorteros.size()];
                    for (int i = 0; i < porcetages.length; i++) {
                        porcetages[i] = (int) myPorteros.get(i).calcEfectividad();
                    }
                    Arrays.sort(porcetages);
                    System.out.println("Top 3 porteros");
                    int x = 1;
                    for (int i = myPorteros.size()-1 ; i > myPorteros.size()-4  ; i--) {
                        System.out.println(x + ". "+ myPorteros.get(i).getNombre() + " => " + porcetages[i]);
                        x++;
                    }
                    
                    break;
                case 5:
                    int count = 0;
                    for (int i = 0; i < myExtremos.size(); i++) {
                        if(myExtremos.get(i).calcEfectividad()>85){
                            count++;
                        }
                        
                    }
                    System.out.println("Cantidad de extremos efectivos: " + count);
                    break;
                case 6:
                    running = false;
                    System.out.println("Saliendo del programa");
                    break;
                default:
                System.out.println("No es una opcion valida");
                    break;
            }



            
        }

    myScanner.close();

    }
}
