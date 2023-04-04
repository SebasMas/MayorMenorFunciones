package CursoJava;
import java.util.Scanner;

public class MayorMenorFunciones {
    
    public static void main(String[] args){

        //Usamos el try para cerrar los recursos abiertos que deja el Scanner al ejecutarse
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número: ");
            int numero1 = sc.nextInt();

            System.out.println("Ingrese el segundo número: ");
            int numero2 = sc.nextInt();

            System.out.println("Ingrese el tercer número: ");
            int numero3 = sc.nextInt();

            //Incluímos la función MayorMenor dentro de la ejecución del Scanner para que llame a la misma consecutivamente
            MayorMenor(numero1, numero2, numero3);
            }

        }

    
    //Creamos la función que va a tomar el dato mayor y menos de los 3 números ingresados por teclado
   private static void MayorMenor(int numero1, int numero2, int numero3){
    int mayor = numero1;
    if(numero2 > mayor){
        mayor = numero2;
    } 
    if(numero3 > mayor){
        mayor = numero3;
    }

    System.out.println("El número mayor es: " + mayor);

    int menor = numero1;
    if (numero2 < menor){
        menor = numero2;
    }
    if(numero3 < menor){
        menor = numero3;
    }

    System.out.println("El número menor es: "+menor);
   }
   



}

