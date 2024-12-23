package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private  int contadorComputadoras;
    private static final int maxComputadoras = 10;

    public Orden (){
        idOrden = ++contadorOrdenes;
        computadoras = new  Computadora[maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora){
        if (contadorOrdenes < maxComputadoras){
            computadoras[contadorComputadoras++]= computadora;
        }
        else{
            System.out.println("Limite maximo de computadoras");
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden # "+ idOrden);
        System.out.println("Computadoras en la orden: ");
        for (int i=0;i<contadorComputadoras;i++){
            System.out.println(computadoras[i]);
        }

    }
}
