package org.example.abstratFactory;

public class RelatorioFaturamentoVendaCamisa implements RelatorioFaturamento {

    public String emitir() {
        return "Relatorio de faturamento referente a venda de camisa.";
    }
}
