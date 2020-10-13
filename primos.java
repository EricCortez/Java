import java.util.Scanner;

import static java.lang.Math.sqrt;

public class primos  {


    public static void primo ( int numero ) throws InterruptedException {


        Scanner entrada = new Scanner(System.in);


        System.out.println("primos");
        int cont = 0;
        for (int i = numero; i <= (numero + 100); i++) {
            for (int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    cont = cont + 1;
                }

            }
            if (cont == 2) {
                System.out.print(i+" ");
            }
            cont = 0;
        }

    }
    public static int fibonacciRecursivo(int n) {


        if (n<=0 ) {
            return 0;

        } else if (n == 1) {
            return 1;
        } else {

            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }

    }


    public static void main(String args[]) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa un numero para saber si es primo o no  ");
        int x = entrada.nextInt();

        primo(x);

        System.out.println("fibonacci ");



        for (int i = x; i <= 100; i++) {

            System.out.print(fibonacciRecursivo(i)+"  ");
        }

    }
}





