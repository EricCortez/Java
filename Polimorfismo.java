public class Polimorfismo {

    private int numero1;
    private int numero3;
    private int numero2;

    public Polimorfismo(int numero1, int numero2,int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3=numero3;
    }


    public void AreaTriangulo(){
        numero3=(numero1*numero2)/2;

        System.out.println( "Area de triangulo " +numero3);

    }

    public void AreaCuadrado(){
        numero3=(numero1*numero1);
        System.out.println( "Area de cuadrado "+numero3);

    }

    public void Arearectangulo(){

    numero3=(numero1*numero2);

    System.out.println( " Area del rectangulo "+numero3);
    }
}
