public class NumeroFlotanteBlancoVargas {

    public static void main (String args[]){

        //Distintas formas de manejar el tipo de dato float para mostrar lo solicitado.

        //Widening casting it's an automatic process
        //Haciendo widining el proceso es automatico,
        //el motivo, se debe a que se cambia de un tipo de dato entero a tipo float
        int numero1 = 10;
        double numero2 = numero1;

        //Narrowing casting it's a manually process
        //Haciendo narrowing se debe hacer manualmente,
        //el motivo, se desea pasar de un tipo de dato float a entero.
        double numero3 = 37.39d;
        int numero4 = (int) numero3;
        System.out.println("Widining cating");
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println("");
        System.out.println("Narrowing casting");
        System.out.println(numero3);
        System.out.println(numero4);
    }

}
