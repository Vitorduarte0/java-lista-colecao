package br.com.alura.desafioFinal.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compras> listaDeCompras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public boolean incluirCompra(Compras compra) {
        if (compra.getValor() > this.saldo) {
            System.out.println("Saldo insuficiente!");
            return false;
        } else {
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getListaDeCompras() {
        return listaDeCompras;
    }
}
