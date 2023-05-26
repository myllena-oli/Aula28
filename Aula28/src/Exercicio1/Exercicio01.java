package Exercicio1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        FabricaLampada fabrica = new FabricaLampada();

        System.out.println("Que tipo de lâmpada você quer criar: ");
        System.out.println("1 - Incandescente ou 2 - Fluorescente: ");
        String tipoLampada = ler.nextLine().toLowerCase();

        if (fabrica.construir(tipoLampada) == null) {
            System.out.println("Tipo de lâmpada não encontrado.");

        } else {
            Lampada lampadaConstruida = (Lampada) fabrica.construir(tipoLampada);
            lampadaConstruida.ligar();
            lampadaConstruida.desligar();
        }
    }
}
