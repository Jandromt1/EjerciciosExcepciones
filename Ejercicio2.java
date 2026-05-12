import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

         int[] numeros = {10, 20, 30};

         System.out.println("Escribe un índice (de 0 a 2): ");
        int indice = teclado.nextInt();

        try {
            int valor = numeros[indice];
            System.out.println("El valor en el índice " + indice + " es: " + valor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice ingresado no existe en el arreglo.");
        } 
        teclado.close();
    }
}