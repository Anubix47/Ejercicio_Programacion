package polinomio_cuarto_grado;
/*
 *@Brian Castellanos Placencia
 */

import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String []Args){
        int x; //Variable a evaluar
        int resultado; //Variable para obtener el resultado

        //Ingresar el valor de la variable
        System.out.println("Calcular el polinomio de grado cuatro");
        System.out.print("\nInserta el valor de X: ");
        x = entrada.nextInt();

        //Crear los objetos de cada operacion
        Potencia_cuarta potenciaCuarta = new Potencia_cuarta(x);
        Potencia_cubica potenciaCubica = new Potencia_cubica(x);
        Potencia_cuadrada potenciaCuadrada = new Potencia_cuadrada(x);
        Termino_lineal terminoLineal = new Termino_lineal(x);
        Termino_constante terminoConstante = new Termino_constante();

        //Obtener el resultado de la operacion
        resultado = potenciaCuarta.getPotencia_cuarta()
                + potenciaCubica.getPotencia_cubica()
                + potenciaCuadrada.getPotencia_cuadrada()
                + terminoLineal.getTermino_lineal()
                + terminoConstante.getConstante();

        //Mostrar el resultado de la operacion
        System.out.println("El resultado del polinomio de cuarto grado con la variable "+ x + " es: "+ resultado);



    }
}
