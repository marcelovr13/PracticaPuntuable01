import java.util.Scanner;

public class PracticaPuntuable01 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int numeroFuerte = 0;
        System.out.println("Escribe 10 numeros y te dire cuales son los fuertes.");

        for (int i = 0; i <= numeros.length - 1; i++ ){  //Este bucle for esta hecho para asignar los numeros al array.
            numeros[i] = teclado.nextInt();

            if (numeros[i] > numeroFuerte){     // Hacemos un if para saber cual es el numero mas grande del array.
                numeroFuerte = numeros[i];
            }

        }
        for (int i = 0; i <= numeros.length -1; i++ ){      // A continuacion este bucle for muestra los numeros que ha escrito el usuario en el array.
           System.out.print(numeros[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Numero fuerte: " + numeroFuerte);
    }
}
