package org.example.abstratFactory;

public class RelatorioFaturamentoVendaCasaco implements RelatorioFaturamento {
    @Override
    public String emitir() {
        return "Relatorio de faturamento referente a venda de um casaco.";
    }
}
