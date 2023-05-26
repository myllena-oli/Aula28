package Exercicio1;

public class Fluorescente extends FabricaLampada implements Lampada {
    @Override
    public void ligar() {
        System.out.println("Ligando a lâmpada Fluorescente...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a lâmpada Fluorescente...");
    }
}
