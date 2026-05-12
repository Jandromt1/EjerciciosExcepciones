import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejercicio1{

    public static void main (String[] args) {
    File archivo = new File ("entrada.txt");
    Scanner teclado = null;
    int a, b;
    

    // Modificarlo usando un try-chatch
    try {
            teclado = new Scanner(archivo);
            System.out.println( "Escribe el numero: ");
            a = teclado.nextInt();

            System.out.println( "Escribe el numero: ");
            b = teclado.nextInt();
        
            int resultado = a / b;
            System.out.println("La división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No es posible dividir entre cero.");
        } catch (InputMismatchException e){
            System.out.println ("Entrada no valida");
        }   catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }
        finally{
            if (teclado != null){
                teclado.close(); 
            }
        }
    // Hacer el ejercicio tarea numero 2 de la imagen 11 mayo
    }
}

