import java.util.Scanner;

public class act6 {

    public  static  void  main (String arg[]) throws InterruptedException {


        Scanner entrada = new Scanner(System.in);


        int z=0;
      /*  System.out.println("Ingresa la cantidade de datos: ");
        z = Integer.parseInt(entrada.nextLine());
*/
        String nombre;
        int arreglo []=new int[5];



for (int x=0;x<arreglo.length;x++){
    System.out.println("calificacion "+ x );
    arreglo[x]= Integer.parseInt(entrada.nextLine());
        System.out.print(arreglo[x]+"-");
        Thread.sleep(100);

    }

int aux = 0;
        for (int x=0;x<arreglo.length;x++){

            System.out.println("Calificacion"+arreglo[x]);
            aux = aux+arreglo[x] /5;

        }
        System.out.println("calificacion  promedio "+(aux) );

        if (aux<=50 ){
            System.out.println("Calificacion  f");
        }else if (aux>=51 && aux<=60){
            System.out.println("Calificacion  E");
        }else if (aux>=61 && aux<=70){
            System.out.println("Calificacion  D");
        }else if (aux>=71 && aux<=80){
            System.out.println("Calificacion  c");
        }else if (aux>=81 && aux<=90){
            System.out.println("Calificacion  B");
        }else if (aux>=91 && aux<=100){
            System.out.println("Calificacion  a");
        }

}}
