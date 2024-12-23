public class TipoDatos {
    public static void main(String[] args) {
        //Tipos de datos
        //Enteros (Valor por default 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte); //Imprime la cxadena con el nombre de la variable y su valor
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9876543210L;
        System.out.println("tipoLong = " + tipoLong);

        //Punto Flotante (Valor por default 0.0)
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; //D o d para indicar que es tipo Double
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter  (Valor por default '\0000')
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //boolean  (Valor por default false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object (Referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "nombre en cadena";
        System.out.println("nombre = " + nombre);

    }
}
