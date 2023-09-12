package br.com.alura.desafioFinal.principal;

import br.com.alura.desafioFinal.modelos.CartaoDeCredito;
import br.com.alura.desafioFinal.modelos.Compras;

import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Scanner valorDoTeclado = new Scanner(System.in);

        System.out.println("Digite o limite do cartão: ");
        double limiteDocartao = valorDoTeclado.nextDouble();

        CartaoDeCredito cartaoDoVitor = new CartaoDeCredito(limiteDocartao);

        int sair = 1;
        while (sair != 0) {

            System.out.println("Digite a descrição do produto: ");
            String description = valorDoTeclado.next();

            System.out.println("Digite o Valor da compra");
            double valor = valorDoTeclado.nextDouble();

            Compras compraDoVitor = new Compras(description, valor);

            boolean compraRealizadda = cartaoDoVitor.incluirCompra(compraDoVitor);

            if (compraRealizadda) {
                System.out.println("Compra realizada!!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = valorDoTeclado.nextInt();
            } else {
                sair = 0;
            }
        }

        List<Compras> listaDeCompras = cartaoDoVitor.getListaDeCompras();

        System.out.println("*******************************************");
        System.out.println("COMPRAS REALIZADAS: ");
        Collections.sort(listaDeCompras);

        for (Compras compra : listaDeCompras) {
            System.out.println(compra.getDescricao() + " - " + compra.getValor());
        }
        System.out.println("*******************************************");
        System.out.println("\nSaldo do cartão: " + cartaoDoVitor.getSaldo());

    }
}
