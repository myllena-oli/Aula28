package Exercicio2;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca poupanca = new ContaPoupanca(123,"Marcella","01234567890",200 );
        ContaCorrente corrente = new ContaCorrente(456,"Luana", "23456789012",150);
        SeguroDeVida seguraVida = new SeguroDeVida(789,"Teresa", "34567890123", 180);

        System.out.printf("O imposto da poupança é: R$%.2f\n",poupanca.calcularTributo(poupanca.getSaldo()));
        System.out.printf("O imposto da conta corrente é: R$%.2f\n", corrente.calcularTributo(corrente.getSaldo()));
        System.out.printf("O imposto do Seguro de Vida é: R$%.2f\n", seguraVida.calcularTributo(seguraVida.getSaldo()));

    }
}
