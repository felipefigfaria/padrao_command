package org.example;

public class FecharVenda implements  Tarefa {

    private Venda venda;

    public FecharVenda(Venda venda){
        this.venda = venda;
    }

    public void executar() {
        this.venda.fecharVenda();
    }

    public void cancelar() {
        this.venda.abrirVenda();
    }
}
