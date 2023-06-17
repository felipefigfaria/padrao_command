package org.example;

public class AberturaVenda implements  Tarefa {

    private Venda venda;

    public AberturaVenda(Venda venda){
        this.venda = venda;
    }

    public void executar() {
        this.venda.abrirVenda();
    }

    public void cancelar() {
        this.venda.fecharVenda();
    }
}