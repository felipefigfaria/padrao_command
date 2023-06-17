package org.example;

public class Venda {

    private Integer id;
    private Double valor;
    private String situacao;

    public Venda(Integer id, Double valor) {
        this.id = id;
        this.valor = valor;
    }

    public void abrirVenda() {
        this.situacao = "venda aberta";
    }

    public void fecharVenda() {
        this.situacao = "venda fechada";
    }

    public String getSituacao() {
        return situacao;
    }
}
