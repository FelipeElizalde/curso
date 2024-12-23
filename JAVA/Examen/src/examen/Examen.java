/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examen {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        // TODO: fixme.
        int totalRegistros = Integer.parseInt(br.readLine());
        int registrosPagina = Integer.parseInt(br.readLine());
        int numeroPagina = Integer.parseInt(br.readLine());

        int paginas = totalRegistros / registrosPagina;
        int modulo = totalRegistros % registrosPagina;

        if (modulo > 0) {
            paginas += 1;
        }

        if (numeroPagina > paginas) {
            System.out.println("INVALIDA");
        } else {

            int inicio = ((numeroPagina - 1) * registrosPagina) + 1;
            int fin = (inicio - 1) + registrosPagina > totalRegistros ? totalRegistros : (inicio - 1) + registrosPagina;

            for (int i = inicio; i <= fin; i++) {

                System.out.print(i);
                if (i < fin && i < totalRegistros) {
                    System.out.print(",");
                }

            }
        }
    }
}
