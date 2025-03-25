package org.example.abstratFactory;

public class RelatorioFaturamentoVendaCalca implements RelatorioFaturamento {
    @Override
    public String emitir() {
        return "Relatorio de faturamento referente a venda de uma calça";
    }
}
