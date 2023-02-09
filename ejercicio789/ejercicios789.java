

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.*;
import java.util.Vector;


public class ejercicios789 {


    //Codigo devuelve cadena al reves
    public static class CadenaReves {
        public static void main(String[] args) {
            System.out.println("//Cadena al reves\\");


            Scanner scanner = new Scanner(System.in);
            String texto;
            System.out.println("Introduce un texto");
            texto = scanner.nextLine();

            StringBuilder reves = new StringBuilder(texto);
            texto = reves.reverse().toString();

            System.out.println(texto);
        }

        //Array de Strings mostrando sus valores.

        public static class ArrayBi {
            public static void main(String[] args) {
                System.out.println("-----Array Bi----");

                Integer[][] numeros = {
                    {3, 6, 9},
                    {12, 15, 18}
                };

                for(int i=0; i < numeros.length; i++){
                    for(int y=0; y < numeros[i].length; y++)
                    System.out.println("Fila: " + (i + 1)+ " Columna: " + (y + 1)
                    + "\nEl valor es : " + numeros[i][y] + "\n");

                    
                }
            }
        }
    }

    /*Vector  */

    public static class EjercicioVector {
        public static void main(String[] args) {
            System.out.println("---Vector---");

            Vector vector = new Vector(); 

            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);
           

            System.out.println("Vector antes de borrar: "+ vector);

            vector.remove(2);
            vector.remove(3);

            System.out.println("Vector despues de borrar: " + vector + "Eliminados 2 y 4");
        
        System.out.println("---Respuesta---");
        System.out.println("Se desperdi ia memoria del sistema, porque cuando se sobrepasa duplica la dimension ");
        
        }
        
    }
// ArrayList de tipo String, con 4 elementos

public static class ArrayString {
    public static void main(String[] args) {

        System.out.println("---ArrayString---");


        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Laucha");
        lista.add("Javi");
        lista.add("Tigre");
        lista.add("Leia");

        LinkedList<String> linkedlist = new LinkedList<String>();
        

        for (int i = 0; i < lista.size(); i++) {
            linkedlist.add(i, lista.get(i));
        }

        System.out.println("Elementos del Array:");
        for (String elementos : lista) {
            System.out.print(elementos + " ");
        }

        System.out.println("\n\nElementos de la LinkedList:");
        for (String elementos : linkedlist) {
            System.out.print(elementos + " ");
        }
    }
}

// ArrayList tipo Int 

public static class ArrayInt {

    public static void main(String[] args) {
        System.out.println("---ArrayInt---");

        ArrayList<Integer> lista = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            lista.add(i);

            for (int num = 0; num < lista.size(); num++)
{
    if(lista.get(num) % 2 == 0) {
        lista.remove(num);
    }
}
  }
  System.out.println(lista);
    }
}

    



// InputStream y PrintStream
public static class CopiarFicheros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);
    }

    private static void copiar(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }

}

}




