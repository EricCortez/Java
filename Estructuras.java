import java.util.Iterator;

public class Estructuras {

// desarrollan un codigo que implemente 5 clases cada una con un estructura de
    //control diferente, que implemente constructor, get, set, y la estructura tal.
    // seran invocados desde el main con instancias individuales.



    public int getNumero1() {
        return numero1;

    }


    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    private  int numero1;

    public Estructuras( int numero1) {

        this.numero1 = numero1;
    }

    public Estructuras() {

    }

    public void IF(boolean b){
        if (b)
            System.out.println("ciclo if cumple sentencia");
else
            System.out.println("ciclo if no cumple sentencia");

    }

    public void FoRR(int a){
        for (a=0;a<11;a++){
            System.out.println("ciclo for corrida"+a);
        }


    }

    public  void  Dw (int numero1){
        do {
            System.out.println("ciclo do while" + numero1);
numero1++;
        }while (numero1<=20);

    }

    public  void  w (int numero1){
        while (numero1<=20) {
            System.out.println("ciclo do while" + numero1);
            numero1++;
        }

    }

    public void sw(int numero1){

        switch (numero1){
            case 1:
                System.out.println("ciclo switch caso"+numero1);

                break;

            case 2:
                System.out.println("ciclo switch caso"+ numero1);
                break;
            default:
                System.out.println("ciclo switch caso no existente ");
        }
    }

}
