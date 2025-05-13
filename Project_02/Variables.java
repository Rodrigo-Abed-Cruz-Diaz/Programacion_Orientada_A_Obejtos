public class Variables {
    public static void main(String[] args) {
        //Variables primitivas
        int numero1=10;
        double numero2;//Puede requerir colocar d o D al final del número 
        numero2=3.14;
        float numero3;//Requiere letra f o F al final del número 
        numero3=3.14159F;
        char caracter1='A', caracter2=65;
        boolean opcion=true;
        long numero4;//Puede requerir l o L al final de número 
        numero4=987654321L;
        byte numero5=126;
        short numero6=128;
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        System.out.println(numero6);
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(opcion);

        //Variables de referencia
        String mensaje, mensaje2;
        mensaje="Esto es un mensaje";
        mensaje2="""
                Este
                es
                un
                mensaje
                multilinea
                """;
        System.out.println(mensaje);
        System.out.println(mensaje2);
        System.out.println(mensaje+' '+numero1);//Para concatenar y dejar un espacio dejamos un ' '
        System.out.println(mensaje.toUpperCase());
        String numero1_string=Integer.toString(numero1);
        System.out.println(mensaje.concat(numero1_string));

        //Variable general
        var variable1=15L;
        var variable2='F';
        var variable3=2.8754F;

        final var PI=3.14159;//Sintaxis para definir constantes

        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(PI);
    }
}