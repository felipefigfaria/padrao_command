package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaixaTest {

    Caixa caixa;
    Venda venda;

    @BeforeEach
    public void setUp() {
        caixa = new Caixa();
        venda = new Venda (2021, 100.0);
    }

    @Test
    public void deveAbrirVenda(){
        Tarefa aberturaVenda = new AberturaVenda(venda);
        caixa.executarTarefa(aberturaVenda);

        assertEquals("venda aberta", venda.getSituacao());
    }

    @Test
    public void deveFecharVenda(){
        Tarefa fecharVenda = new FecharVenda(venda);
        caixa.executarTarefa(fecharVenda);

        assertEquals("venda fechada", venda.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Tarefa aberturaVenda = new AberturaVenda(venda);
        Tarefa fecharVenda = new FecharVenda(venda);

        caixa.executarTarefa(aberturaVenda);
        caixa.executarTarefa(fecharVenda);

        caixa.cancelarUltimaTarefa();

        assertEquals("venda aberta", venda.getSituacao());
    }




}