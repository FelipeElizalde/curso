package sentenciasdecision;

public class DiaSemanaSwitchMejorado {
    public static void main(String[] args) {
        System.out.println("*** Dia de la Semana con Switch Mejorado Java 12++ ***");

        var dia = 3;
        String nombreDia;

        //De esta forma estamos retornando un valor se puede utilizar imprimiendo directamente el dia
        nombreDia = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Dia Inválido";
        };

        System.out.println(nombreDia);


    }
}
