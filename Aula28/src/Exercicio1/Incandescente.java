package Exercicio1;

public class Incandescente extends FabricaLampada implements Lampada {
    @Override
    public void ligar() {
        System.out.println("Ligando a lâmpada Incandescente...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a lâmpada Incandescente...");
    }
}
